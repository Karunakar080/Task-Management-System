package com.project.tsm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "Task")

public class TaskManagementEntity {
	@Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY) 
    // this is the primary key which will be auto generated 
    private Long id; 
    private String title; 
    private String Description;
	private boolean status; 
    
    public TaskManagementEntity(){}
  
    public TaskManagementEntity(Long id,String title,String Description,  boolean completed) { 
    	this.id = id;
        this.title = title; 
        this.Description =Description;
        this.status = completed; 
    } 
    public Long getId() { 
        return id; 
    } 
    public void setId(Long id) { 
        this.id = id; 
    } 
    public String getTitle() { 
        return title; 
    } 
    public void setTitle(String title) { 
        this.title = title; 
    } 
    
    public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public boolean isStatus() { 
        return status; 
    } 
    public void setStatus(boolean status) { 
        this.status = status; 
    } 
    
} 
