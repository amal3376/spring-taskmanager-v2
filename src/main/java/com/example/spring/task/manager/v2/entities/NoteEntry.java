package com.example.spring.task.manager.v2.entities;

import jakarta.persistence.*;

@Entity(name = "notes")
public class NoteEntry extends BaseEntity{

    @Column(name = "body", nullable = false, length = 500)
    String body;

}
