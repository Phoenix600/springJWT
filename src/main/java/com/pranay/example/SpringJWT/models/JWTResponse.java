package com.pranay.example.SpringJWT.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JWTResponse {
    private String username;
    private String jwtToken;
}
