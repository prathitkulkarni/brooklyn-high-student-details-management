package com.brooklynhigh.repository;

import com.brooklynhigh.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
