package com.kcsajan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kcsajan.main.model.Student;

/**
 * @Author Sajan Kc
 * @Date February 2, 2021
 *
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
