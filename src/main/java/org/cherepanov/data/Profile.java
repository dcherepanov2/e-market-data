package org.cherepanov.data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String phone;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private LocalDateTime birthDay;

}
