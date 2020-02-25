package com.lspsoftwares.collaborativeway.nucleo.entidades.usuarios;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String uid;
    private String nome;
    private String email;
    private List<String> equipesUid;
    private List<String> projetosUid;
    private List<String> amigosUid;
    private List<String> tarefasUid;

    public Usuario() {
        equipesUid = new ArrayList<>();
        projetosUid = new ArrayList<>();
        amigosUid = new ArrayList<>();
        tarefasUid = new ArrayList<>();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getEquipesUid() {
        return equipesUid;
    }

    public void setEquipesUid(List<String> equipesUid) {
        this.equipesUid = equipesUid;
    }

    public List<String> getProjetosUid() {
        return projetosUid;
    }

    public void setProjetosUid(List<String> projetosUid) {
        this.projetosUid = projetosUid;
    }

    public List<String> getAmigosUid() {
        return amigosUid;
    }

    public void setAmigosUid(List<String> amigosUid) {
        this.amigosUid = amigosUid;
    }

    public List<String> getTarefasUid() {
        return tarefasUid;
    }

    public void setTarefasUid(List<String> tarefasUid) {
        this.tarefasUid = tarefasUid;
    }
}
