package com.student.crud.web.controller;

import com.student.crud.domain.dto.StudentDTO;
import com.student.crud.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private StudentService StudentService;

    @GetMapping("")
    public List<StudentDTO> getAll(){
        return StudentService.getAll();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudent(@PathVariable("id") int id) throws Exception {
        Optional<StudentDTO> studentDTO= StudentService.getStudent(id);

        if(studentDTO.isPresent()){
            return studentDTO.get();
        }else {
            throw new Exception("Student Not Found ");
        }
    }

    @PostMapping("")
    public StudentDTO save(@RequestBody StudentDTO Student){
        return StudentService.save(Student);
    }

    @DeleteMapping("/{id}")
    public boolean delete( @PathVariable("id") int idTemperature){
        return StudentService.delete(idTemperature);
    }

}
