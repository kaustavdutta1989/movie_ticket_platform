package com.riko.user.auth.service;

import com.riko.user.auth.dto.AuthenticationRequest;
import com.riko.user.auth.dto.AuthenticationResponse;
import com.riko.user.auth.dto.RegisterRequest;
import com.riko.user.config.JwtService;
import com.riko.user.auth.model.User;
import com.riko.user.auth.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        var requestUser = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .passcode(passwordEncoder.encode(request.getPassword()))
                .role(request.getRole())
                .build();
        User createdUser = userRepository.save(requestUser);
        var jwtToken = jwtService.generateToken(createdUser);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var userFound = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new UsernameNotFoundException("user not found"));
        var jwtToken = jwtService.generateToken(userFound);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
