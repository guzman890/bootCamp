package com.student.crud.domain.mapper;

import com.student.crud.domain.dto.StudentDTO;
import com.student.crud.persistence.entity.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mappings(
            {
                    @Mapping(source="id", target = "id" ),
                    @Mapping(source="documentNumber", target = "documentNumber" ),
                    @Mapping(source="documentType", target = "documentType" ),
                    @Mapping(source="age", target = "age" ),
                    @Mapping(source="university", target = "university" ),
                    @Mapping(source="civilStatus", target = "civilStatus" ),
                    @Mapping(source="birthDate", target = "birthDate" ),
                    @Mapping(source="address", target = "address" ),
                    @Mapping(source="gender", target = "gender" ),
                    @Mapping(source="status", target = "status" ),
            }
    )
    StudentDTO toStudentDTO(Student student);
    List<StudentDTO> toStudentDTOs(List<Student> students);

    @InheritInverseConfiguration
    Student toStudent(StudentDTO studentDTO);
}
