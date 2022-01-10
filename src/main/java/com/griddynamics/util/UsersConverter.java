package com.griddynamics.util;

import com.griddynamics.dto.UsersDTO;
import com.griddynamics.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsersConverter {

    private final PasswordEncoder passwordEncoder;

    public User fromUsersDtoToUsers(UsersDTO usersDto) {
        User user = new User();
        user.setEmail(usersDto.getEmail());
        user.setPassword(passwordEncoder.encode(usersDto.getPassword()));

        return user;
    }

    public UsersDTO fromUsersToUsersDto(User user) {
        return UsersDTO.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
}