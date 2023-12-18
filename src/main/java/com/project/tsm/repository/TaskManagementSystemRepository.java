package com.project.tsm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.tsm.model.TaskManagementEntity;


@Repository
public interface TaskManagementSystemRepository extends JpaRepository<TaskManagementEntity, Long> {
	
	public TaskManagementEntity findByTitle(String title); 
    public List<TaskManagementEntity> findByStatusTrue(); 
    public List<TaskManagementEntity> findByStatusFalse(); 
    public List<TaskManagementEntity> findAll(); 
    public TaskManagementEntity getById(Long id);

}
