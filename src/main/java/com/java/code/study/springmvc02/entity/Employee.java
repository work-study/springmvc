package com.java.code.study.springmvc02.entity;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Data
@ToString
public class Employee {

	private Integer id;
	@NotEmpty
	private String lastName;

	@Email
	private String email;

	private Integer gender;
	
	private Department department;
	
	@Past
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	
	@NumberFormat(pattern="#,###,###.#")
	private Float salary;


	public Employee(Integer id, String lastName, String email, Integer gender,
			Department department) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.department = department;
	}

	public Employee() {

	}
}
