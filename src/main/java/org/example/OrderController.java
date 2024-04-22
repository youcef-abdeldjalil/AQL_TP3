package org.example;

public class OrderController {
    OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    public void  createOrder(Order order){
        orderService.createOrder(order);
    }
}
