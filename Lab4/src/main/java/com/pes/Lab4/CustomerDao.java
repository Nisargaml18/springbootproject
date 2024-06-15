package com.pes.Lab4;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerDao extends JpaRepository<Customer,Integer>{
	
}