package com.pes.Lab6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pes.Lab6.model.Employee;
import com.pes.Lab6.repository.EmployeeRep;

@RestController
@RequestMapping("/myEmployees/v1.0")
public class EmployeeController {
	@Autowired
	EmployeeRep employeeRep;
	@GetMapping ("/allEmployees")
	public List<Employee> getAllEmployees(){
		List<Employee> le =employeeRep.findAll();
		return le;
	}
	@PostMapping("/addEmployeeList")
	public List<Employee> addEmployeeList(@RequestBody List<Employee> employees) {
		return  employeeRep.saveAll(employees);
	}
}
