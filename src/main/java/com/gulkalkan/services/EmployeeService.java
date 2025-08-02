package com.gulkalkan.services;

import com.gulkalkan.Model.Employee;
import com.gulkalkan.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployeeList() {

        return employeeRepository.getAllEmployeeList();
    }


    public Employee getEmployeeById(String id) {
        return employeeRepository.getEmployeeById(id);
    }
    public List<Employee> getEmployeeWithParam(String firstName, String lastName) {

        return employeeRepository.getEmployeeWithParam(firstName,lastName); // This method currently does not filter or return any employees based on parameters
    }
}