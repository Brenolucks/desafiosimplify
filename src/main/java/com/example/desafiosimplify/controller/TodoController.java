package com.example.desafiosimplify.controller;

import com.example.desafiosimplify.domain.model.Todo;
import com.example.desafiosimplify.dto.TodoDto;
import com.example.desafiosimplify.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    private final TodoService todoService;

    private TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todo")
    public ResponseEntity<Todo> createTodo(@RequestBody @Valid Todo todo){
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.createTodo(todo));
    }

    @GetMapping
    public List<Todo> listAllTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(todoService.listAllTodos()).getBody();
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo, @PathVariable Long id){
        todo.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(todoService.updateTodo(todo));
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id);
    }
}
