package com.springlessons.securityform.repository;

import com.springlessons.securityform.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {

}
