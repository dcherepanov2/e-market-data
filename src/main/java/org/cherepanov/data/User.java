package org.cherepanov.data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

public class User {

    public User(LocalDateTime createDate, char[] password) {
        this.createDate = createDate;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Getter
    private final LocalDateTime createDate;

    @Getter
    @Setter
    private Profile profile;

    @Getter
    @Setter
    private List<Order> orders;

    @Setter
    private char[] password;

}
