package br.com.todolist.managedBean;


import br.com.todolist.model.ListaTarefa;
import br.com.todolist.repository.ListaTarefaRepository;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ListaTarefaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ListaTarefaRepository repository;

    private List<ListaTarefa> listaTarefas;

    public void Consultar() {
        listaTarefas = repository.listarTudo();
    }

    public List<ListaTarefa> getListaTarefas() {
        return listaTarefas;
    }
}
