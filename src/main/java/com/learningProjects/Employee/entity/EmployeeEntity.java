package com.learningProjects.Employee.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private  String firstName;
private  String lastName;
private  String emailId;
}
