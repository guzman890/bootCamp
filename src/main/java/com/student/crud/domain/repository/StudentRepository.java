package com.student.crud.domain.repository;

import com.student.crud.domain.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    List<StudentDTO> getAll();
    Optional<StudentDTO> getStudent(int id);
    Optional<StudentDTO> getStudentByDocumentNumber(String Username);
    StudentDTO save(StudentDTO student);
    void  delete(int id);
}
