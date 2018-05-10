package com.example.studentsapidemo;

import com.example.studentsapidemo.Entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
