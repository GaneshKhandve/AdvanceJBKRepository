package project_mvn_demo.employee_mgm.controller;

import project_mvn_demo.employee_mgm.service.EmployeeService;
import project_mvn_demo.employee_mgm.entity.Employee;

import java.util.List;

public class EmployeeController {
    EmployeeService service = null;
    public EmployeeController(){
        service= new EmployeeService();
    }
    public List<Employee> getAllEmployeeDetails() {
        List<Employee> allEmployeeDetails = service.getAllEmployeeDetails();
        return allEmployeeDetails;
    }

    public List<Employee> getAllEmployeeDetailsByDepartment(String department) {
        List<Employee> allEmployeedetailsByDepartment = service.getAllEmployeeDetailsByDepartment(department);
        return allEmployeedetailsByDepartment;
    }

    public List<Employee> getEmployeeById(int empId) {
        List<Employee> employeesById = service.getAllEmployeeDetailsById(empId);
        return employeesById;
    }

    public List<Employee> getEmployeeByName(String name) {
        List<Employee> employeesByName = service.getAllEmployeeDetailsByName(name);
        return employeesByName;
    }

    public List<Employee> getEmployeeByNameusingStreamApi(String name2) {
        List<Employee> employeesByName2 = service.getEmployeeByNameusingStreamApi(name2);
        return employeesByName2;
    }

    public List<Employee> getEmployeeByHigestSalary() {
        List<Employee> higestSalary = service.getEmployeeByHigestSalary();
        return higestSalary;
    }

    public List<Employee> getEmployeeByHigestExp() {
        List<Employee> higestExp = service.getEmployeeByHigestExp();
        return higestExp;
    }

    public boolean updateSalaryById(int empId, int salary) {
        boolean update = service.updateSalaryById(empId,salary);
        return update;
    }

    public boolean deletePlayerById(int empId3) {
        boolean delete = service.deletePlayerById(empId3);
        return delete;
    }




    public List<Employee> getEmployeeDetailsByExpMoreThan2(int exp) {
        List<Employee> employeesExpMoreThan2 = service.getEmployeeDetailsByExpMoreThan2(exp);
        return employeesExpMoreThan2;
    }
}
