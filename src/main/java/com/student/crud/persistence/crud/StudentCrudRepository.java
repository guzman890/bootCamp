package com.student.crud.persistence.crud;

import com.student.crud.persistence.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentCrudRepository extends CrudRepository<Student,Integer> {

    Student findByDocumentNumber(String documentNumber);
}
