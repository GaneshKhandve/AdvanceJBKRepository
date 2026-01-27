package com.user;

import com.controller.EmployeeController;
import com.entity.Employee;

import java.util.List;

public class Employee_App {
    public static void main(String[] args) {
        System.out.println("/n*********Welcome to Employee Management App ****************");
        System.out.println("Display All Employee Details ");
        EmployeeController ec = new EmployeeController();
        List<Employee> allEmployeeDetails = ec.getAllEmployeeDetails();
        allEmployeeDetails.forEach(System.out::println);

        System.out.println("Display all Employee details of By Department");

        String department = "IT";
        List<Employee> employeeListByDepartment = ec.getAllEmployeeDetailsByDepartment(department);
        employeeListByDepartment.forEach(System.out::println);



        int emp_id = 1;
        System.out.println("Display Employee Details By emp Id " +emp_id);
        List<Employee> employeesById = ec.getEmployeeById(emp_id);
        employeesById.forEach(System.out::println);

        String name = "Rahul";
        System.out.println("Display Employee Details By Name " +name);
        List<Employee> employeesByName = ec.getEmployeeByName(name);
        employeesByName.forEach(System.out::println);



        String name2 = "Rahul";
        System.out.println("Display Employee Details By Name Using Stream Api " + name2);
        List<Employee> employeesByName2 = ec.getEmployeeByNameusingStreamApi(name2);
        employeesByName2.forEach(System.out::println);

        int exp = 2;
        List<Employee> expMoreThan2 = ec.getEmployeeDetailsByExpMoreThan2(exp);
        long count  = expMoreThan2.stream().count();
        System.out.println("Display Employee Details More Than experience " +exp+ " the count is "+ count);
        expMoreThan2.forEach(System.out::println);



        System.out.println("Employee Details of Highest salary ");
        List<Employee> higestSalary = ec.getEmployeeByHigestSalary();
        higestSalary.forEach(System.out::println);

        System.out.println("Employee Details of High experience ");
        List<Employee> higeexp = ec.getEmployeeByHigestExp();
        higeexp.forEach(System.out::println);

        int emp_Id =2;
        int salary = 50000;
        System.out.println("Update the Salary of Employee by Emp Id " + emp_Id);
        boolean update = ec.updateSalaryById(emp_Id,salary);
        if (update){
            System.out.println("Employee Salary Updated Successfully  " + emp_Id);
        }
        else {
            System.out.println("Employee  Salary  Not Updated Successfully" + emp_Id);
        }

        int Emp_Id3 = 12;
        System.out.println("Delete Employee Details by Employee Id " + Emp_Id3);

        boolean delete = ec.deletePlayerById(Emp_Id3);
        if (delete){
            System.out.println("Employee details deleted Successfully  " + Emp_Id3);
        }
        else {
            System.out.println("Employee details Not deleted Successfully Because Employee Id  is not Present" + Emp_Id3);
        }




        System.out.println("****Thanks for using Our App ********************");

    }
}
