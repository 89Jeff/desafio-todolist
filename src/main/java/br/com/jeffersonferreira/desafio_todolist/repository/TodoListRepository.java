package br.com.jeffersonferreira.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jeffersonferreira.desafio_todolist.entity.TodoList;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList , Long>{
    
}
