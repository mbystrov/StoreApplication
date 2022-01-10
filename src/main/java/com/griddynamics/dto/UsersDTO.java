package com.griddynamics.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsersDTO {

    private String email;
    private String password;
}
