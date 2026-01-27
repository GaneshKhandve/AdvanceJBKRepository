package com.tka_21jan_homework1;




import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Product> product_Menu = new ArrayList<>();

        product_Menu.add(new Product(1, "Chiken Birayani", 250));
        product_Menu.add(new Product(2, "Veg Thali", 300));
        product_Menu.add(new Product(3, "Chiken Thali", 350));
        product_Menu.add(new Product(4, "Chiken Tikka Pizza", 540));
        product_Menu.add(new Product(5, "Chiken Roll", 250));

        System.out.println("Product Menu Card is Created");

        Customer customer1 = new Customer(1, "Ganesh Khandve", 7558320121l, "Hadpsar ,Pune");

        System.out.println("One Customer is created");

        List<Product> customer_prod_list = new ArrayList<>();
        customer_prod_list.add(product_Menu.get(2));
        customer_prod_list.add(product_Menu.get(3));

        System.out.println("customer selected product from menu card");

        System.out.println(customer1);
        System.out.println("Customer details are shown");

        Orders orders = new Orders(1001,customer1,customer_prod_list);
        Bill.printBill(orders);

    }
}
