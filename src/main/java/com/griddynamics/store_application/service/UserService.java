package com.griddynamics.store_application.service;

import com.griddynamics.store_application.dto.UsersDTO;
import com.griddynamics.store_application.entity.User;
import com.griddynamics.store_application.exception.ExistingUserException;
import com.griddynamics.store_application.repository.UserRepository;
import com.griddynamics.store_application.util.UsersConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersConverter usersConverter;
    private final UserRepository userRepository;

    public User save(UsersDTO usersDTO) {
        if (verifyUserExists(usersDTO.getEmail())) {
            throw new ExistingUserException("User exists");
        }
        User user = usersConverter.fromUsersDtoToUsers(usersDTO);
        return userRepository.save(user);
    }

    private boolean verifyUserExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}
