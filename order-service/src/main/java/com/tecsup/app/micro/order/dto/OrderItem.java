package com.tecsup.app.micro.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderItem {
    private Long id;
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
    private Double unitPrice;
    private Double subTotal;
}
