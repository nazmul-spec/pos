package com.pos.api.auth;

public class JwtResponse {
    public String token;

    public JwtResponse(String token) {
        this.token = token;
    }
}
