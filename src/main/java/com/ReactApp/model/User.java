package com.ReactApp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ReactApp.validation.ValidEmail;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

	@Column(name = "name")
	private String name;
	
	@Column(name = "email_address")
	@ValidEmail
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<RolesUserMapping> roleList = new ArrayList<>();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		
	}

}
