package com.project.tsm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.tsm.model.TaskManagementEntity;
import com.project.tsm.repository.TaskManagementSystemRepository;


@Service
public class TaskManagementService {
	@Autowired
    private TaskManagementSystemRepository taskRepository; 
      
    public TaskManagementEntity createNewTask(TaskManagementEntity task) { 
        return taskRepository.save(task); 
    } 
      
    public List<TaskManagementEntity> getAllTitle() { 
        return taskRepository.findAll(); 
    } 
      
    public TaskManagementEntity findTaskById(Long id) { 
        return taskRepository.getById(id); 
    } 
      
    public List<TaskManagementEntity> findAllStatusTask() { 
        return taskRepository.findByStatusTrue(); 
    } 
      
    public List<TaskManagementEntity> findAllInStatusTask() { 
        return taskRepository.findByStatusFalse(); 
    } 
      
    public void deleteTask(Long id) { 
        taskRepository.deleteById(id); 
    } 
      
    public TaskManagementEntity updateTask(TaskManagementEntity task) { 
        return taskRepository.save(task); 
    } 
} 


