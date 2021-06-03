package com.student.crud.domain.repository.impl;

import com.student.crud.domain.dto.StudentDTO;
import com.student.crud.persistence.crud.StudentCrudRepository;
import com.student.crud.persistence.entity.Student;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Matchers.any;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class StudentRepositoryImplTest {

    @InjectMocks
    private StudentRepositoryImpl studentRepositoryImpl;

    @Before
    public void before() {

    }

    @Test
    void getAll() {

    }

    @Test
    void getStudent() {

    }

    @Test
    void getStudentByDocumentNumber() {
    }

    @Test
    void save() {

    }

    @Test
    void delete() {

    }
}