package com.tecsup.app.micro.order.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "order_number", length = 50)
    private String orderNumber;

    @Column(name = "user_id")
    private Integer userId;

    private String status;

    @Column(name = "total_amount")
    private Double totalAmount;
}
