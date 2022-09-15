package net.guides.springboot2.crud.controller;

import java.util.List;
import java.util.Map;

import net.guides.springboot2.crud.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Employee;

import javax.validation.Valid;


/**
 * <DESCRIPTION>.
 *
 * @author fazylzyanov@reksoft.ru
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {

        return ResponseEntity.ok().body(employeeService.getEmployeeById(employeeId));
    }

    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {

        return employeeService.createEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable (value = "id") Long employeeId,
            @Valid @RequestBody Employee employeeDetails
    )
            throws ResourceNotFoundException {

        return ResponseEntity.ok(employeeService.updateEmployee(employeeId, employeeDetails));
    }

    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable (value = "id") Long employeeId)
            throws ResourceNotFoundException {

        return employeeService.deleteEmployee(employeeId);
    }
}