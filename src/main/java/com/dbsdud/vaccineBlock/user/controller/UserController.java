package com.dbsdud.vaccineBlock.user.controller;

import com.dbsdud.vaccineBlock.user.dao.UserFindDao;
import com.dbsdud.vaccineBlock.user.domain.User;
import com.dbsdud.vaccineBlock.user.dto.SignUpRequest;
import com.dbsdud.vaccineBlock.user.dto.UserProfileUpdate;
import com.dbsdud.vaccineBlock.user.dto.UserResponse;
import com.dbsdud.vaccineBlock.user.service.UserProfileService;
import com.dbsdud.vaccineBlock.user.service.UserSignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserSignUpService userSignUpService;
    private final UserFindDao userFindDao;
    private final UserProfileService userProfileService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public UserResponse create(@RequestBody @Valid final SignUpRequest dto) {
        final User user = userSignUpService.doSignUp(dto);
        return new UserResponse(user);
    }

    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable long id) {
        return new UserResponse(userFindDao.findById(id));
    }

    @PutMapping("/{id}/profile")
    public void updateProfile(@PathVariable long id, @RequestBody @Valid final UserProfileUpdate dto) {
        userProfileService.update(id, dto);
    }

}
