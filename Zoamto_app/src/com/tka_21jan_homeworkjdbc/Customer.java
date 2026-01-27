package com.tka_21jan_homeworkjdbc;

public class Customer {
    int id;
    String name;
    long mob;
    String address;



    public Customer(int id, String name, long mob, String address) {
        this.id = id;
        this.name = name;
        this.mob = mob;
        this.address = address;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMob() {
        return mob;
    }

    public void setMob(long mob) {
        this.mob = mob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mob=" + mob +
                ", address='" + address + '\'' +
                '}';
    }
}
