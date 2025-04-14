package com.example.spring_urfu_utrobin.service;

import com.example.spring_urfu_utrobin.dto.TodoListDto;
import com.example.spring_urfu_utrobin.entity.Event;
import com.example.spring_urfu_utrobin.entity.TodoList;
import com.example.spring_urfu_utrobin.repository.TodoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoListService {

    private final TodoListRepository todoListRepository;

    public TodoList saveTodoList(TodoListDto todoListDto) {
        TodoList todoList = new TodoList();
        todoList.setName(todoListDto.getName());
        todoList.setEvents(todoListDto.getEvents().stream()
                .map(eventDesc -> {
                    Event event = new Event();
                    event.setTodoList(todoList);
                    return event;
                }).collect(Collectors.toSet()));
        return todoListRepository.save(todoList);
    }

    public List<TodoListDto> getAllTodoLists() {
        return todoListRepository.findAll().stream()
                .map(todoList -> new TodoListDto(
                        todoList.getName(),
                        todoList.getEvents().stream()
                                .map(com.example.spring_urfu_utrobin.entity.Event::getName)
                                .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
    }
}
