package com.sadiqov.my_app.entitiy;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "myappdata")
public class Student {

    @Id
    private String id;

    private String name;
    private int age;
    private String department;
}
