package com.matias.msauthservice.domain;

import com.matias.msauthservice.enums.Role;
import lombok.Data;

@Data
public class RegisterRequest {

    private String username;
    private String email;
    private String password;
    private Role role;

}
