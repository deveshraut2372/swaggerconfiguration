package com.devesh.swaggercon.Controller;

import com.devesh.swaggercon.Entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    private List<Employee> employeeList=createList();


//    @GetMapping(value = "/employee")
//    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    @GetMapping(value = "/employee")
    public List<Employee> firstPage()
    {
        return employeeList;
    }

    @DeleteMapping(path = "/{id}")
    public Employee deleteEmployee(@PathVariable("id") int id)
    {
        Employee employee=new Employee();
        for(Employee employee1:employeeList)
        {
            if(employee1.getEmpId()==id)
            {
                employeeList.remove(employee);
                employee= employee1;
            }
        }
        return  employee;
    }

    @PostMapping(value = "/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee)
    {
        employeeList.add(employee);
        return employee;

    }

    private static  List<Employee> createList()
    {
        List<Employee> employeeList1=new ArrayList<>();

        Employee employee=new Employee(1,"Devesh","Java Developer ",100000);
        Employee employee1=new Employee(2,"Prathmesh","React Developer ",100000);
        Employee employee2=new Employee(3,"Shubham","Angular Developer ",100000);
        employeeList1.add(employee);
        employeeList1.add(employee1);
        employeeList1.add(employee2);
        return employeeList1;
    }


}
