package com.tecsup.app.micro.order.dto;

import com.tecsup.app.micro.order.User.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private Long id;
    private String orderNumber;
    private User createdByUser;
    private String status;
    private Double totalAmount;
    private List<OrderItem> listOrderItem;
}
