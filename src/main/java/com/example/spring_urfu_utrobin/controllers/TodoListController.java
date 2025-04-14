package com.example.spring_urfu_utrobin.controllers;

import com.example.spring_urfu_utrobin.dto.TodoListDto;
import com.example.spring_urfu_utrobin.entity.TodoList;
import com.example.spring_urfu_utrobin.service.TodoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoListController {

    private final TodoListService todoListService;

    @PostMapping("/save")
    public TodoList saveTodoList(@RequestBody TodoListDto todoListDto) {
        return todoListService.saveTodoList(todoListDto);
    }

    @GetMapping("/all")
    public List<TodoListDto> getAllTodoLists() {
        return todoListService.getAllTodoLists();
    }
}

