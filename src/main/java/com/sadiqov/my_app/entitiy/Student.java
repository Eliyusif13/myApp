package com.sadiqov.my_app.entitiy;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    private String id;

    private String name;
    private int age;
    private String department;
}
