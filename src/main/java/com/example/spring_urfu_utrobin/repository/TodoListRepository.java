package com.example.spring_urfu_utrobin.repository;


import com.example.spring_urfu_utrobin.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Long>{
}

