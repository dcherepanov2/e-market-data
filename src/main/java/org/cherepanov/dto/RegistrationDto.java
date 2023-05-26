package org.cherepanov.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RegistrationDto implements Serializable {

    private String name;

    private char[] password;

    private String phone;

    private String email;

    public byte[] getPassword() {
        // Преобразование char[] в byte[]
        if (password != null) {
            byte[] passwordBytes = new byte[password.length];
            for (int i = 0; i < password.length; i++) {
                passwordBytes[i] = (byte) password[i];
            }
            return passwordBytes;
        }
        throw new NullPointerException("Поле пароля пусто");
    }

    public void setPassword(byte[] password) {
        // Преобразование byte[] в char[]
        if (password != null) {
            char[] passwordChars = new char[password.length];
            for (int i = 0; i < password.length; i++) {
                passwordChars[i] = (char) password[i];
            }
            this.password = passwordChars;
        } else {
            this.password = null;
        }
    }

    @Override
    public String toString() {
        return "RegistrationDto{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
