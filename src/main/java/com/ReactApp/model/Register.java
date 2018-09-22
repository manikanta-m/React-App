package com.ReactApp.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ReactApp.validation.ValidEmail;

@Entity
@Table(name = "register")
public class Register {

	@Id
	@Column(name = "id", columnDefinition = "BINARY(16)")
	private UUID id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "email_address")
	@ValidEmail
	private String email;
	
	@Column(name = "password")
	private String password;
	

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
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

	public Register() {
		
	}

}
