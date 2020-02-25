package com.lspsoftwares.collaborativeway.nucleo.entidades.projetos;

import java.util.ArrayList;
import java.util.List;

public class CollaborativeWall {
    private String uid;
    private String projetoUid;
    private List<String> tarefas;

    public CollaborativeWall() {
        tarefas = new ArrayList<>();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getProjetoUid() {
        return projetoUid;
    }

    public void setProjetoUid(String projetoUid) {
        this.projetoUid = projetoUid;
    }

    public List<String> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<String> tarefas) {
        this.tarefas = tarefas;
    }
}
