package com.stark.spring.data.jpa.tutorial.repository;

import com.stark.spring.data.jpa.tutorial.entity.Course;
import com.stark.spring.data.jpa.tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses() {
        List<Course> courses =
                courseRepository.findAll();

        System.out.println("courses = " + courses);
    }

    @Test
    public void saveCoursesWithTeacher() {

        Teacher teacher = Teacher.builder()
                .firstName("Bruce")
                .lastName("Hermann")
                .build();


        Course course = Course
                .builder()
                .title("Phyton")
                .credit(6)
                .teacher(teacher)
                .build();

        courseRepository.save(course);
    }


}