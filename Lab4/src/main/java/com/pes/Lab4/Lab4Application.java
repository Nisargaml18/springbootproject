package com.pes.Lab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Lab4Application implements CommandLineRunner{
	@Autowired
	CustomerDao customerDao;
	@Autowired
	EmployeeDao employeeDao;

	public static void main(String[] args) {
		SpringApplication.run(Lab4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer c= new Customer(1,"Anya","anyaa3@gmail.com","Karnataka",6005726241l);
		customerDao.save(c);
		System.out.println("lab4 Doen");
		Employee e= new Employee(1,"Maya","Mandya",7262);
		employeeDao.save(e);
		System.out.println("lab4 Doen");
	}
}