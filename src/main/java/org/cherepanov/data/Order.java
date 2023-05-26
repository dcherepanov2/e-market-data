package org.cherepanov.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Order {

    public Order() {

    }
    public Order(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private LocalDateTime createDate;

    private LocalDateTime completeDate;

    private Product product;

    private User user;


}
