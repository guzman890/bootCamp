package com.student.crud.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "id")
    private Integer id;

    @Column (name= "document_number")
    private String documentNumber;

    @Column (name= "document_type")
    private Integer documentType;

    @Column (name= "age")
    private Integer age;

    @Column (name= "university")
    private String university;

    @Column (name= "civil_status")
    private Integer civilStatus;

    @Column (name= "birth_date")
    private Date birthDate;

    @Column (name= "address")
    private String address;

    @Column (name= "gender")
    private Integer gender;

    @Column (name= "status")
    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Integer getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(Integer civilStatus) {
        this.civilStatus = civilStatus;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
