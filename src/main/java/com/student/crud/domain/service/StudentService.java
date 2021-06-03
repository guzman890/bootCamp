package com.student.crud.domain.service;

import com.student.crud.domain.dto.StudentDTO;
import com.student.crud.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository StudentRepository;

    public List<StudentDTO> getAll(){
        return StudentRepository.getAll();
    }

    public Optional<StudentDTO> getStudent(int idStudent){
        return StudentRepository.getStudent(idStudent);
    }

    public StudentDTO save(StudentDTO Student){
        return StudentRepository.save(Student);
    }

    public boolean delete(int idStudent){
        return getStudent(idStudent).map(
                StudentDTO -> {
                    StudentRepository.delete(idStudent);
                    return true;
                }
        ).orElse(false);
    }
}
