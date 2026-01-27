package com.dao;

import com.dbconnection.EmpDbConnection;
import com.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    String query = "";
    List<Employee> employeeList = new ArrayList<>();
    public List<Employee> getAllEmployeeDetails() {
       employeeList = new ArrayList<>();
        try {
            con = EmpDbConnection.getEmpDbConnection();
            query = "Select * From employee";
            st = con.prepareStatement(query);

            rs = st.executeQuery();
            while (rs.next()){
                Employee employee = new Employee();
                employee.setEmp_id(rs.getInt(1));
                employee.setEmp_name(rs.getString(2));
                employee.setDepartment(rs.getString(3));
                employee.setSalary(rs.getInt(4));
                employee.setAge(rs.getInt(5));
                employee.setExperience(rs.getInt(6));

                employeeList.add(employee);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return employeeList;

    }

    public boolean updateSalaryById(int empId, int salary) {
        try {
            con = EmpDbConnection.getEmpDbConnection();
            query = "update employee set salary =? where emp_id= ? ";
            st = con.prepareStatement(query);
            st.setInt(1,salary);
            st.setInt(2,empId);

            int ack  = st.executeUpdate();
            if (ack > 0){
                return true;

            }

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


        return false;


    }

    public boolean deletePlayerById(int empId3) {
        try {
            con = EmpDbConnection.getEmpDbConnection();
            query = "Delete from employee where emp_id= ? ";
            st = con.prepareStatement(query);
            st.setInt(1,empId3);

            int ack  = st.executeUpdate();
            if (ack > 0){
                return true;

            }

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


        return false;
    }
}
