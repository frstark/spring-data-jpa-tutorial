package com.stark.spring.data.jpa.tutorial.repository;

import com.stark.spring.data.jpa.tutorial.entity.Guardian;
import com.stark.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() { //Testdaten einfügen
        Student student = Student.builder()
                .emailId("frstark@tsn.at")
                .firstName("Frank")
                .lastName("Stark")
                //.guardianName("Max")
                //.guardianEmail("max@muster.at")
                //.guardianMobile("555-Nase")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .email("max@muster.at")
                .name("Max")
                .mobile("555Nase")
                .build();

        Student student = Student.builder()
                .firstName("Thomas")
                .lastName("Mueller")
                .emailId("thmueller@tsn.at")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();
        System.out.println("studentList = " + studentList);

    }

    @Test
    public void printStudentByFirstName() {
        List<Student> students =
                studentRepository.findByFirstName("Frank");
        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining() {
        List<Student> students =
                studentRepository.findByFirstNameContaining("Fr");
        System.out.println("students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardian() {
        List<Student> students =
                studentRepository.findByGuardianName("Max");
        System.out.println("students =" + students);

    }

    @Test
    public void printgetStudentByEmailAddress() {
        Student  student =
                studentRepository.getStudentByEmailAddress(
                        "frstark@tsn.at");

        System.out.println("student =" +student);
    }

    @Test
    public void updateStudentByNameByEmailIdTest() {
        studentRepository.updateStudentByEmailId(
                "Frank-Christian",
                "frstark@tsn.at"
        );

    }
}