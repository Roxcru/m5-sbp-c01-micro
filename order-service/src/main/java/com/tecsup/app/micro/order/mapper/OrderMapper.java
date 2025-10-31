package com.tecsup.app.micro.order.mapper;

import com.tecsup.app.micro.order.User.User;
import com.tecsup.app.micro.order.dto.Order;
import com.tecsup.app.micro.order.dto.OrderItem;
import com.tecsup.app.micro.order.entity.OrderEntity;
import com.tecsup.app.micro.order.entity.OrderItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    default Order toDomainItem(OrderEntity entity, List<OrderItem> listOrderItem, User user){
        Order order = toDomain(entity);
        order.setListOrderItem(listOrderItem);
        order.setCreatedByUser(user);
        return order;
    };

    Order toDomain(OrderEntity entity);

    OrderItem toDomain(OrderItemEntity entity);

    List<OrderItem> toDomain(List<OrderItemEntity> entities);
}
