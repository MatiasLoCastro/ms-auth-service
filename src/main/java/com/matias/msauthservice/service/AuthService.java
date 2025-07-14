package com.matias.msauthservice.service;

import com.matias.msauthservice.domain.AuthRequest;
import com.matias.msauthservice.dto.UserDto;
import com.matias.msauthservice.model.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public interface AuthService {

    public Mono<User> register(UserDto userDto);

    public Mono<User> login(AuthRequest authRequest);

}
