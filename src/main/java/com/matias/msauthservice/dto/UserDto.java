package com.matias.msauthservice.dto;

import com.matias.msauthservice.enums.Role;

import java.io.Serializable;

public class UserDto implements Serializable {

    private String username;
    private String email;
    private Role role;


}
