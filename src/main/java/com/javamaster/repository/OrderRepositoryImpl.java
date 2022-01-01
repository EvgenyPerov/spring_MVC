package com.javamaster.repository;

import com.javamaster.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {
private List<Order> orders = new ArrayList<>();

    public OrderRepositoryImpl(){
        Order order = new Order();
        order.setId(0);
        order.setPrice(234d);
        order.setTitle("Pizza peperoni");
        Order order2 = new Order();
        order2.setId(1);
        order2.setPrice(123d);
        order2.setTitle("Sushi Philadelfia");
        orders.add(order);
        orders.add(order2);
    }

    @Override
    public void save(Order order) {
        orders.add(order);
    }

    @Override
    public void delete(Order order) {
    orders.remove(order);
    }

    @Override
    public Order getById(Integer id) {
        return orders.get(id);
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }
}
