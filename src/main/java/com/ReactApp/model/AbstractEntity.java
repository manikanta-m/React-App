package com.ReactApp.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	
	@Id
    @Column(name = "id", columnDefinition = "varchar(50)")
    private UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	
	

}
