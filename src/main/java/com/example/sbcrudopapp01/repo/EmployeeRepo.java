package com.example.sbcrudopapp01.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sbcrudopapp01.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	Optional<Employee>findByphone(long phone);

}
