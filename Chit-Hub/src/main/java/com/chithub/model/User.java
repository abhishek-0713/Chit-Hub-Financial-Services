package com.chithub.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer userId;
	
	@NonNull
	private String userName;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	@NonNull
	private String email;
	@NonNull
	private String mobile;
	@NonNull
	private Integer age;
	@NonNull
	private String password;
	
	
	private List<Address> address;
	
	
	public User(@NonNull String userName, @NonNull String firstName, @NonNull String lastName, @NonNull String email,
			@NonNull String mobile, @NonNull Integer age, @NonNull String password, List<Address> address) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.age = age;
		this.password = password;
		this.address = address;
	}
	
}
