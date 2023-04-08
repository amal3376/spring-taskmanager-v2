package com.example.spring.task.manager.v2.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "tasks")
@Table(indexes = @Index(columnList = "title"))
public class TaskEntry extends BaseEntity{

    @Column(name = "title", nullable = false, length = 100)
    String title;
    @Column(name = "description", nullable = true, length = 500)
    String description;
    @Column(name = "completed", nullable = false, columnDefinition = "boolean default false")
    boolean completed;
    @Column(name = "due_Date", nullable = true)
    Date dueDate;



}
