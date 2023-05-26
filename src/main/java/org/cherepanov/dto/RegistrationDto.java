package org.cherepanov.dto;

import lombok.Data;

@Data
public class RegistrationDto {

    private String name;

    private char[] password;

    private String phone;

    private String email;
}
