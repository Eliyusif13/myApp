package com.sadiqov.my_app.entitiy;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {


    private String id;

    private String name;
    private int age;
    private String department;
}
