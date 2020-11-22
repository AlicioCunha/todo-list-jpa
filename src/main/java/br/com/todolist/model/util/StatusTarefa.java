package br.com.todolist.model.util;

public enum StatusTarefa {

    PENDENTE(1),
    FAZENDO(2),
    CONCLUIDO(3),
    CANCELADO(4);

    private int status;

    StatusTarefa(int valor){
        this.status = valor;
    }

    public int getStatus() {
        return status;
    }
}
