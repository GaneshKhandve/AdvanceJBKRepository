package project_mvn_demo.employee_mgm.service;

import project_mvn_demo.employee_mgm.dao.EmployeeDao;
import project_mvn_demo.employee_mgm.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    EmployeeDao dao = null;
    public EmployeeService(){
        dao= new EmployeeDao();
    }
    public List<Employee> getAllEmployeeDetails() {
        List<Employee> allEmployeeDetails = dao.getAllEmployeeDetails();
        return allEmployeeDetails;
    }

    public List<Employee> getAllEmployeeDetailsByDepartment(String department) {
        List<Employee> allEmployeeDetails = dao.getAllEmployeeDetails();
        List<Employee> empDetailsByDepartment = new ArrayList<>();

        for (Employee employee : allEmployeeDetails){
            if (employee.getDepartment().equalsIgnoreCase(department)){
                empDetailsByDepartment.add(employee);
            }
        }
        return empDetailsByDepartment;
    }

    public List<Employee> getAllEmployeeDetailsById(int empId) {
        List<Employee> allEmployeeDetails = dao.getAllEmployeeDetails();
        List<Employee> empDetailsById = new ArrayList<>();
        for (Employee employee : allEmployeeDetails){
            if (employee.getEmp_id()==empId){
                empDetailsById.add(employee);
            }
        }
        return empDetailsById;
    }

    public List<Employee> getAllEmployeeDetailsByName(String name) {
        List<Employee> allEmployeeDetails = dao.getAllEmployeeDetails();
        List<Employee> empDetailsByName = new ArrayList<>();
        for (Employee employee : allEmployeeDetails){
            if (employee.getEmp_name().toLowerCase().contains(name.toLowerCase())){
                empDetailsByName.add(employee);
            }

        }
        return empDetailsByName;
    }

    public List<Employee> getEmployeeByHigestSalary() {
        List<Employee> allEmployeeDetails = dao.getAllEmployeeDetails();
        List<Employee> empDetailsByHigestSalary = new ArrayList<>();

        int max = allEmployeeDetails.get(0).getSalary();

        for (Employee employee : allEmployeeDetails){
            if (employee.getSalary()> max){
                max=employee.getSalary();
            }
        }

        for (Employee employee : allEmployeeDetails){
            if (employee.getSalary()==max){
                empDetailsByHigestSalary.add(employee);
            }
        }
        return empDetailsByHigestSalary;
    }

    public List<Employee> getEmployeeByHigestExp() {
        List<Employee> allEmployeeDetails = dao.getAllEmployeeDetails();
        List<Employee> empDetailsByHigestExp = new ArrayList<>();

        int max = allEmployeeDetails.get(0).getExperience();

        for (Employee employee : allEmployeeDetails){
            if (employee.getExperience()> max){
                max=employee.getExperience();
            }
        }

        for (Employee employee : allEmployeeDetails){
            if (employee.getExperience()==max){
                empDetailsByHigestExp.add(employee);
            }
        }
        return empDetailsByHigestExp;
    }

    public boolean updateSalaryById(int empId, int salary) {
        boolean update = dao.updateSalaryById(empId,salary);
        return update;


    }

    public boolean deletePlayerById(int empId3) {
        boolean delete = dao.deletePlayerById(empId3);
        return delete;
    }

    public List<Employee> getEmployeeByNameusingStreamApi(String name2) {
        List<Employee> allEmployeeDetails = dao.getAllEmployeeDetails();

        List<Employee> employeesByName = allEmployeeDetails.stream()
                .filter(e -> e.getEmp_name().toLowerCase().contains(name2.toLowerCase()))
                .toList();
        return employeesByName;

    }

    public List<Employee> getEmployeeDetailsByExpMoreThan2(int exp) {
        List<Employee> allEmployeeDetails = dao.getAllEmployeeDetails();

        List<Employee> employeesExpMoreThan2 = allEmployeeDetails.stream()
                .filter(e -> e.getExperience()>exp)
                .toList();
        return employeesExpMoreThan2;
    }
}
