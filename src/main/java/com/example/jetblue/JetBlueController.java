package com.example.jetblue;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jetblue/v1")
public class JetBlueController {

    @GetMapping("/employees")
    public List<String> getEmployees(){

        List<String> employeeList = new ArrayList<>();
        employeeList.add("Danny Charris");
        employeeList.add("Michael Olaya");
        return employeeList;
    }
}
