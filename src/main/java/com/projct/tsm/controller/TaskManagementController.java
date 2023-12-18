package com.projct.tsm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tsm.model.TaskManagementEntity;
import com.project.tsm.services.TaskManagementService;


@Controller
@RequestMapping("/api/v1/tasks")
public class TaskManagementController {
	@Autowired
    private TaskManagementService taskService; 
    @GetMapping("/") 
    public ResponseEntity<List<TaskManagementEntity>> getAllTitle() { 
        return ResponseEntity.ok(taskService.getAllTitle()); 
    } 
    @GetMapping("/completed") 
    public ResponseEntity<List<TaskManagementEntity>> getAllStatusTasks() { 
        return ResponseEntity.ok(taskService.findAllStatusTask()); 
    } 
    @GetMapping("/incomplete") 
    public ResponseEntity<List<TaskManagementEntity>> getAllInStatusTasks() { 
        return ResponseEntity.ok(taskService.findAllInStatusTask()); 
    } 
    @PostMapping("/") 
    public ResponseEntity<TaskManagementEntity> createTask(@RequestBody TaskManagementEntity task) { 
        return ResponseEntity.ok(taskService.createNewTask(task)); 
    } 
    @PutMapping("/{id}") 
    public ResponseEntity<TaskManagementEntity> updateTask(@PathVariable Long id, @RequestBody TaskManagementEntity task) { 
        task.setId(id); 
        return ResponseEntity.ok(taskService.updateTask(task)); 
    } 
    @DeleteMapping("/{id}") 
    public ResponseEntity<Boolean> getAllTasks(@PathVariable("id") Long id) { 
        taskService.deleteTask(id); 
        return ResponseEntity.ok(true); 
    } 
}


