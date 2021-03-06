package br.com.todolist.repository;

import br.com.todolist.model.ListaTarefa;
import br.com.todolist.util.Transacional;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public class ListaTarefaRepository implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager entityManager;

    public List<ListaTarefa> listarTudo() {
        return entityManager.createQuery("from lista_tarefa", ListaTarefa.class).getResultList();
    }

    @Transacional
    public ListaTarefa salvar(ListaTarefa novaTarefa) {
        return entityManager.merge(novaTarefa);
    }
}