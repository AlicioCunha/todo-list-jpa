package br.com.todolist.model.util;

public enum StatusTarefa {

    PENDENTE("Pendente"),
    FAZENDO("Fazendo"),
    CONCLUIDO("Concluido"),
    CANCELADO("Cancelado");

    private String status;

    StatusTarefa(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
