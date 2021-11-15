package com.stark.spring.data.jpa.tutorial.repository;

import com.stark.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private  StudentRepository studentRepository;

    @Test
    public void saveStudent(){ //Testdaten einfügen
        Student student = Student.builder()
                .emailId("frstark@tsn.at")
                .firstName("Frank")
                .lastName("Stark")
                .guardianName("Max")
                .guardianEmail("max@muster.at")
                .guardianMobile("555-Nase")
                .build();

        studentRepository.save(student);
    }

}