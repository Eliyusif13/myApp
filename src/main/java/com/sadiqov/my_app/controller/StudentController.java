package com.sadiqov.my_app.controller;

import com.sadiqov.my_app.entitiy.Student;
import com.sadiqov.my_app.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myapp")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/registerStudent")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.save(student));
    }

    @GetMapping("/getAllStudent")
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(studentService.getAll());
    }
}
