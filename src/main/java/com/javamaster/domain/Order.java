package com.javamaster.domain;

import java.util.Objects;

public class Order {
    private Integer id;
    private String title;
    private Double price;

    public Order() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int result=1;
        result = 31*result+(id==null? 0 : id.hashCode());
        result = 31*result+(price==null? 0 : price.hashCode());
        result = 31*result+(title==null? 0 : title.hashCode());
        return result;
//        return Objects.hash(id, price, title);  // или так  можно получить хэш код объекта с полями
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || this.getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Order order2 = (Order) obj;

        return (this.id == order2.id?
                (this.price == order2.price?
                        (this.title.equals(order2.title)? true :false) :false) :false
                );
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

}
