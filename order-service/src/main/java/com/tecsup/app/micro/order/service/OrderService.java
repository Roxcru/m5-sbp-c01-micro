package com.tecsup.app.micro.order.service;

import com.tecsup.app.micro.order.User.User;
import com.tecsup.app.micro.order.User.UserClient;
import com.tecsup.app.micro.order.dto.Order;
import com.tecsup.app.micro.order.dto.OrderItem;
import com.tecsup.app.micro.order.entity.OrderEntity;
import com.tecsup.app.micro.order.entity.OrderItemEntity;
import com.tecsup.app.micro.order.mapper.OrderMapper;
import com.tecsup.app.micro.order.repository.OrderItemRepository;
import com.tecsup.app.micro.order.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final OrderMapper mapper;
    private final UserClient userClient;

    public Order getOrderById(long id){
        OrderEntity entity = orderRepository.findById(id).orElse(null);

        List<OrderItem> listOrderItem = mapper.toDomain(orderItemRepository
                .findByOrderId(entity.getId().intValue()));

        User user = userClient.getUserById(entity.getUserId().longValue());

        return mapper.toDomainItem(entity, listOrderItem, user);
    }

    public OrderItem getOrderItemById(long id){
        OrderItemEntity entity = orderItemRepository.findById(id).orElse(null);
        return mapper.toDomain(entity);
    }
}
