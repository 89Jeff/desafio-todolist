package br.com.jeffersonferreira.desafio_todolist.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import br.com.jeffersonferreira.desafio_todolist.entity.TodoList;
import br.com.jeffersonferreira.desafio_todolist.repository.TodoListRepository;

@Service
public class TodoListService {
    @Autowired
    private TodoListRepository todoListRepository;

    public List<TodoList> create(TodoList todolist) {
        todoListRepository.save(todolist);
        return list();
    }

    public List<TodoList> list(){
       Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoListRepository.findAll(sort);
    }

    public List<TodoList> update(TodoList todoList) {
        todoListRepository.save(todoList);
        return list();
    }

    public List<TodoList> delete(Long id) {
        todoListRepository.deleteById(id);
        return list();
    }
 
}
