package com.pranay.example.SpringJWT.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JWTRequest {

    private String email;
    private String password;

}
