package com.moksha.SpringCRUD.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moksha.SpringCRUD.model.Student;
public interface studentRepo extends JpaRepository<Student, Long>{

}
