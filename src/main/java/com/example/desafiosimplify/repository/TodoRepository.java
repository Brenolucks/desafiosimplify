package com.example.desafiosimplify.repository;

import com.example.desafiosimplify.domain.model.Todo;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
