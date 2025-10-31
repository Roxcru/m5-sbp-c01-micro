package com.tecsup.app.micro.order.repository;

import com.tecsup.app.micro.order.dto.OrderItem;
import com.tecsup.app.micro.order.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Long> {

    List<OrderItemEntity> findByOrderId(Integer orderId);
}
