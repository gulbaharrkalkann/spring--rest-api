package com.gulkalkan.Config;

import com.gulkalkan.Model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
@Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","John", "Doe"));
        employeeList.add(new Employee("2","Jane", "Smith"));
        employeeList.add(new Employee("3","Alice", "Johnson"));
        employeeList.add(new Employee("4","Bob", "Brown"));
        employeeList.add(new Employee("5","Charlie", "Davis"));
        employeeList.add(new Employee("6","Jane", "Wilson"));

        return employeeList;
    }

}
