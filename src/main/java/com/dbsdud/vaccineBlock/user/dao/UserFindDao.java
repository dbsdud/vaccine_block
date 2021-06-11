package com.dbsdud.vaccineBlock.user.dao;

import com.dbsdud.vaccineBlock.user.domain.User;
import com.dbsdud.vaccineBlock.user.exception.PhoneNotFoundException;
import com.dbsdud.vaccineBlock.user.exception.UserNotFoundException;
import com.dbsdud.vaccineBlock.user.model.Phone;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserFindDao {
    private final UserRepository userRepository;

    public User findById(final Long id) {
        final Optional<User> user = userRepository.findById(id);
        user.orElseThrow(() -> new UserNotFoundException(id));
        return user.get();
    }

    public User findByPhone(final Phone phone) {
        final Optional<User> user = userRepository.findByPhone(phone);
        user.orElseThrow(() -> new PhoneNotFoundException(phone.getValue()));
        return user.get();
    }
}
