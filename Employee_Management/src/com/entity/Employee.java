package com.entity;

public class Employee {
    private int emp_id;
    private String emp_name;
    private String department;
    private int salary;
    private int age;
    private int experience;

    public Employee() {
    }

    public Employee(int emp_id, String emp_name, String department, int salary, int age, int experience) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.experience = experience;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
