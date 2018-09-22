package com.ReactApp.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_role_mapping")
public class RolesUserMapping extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name = "role_id", columnDefinition = "varchar(50)")
	private Role role;
	
	@ManyToOne
	@JoinColumn(name = "user_id", columnDefinition = "varchar(50)")
	private User user;
	
	private String description;
	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	

}
