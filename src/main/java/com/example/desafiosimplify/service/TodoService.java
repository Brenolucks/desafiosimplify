package com.example.desafiosimplify.service;

import com.example.desafiosimplify.domain.model.Todo;
import com.example.desafiosimplify.dto.TodoDto;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface TodoService {
    Todo createTodo(Todo todo);
    List<Todo> listAllTodos();
    Todo updateTodo(Todo todo);
    void deleteTodo(Long id);

}
