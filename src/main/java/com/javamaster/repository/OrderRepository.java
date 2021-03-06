package com.javamaster.repository;

import com.javamaster.domain.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);

    void delete(Order order);

    Order getById(Integer id);

    List<Order> getAll();

}
