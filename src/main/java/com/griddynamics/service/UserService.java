package com.griddynamics.service;

import com.griddynamics.dto.UsersDTO;
import com.griddynamics.entity.User;
import com.griddynamics.exception.ExistingUserException;
import com.griddynamics.repository.UserRepository;
import com.griddynamics.util.UsersConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersConverter usersConverter;
    private final UserRepository userRepository;

    public User save(UsersDTO usersDTO) {
        if (verifyUserExists(usersDTO.getEmail())) {
            throw new ExistingUserException();
        }
        User user = usersConverter.fromUsersDtoToUsers(usersDTO);
        return userRepository.save(user);
    }

    private boolean verifyUserExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}
