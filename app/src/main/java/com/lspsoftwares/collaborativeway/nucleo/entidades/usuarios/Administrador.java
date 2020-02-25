package com.lspsoftwares.collaborativeway.nucleo.entidades.usuarios;

public class Administrador extends Usuario {
    private String projetoUid;

    public String getProjetoUid() {
        return projetoUid;
    }

    public void setProjetoUid(String projetoUid) {
        this.projetoUid = projetoUid;
    }
}
