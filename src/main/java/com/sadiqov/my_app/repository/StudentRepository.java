package com.sadiqov.my_app.repository;

import com.sadiqov.my_app.entitiy.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface StudentRepository extends ElasticsearchRepository<Student, String> {
    List<Student> findByName(String name);
}
