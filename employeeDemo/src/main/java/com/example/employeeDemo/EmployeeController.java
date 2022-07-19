package com.example.employeeDemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("myApp")
public class EmployeeController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {

        String url = "https://dummy.restapiexample.com/api/v1/employees";
        Employee[] employees = this.restTemplate.getForObject(url,
                Employee[].class);
        return Arrays.asList(employees);

    }

}
