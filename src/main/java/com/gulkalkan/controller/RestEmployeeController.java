package com.gulkalkan.controller;

import com.gulkalkan.Model.Employee;
import com.gulkalkan.Model.UpdateEmployeeRequest;
import com.gulkalkan.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private List<Employee> employeeList;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList() {
 return employeeService.getAllEmployeeList();


    }
    @GetMapping("/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id",required = true)String id) {
        return employeeService.getEmployeeById(id);
    }
    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeeWithParam(@RequestParam(name ="firstName",required = false)String firstName,
                                               @RequestParam(name = "lastName",required = false) String lastName){


        return employeeService.getEmployeeWithParam(firstName,lastName) ;
    }
    @PostMapping(path = "/save-employee")
    public Employee saveEmployee(@RequestBody Employee employee) {

        return employeeService.saveEmployee(employee);
    }
    @DeleteMapping(path = "/delete-employee/{id}")
    public boolean deleteEmployee (@PathVariable(name="id")String id){
        return employeeService.deleteEmployee(id);
    }
@PutMapping(path = "/update-employee/{id}")
    public Employee updateEmployee(@PathVariable(name="id")String id, @RequestBody UpdateEmployeeRequest request) {

        return employeeService.updateEmployee(id, request);
    }
}
