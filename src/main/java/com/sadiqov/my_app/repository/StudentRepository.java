package com.sadiqov.my_app.repository;

import com.sadiqov.my_app.entitiy.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public Student save(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> findAll() {
        return students;
    }

    public List<Student> findByName(String name) {
        return students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}

