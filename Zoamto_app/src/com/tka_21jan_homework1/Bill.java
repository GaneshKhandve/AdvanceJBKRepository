package com.tka_21jan_homework1;

public class Bill {
    public static double calculateTotal(Orders order) {
        double total = 0;
        for (Product p : order.getProducts()) {
            total += p.getPrice();
        }
        return total;
    }

    public static void printBill(Orders order) {

        System.out.println("\n========== BILL ==========");
        System.out.println("Order ID : " + order.getOrder_Id());
        System.out.println("Customer : " + order.getCustomer_details().getName());
        System.out.println("Mobile   : " + order.getCustomer_details().getMob());
        System.out.println("Address  : " + order.getCustomer_details().getAddress());

        System.out.println("\nProducts:");
        for (Product p : order.getProducts()) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }

        double total = calculateTotal(order);
        System.out.println("\nTotal Amount = ₹" + total);
        System.out.println("==========================");
    }
}
