package com.example.sbcrudopapp01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Value
@NoArgsConstructor
@Entity
@Table(name="employee55")
@Data
@AllArgsConstructor


public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private double esal;
	private long phone;
	private int age;
	

}
