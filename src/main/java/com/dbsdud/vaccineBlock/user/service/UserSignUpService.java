package com.dbsdud.vaccineBlock.user.service;

import com.dbsdud.vaccineBlock.user.dao.UserRepository;
import com.dbsdud.vaccineBlock.user.domain.User;
import com.dbsdud.vaccineBlock.user.dto.SignUpRequest;
import com.dbsdud.vaccineBlock.user.exception.PhoneDuplicateException;
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
