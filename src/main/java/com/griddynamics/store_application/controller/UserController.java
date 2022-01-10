package com.griddynamics.store_application.controller;

import com.griddynamics.store_application.dto.UsersDTO;
import com.griddynamics.store_application.entity.User;
import com.griddynamics.store_application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/create")
    public User create(@RequestBody UsersDTO usersDTO) {
        return userService.save(usersDTO);
    }

//    @PostMapping(value = "auth")
//    public
}
