package com.java.code.study.springmvc02.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Department {

	private Integer id;
	private String departmentName;

	public Department() {

	}
	
	public Department(int i, String string) {
		this.id = i;
		this.departmentName = string;
	}
}
