package com.sadiqov.my_app.service;
import com.sadiqov.my_app.entitiy.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class StudentService {
    private final Map<Long, Student> studentMap = new HashMap<>();
    private Long idCounter = 1L;

    public List<Student> getAll() {
        return new ArrayList<>(studentMap.values());
    }

    public Student create(Student student) {
        student.setId(String.valueOf(idCounter++));
        studentMap.put(Long.valueOf(student.getId()), student);
        return student;
    }

    public Student update(Long id, Student updated) {
        if (!studentMap.containsKey(id)) {
            throw new RuntimeException("Student not found");
        }
        updated.setId(String.valueOf(id));
        studentMap.put(id, updated);
        return updated;
    }

    public void delete(Long id) {
        studentMap.remove(id);
    }

    public Optional<Student> getById(Long id) {
        return Optional.ofNullable(studentMap.get(id));
    }
}

