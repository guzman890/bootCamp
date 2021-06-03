package com.student.crud.domain.service;

import com.student.crud.domain.dto.StudentDTO;
import com.student.crud.domain.repository.StudentRepository;
import com.student.crud.domain.repository.impl.StudentRepositoryImpl;
import com.student.crud.persistence.entity.Student;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentRepository studentRepository;

    @Test
    public void getAll() {
        List<StudentDTO> listMock = new ArrayList<>();
        listMock.add(new StudentDTO(){{
            setId(1);
        }});
        doReturn(listMock).when(studentRepository).getAll();

        List<StudentDTO> listReturn = studentService.getAll();

        assertEquals(1,listReturn.size());
        assertEquals(listMock.get(0).getId(),listReturn.get(0).getId());
    }

    @Test
    public void getStudent() {

        StudentDTO studentMock= new StudentDTO(){{
            setId(1);
        }};

        doReturn(studentMock).when(studentRepository).getStudent( any(Integer.class) );

        Optional<StudentDTO> studentDTO = studentService.getStudent(1);

        assertEquals(studentMock.getId(),studentDTO.get().getId());

    }

    @Test
    public void save() {

        StudentDTO studentDTO= new StudentDTO(){{
            setId(1);
        }};

        doReturn(studentDTO).when(studentRepository).save( any(StudentDTO.class) );

        StudentDTO studentDTOReturn = studentService.save(studentDTO);

        assertEquals(studentDTO.getId(),studentDTOReturn.getId());

    }

    @Test
    public void delete() {

        doNothing().when(studentRepository).delete( any(Integer.class) );

        studentService.delete(1);

        verify(studentRepository, times(1)).delete(any(Integer.class));
    }
}