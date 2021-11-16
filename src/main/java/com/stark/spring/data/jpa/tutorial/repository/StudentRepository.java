package com.stark.spring.data.jpa.tutorial.repository;

import com.stark.spring.data.jpa.tutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameContaining(String name);

    List<Student> findByLastNameNotNull();

    List<Student> findByGuardianName(String guardianName);

    Student findByFirstNameAndLastName(String firstName,
                                       String lastName);

    // JPQL Querry
    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentByEmailAddress(String emailId);

    //Native Querry
    @Query(
            value = "select * from tbl_student s where s.email_address = ?1",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNative(String emailId);

    // Update
    @Modifying
    @Transactional //import org.springframework.transaction.annotation.Transactional;
    @Query(
            value = "update  tbl_student set first_name = ?1 where email_address = ?2",
            nativeQuery = true
    )
    int updateStudentByEmailId(String firstName, String emailId);




}
