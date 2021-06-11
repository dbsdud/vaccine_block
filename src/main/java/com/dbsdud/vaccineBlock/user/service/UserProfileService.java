package com.dbsdud.vaccineBlock.user.service;

import com.dbsdud.vaccineBlock.user.dao.UserFindDao;
import com.dbsdud.vaccineBlock.user.domain.User;
import com.dbsdud.vaccineBlock.user.dto.UserProfileUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserProfileService {
    private final UserFindDao userFindDao;

    public User update(final long userId, final UserProfileUpdate dto) {
        final User user = userFindDao.findById(userId);
        user.updateProfile(dto.getName());
        return user;
    }
}
