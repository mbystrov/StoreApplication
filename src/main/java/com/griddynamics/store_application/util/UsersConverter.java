package com.griddynamics.store_application.util;

import com.griddynamics.store_application.dto.UsersDTO;
import com.griddynamics.store_application.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsersConverter {

    private final PasswordEncoder passwordEncoder;

    public User convertToEntity(UsersDTO usersDto) {
        User user = new User();
        user.setEmail(usersDto.getEmail());
        user.setPassword(passwordEncoder.encode(usersDto.getPassword()));

        return user;
    }

    public UsersDTO convertToDto(User user) {
        return UsersDTO.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
}