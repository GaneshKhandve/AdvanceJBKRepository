package com.tka_21jan_homeworkjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainApp {
    public static void main(String[] args) throws Exception {

        List<Product> menu_List = new ArrayList<>();

        Connection con = DBUtil.getConnection();

//        Customer customer = new Customer(
//                1, "Ganesh", 9876543210L, "Pune"
//        );

       // CustomerDAO customerDAO = new CustomerDAO();
       // customerDAO.saveCustomer(customer);

        String sqlQuery = "SELECT * FROM batch1297_db.product";
        String sqlQuery2 = "SELECT * FROM batch1297_db.customer";

        PreparedStatement ps = con.prepareStatement(sqlQuery);
        PreparedStatement ps2= con.prepareStatement(sqlQuery2);

        ResultSet resultSet = ps.executeQuery();
        ResultSet resultSet2 = ps2.executeQuery();

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            double price = resultSet.getDouble(3);

            Product product = new Product(id,name,price);
            menu_List.add(product);

        }

        System.out.println("Products is added in MENU List");

        System.out.println("Customer Details are Shown : ");

        while ( resultSet2.next()){
             int id = resultSet2.getInt(1);
             String name = resultSet2.getString(2);
              long mob = resultSet2.getLong(3);
              String address = resultSet2.getString(4);

            System.out.println("Customer Name = "+ name);
            System.out.println("Customer Mob = "+ mob);
            System.out.println("Customer Address = "+ address);


        }


        System.out.println("Customer Selected Product list ");
        List<Product> customer_Product = new ArrayList<>();
        customer_Product.add(menu_List.get(2));
        customer_Product.add(menu_List.get(3));


        customer_Product.forEach(System.out::println);
        double total_Bill =0;
        System.out.println("Customer Order Product Name and Price :--> ");
        for (Product product : customer_Product){
            total_Bill+=product.getPrice();
            System.out.print(product.getName() +" , " + product.getPrice()+" ");
        }
        System.out.println("\n==========  Total BILL ==========");
        System.out.println("Total Bill Is : " +total_Bill);

        ps.close();
        ps2.close();
        resultSet.close();
        resultSet2.close();
        con.close();




    }
}
