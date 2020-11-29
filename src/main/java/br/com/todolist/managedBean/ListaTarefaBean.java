package br.com.todolist.managedBean;

import br.com.todolist.model.ListaTarefa;
import br.com.todolist.model.util.StatusTarefa;
import br.com.todolist.repository.ListaTarefaRepository;
import br.com.todolist.util.FacesMessages;

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

    @Inject
    private FacesMessages messages;

    private List<ListaTarefa> listaTarefas;

    private ListaTarefa novaTarefa = new ListaTarefa();

    public void consultar() {
        listaTarefas = repository.listarTudo();
    }

    public void criarNovaTarefa() {
        novaTarefa = new ListaTarefa();
    }

    public void salvarNovaTarefa(){
        repository.salvar(novaTarefa);
        consultar();

        messages.info("Empresa salva com sucesso!");
    }


    public List<ListaTarefa> getListaTarefas() {
        return listaTarefas;
    }

    public StatusTarefa[] getStatusTarefas() {
        return StatusTarefa.values();
    }

    public ListaTarefa getNovaTarefa() {
        return novaTarefa;
    }

    public void setNovaTarefa(ListaTarefa novaTarefa) {
        this.novaTarefa = novaTarefa;
    }

    public StatusTarefa[] getStatusTarefa(){
        return StatusTarefa.values();
    }
}
