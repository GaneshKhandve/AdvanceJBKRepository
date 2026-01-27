package com.tka_21jan_homework1;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    int order_Id;
    Customer customer_details;

    List<Product> products ;

    public Orders(int order_Id, Customer customer_details, List<Product> products) {
        this.order_Id = order_Id;
        this.customer_details = customer_details;
        this.products = products;
    }

    public int getOrder_Id() {
        return order_Id;
    }

    public Customer getCustomer_details() {
        return customer_details;
    }

    public List<Product> getProducts() {
        return products;
    }

}
