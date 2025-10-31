package com.tecsup.app.micro.order.controller;

import com.tecsup.app.micro.order.dto.Order;
import com.tecsup.app.micro.order.dto.OrderItem;
import com.tecsup.app.micro.order.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/orderItems")
public class OrderItemController {
    private  final OrderService orderService;

    @GetMapping("/{id}")
    public ResponseEntity<OrderItem> getOrderItemsById(@PathVariable Long id){
        log.info("REST request to get Order by id: {}", id);
        return ResponseEntity.ok(orderService.getOrderItemById(id));
    }
}
