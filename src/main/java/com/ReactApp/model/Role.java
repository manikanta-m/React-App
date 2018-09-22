package com.ReactApp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends AbstractEntity {
	
	private String role_name;
	
	private String description;
	
	private int is_active;
	
	@OneToMany(mappedBy = "role")
	private List<RolesUserMapping> roleList = new ArrayList<>();

	public String getRole_Name() {
		return role_name;
	}

	public void setRole_ame(String role_name) {
		this.role_name = role_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	
	
	public Role(){
		super();
	}
	
	
}
