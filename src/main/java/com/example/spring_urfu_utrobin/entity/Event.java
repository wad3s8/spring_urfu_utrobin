package com.example.spring_urfu_utrobin.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "todoList_id")
    private TodoList todoList;

}
