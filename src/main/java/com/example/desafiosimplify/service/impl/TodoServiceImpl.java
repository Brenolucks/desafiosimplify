package com.example.desafiosimplify.service.impl;

import com.example.desafiosimplify.domain.model.Todo;
import com.example.desafiosimplify.dto.TodoDto;
import com.example.desafiosimplify.repository.TodoRepository;
import com.example.desafiosimplify.service.TodoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    private TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> listAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
