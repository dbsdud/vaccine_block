package com.dbsdud.vaccine.user.service;

import com.dbsdud.vaccine.user.dao.UserRepository;
import com.dbsdud.vaccine.user.domain.User;
import com.dbsdud.vaccine.user.dto.SignUpRequest;
import com.dbsdud.vaccine.user.exception.PhoneDuplicateException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserSignUpService {
    private final UserRepository userRepository;

    public User doSignUp(final SignUpRequest dto) {
        if(userRepository.existsByPhone(dto.getPhone())) {
            throw new PhoneDuplicateException(dto.getPhone());
        }

        return userRepository.save(dto.toEntity());
    }
}
