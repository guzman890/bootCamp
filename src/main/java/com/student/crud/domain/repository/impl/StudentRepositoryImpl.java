package com.student.crud.domain.repository.impl;

import com.student.crud.domain.dto.StudentDTO;
import com.student.crud.domain.mapper.StudentMapper;
import com.student.crud.domain.repository.StudentRepository;
import com.student.crud.persistence.crud.StudentCrudRepository;
import com.student.crud.persistence.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private StudentCrudRepository StudentCrudRepository;
    @Autowired
    private StudentMapper mapper;

    @Override
    public List<StudentDTO> getAll(){
        List<Student> lista = (List<Student>) StudentCrudRepository.findAll();

        return mapper.toStudentDTOs(lista);
    }
    @Override
    public Optional<StudentDTO> getStudent(int idStudent){
        return StudentCrudRepository.findById(idStudent).map(
                Student -> mapper.toStudentDTO(Student)
        );
    }

    @Override
    public Optional<StudentDTO> getStudentByDocumentNumber(String document_number) {

        Student Student = StudentCrudRepository.findByDocumentNumber(document_number);
        if(Student == null){
            return Optional.empty();
        }
        return Optional.of(mapper.toStudentDTO(Student));
    }

    @Override
    public StudentDTO save(StudentDTO StudentDTO){
        Student Student = mapper.toStudent(StudentDTO);
        return mapper.toStudentDTO(StudentCrudRepository.save(Student));
    }

    @Override
    public void delete(int idStudent){
        StudentCrudRepository.deleteById(idStudent);
    }
}
