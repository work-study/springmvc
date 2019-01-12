package com.java.code.study.springmcv01;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
	
	private Integer id;
	
	private String username;
	private String password;

	private String email;
	private int age;
	
	private Address address;

	public User(String username, String password, String email, int age) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
	}

	public User(Integer id, String username, String password, String email,
			int age) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
	}

	public User() {}
}
