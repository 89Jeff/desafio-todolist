package br.com.jeffersonferreira.desafio_todolist.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.jeffersonferreira.desafio_todolist.entity.TodoList;
import br.com.jeffersonferreira.desafio_todolist.service.TodoListService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/todos")
public class TodoListController {
    
    @Autowired
    private TodoListService todolistservice;

    @PostMapping
    List<TodoList> create(@RequestBody TodoList todolist) {  
       return todolistservice.create(todolist);
    }
    
    @GetMapping
    public List<TodoList> list() {
        return todolistservice.list();
    }
    
    @PutMapping
    public List<TodoList> update(@RequestBody TodoList todolist) {
        return todolistservice.update(todolist);
    }

    @DeleteMapping("{id}")
    public List<TodoList> delete(@PathVariable("id") Long id) {
        return todolistservice.delete(id);
    }
}
