package com.deepak.springreactivepostgressexample.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

    @Id
    private Integer id;
    private String name;
    private int age;
    private double salary;
}
