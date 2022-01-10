package com.griddynamics.store_application.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsersDTO {

    private String email;
    private String password;
}
