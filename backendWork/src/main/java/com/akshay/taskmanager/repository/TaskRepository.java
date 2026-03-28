package com.akshay.taskmanager.repository;

import com.akshay.taskmanager.entity.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  TaskRepository extends JpaRepository<Task,Long> {
    Page<Task> findByUserId(Long userId, Pageable pageable);
}