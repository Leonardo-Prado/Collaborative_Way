package com.lspsoftwares.collaborativeway;

import com.lspsoftwares.collaborativeway.nucleo.entidades.usuarios.Usuario;

public class SessionData {
    private static final SessionData ourInstance = new SessionData();
    private Usuario usuario;

    public static SessionData getInstance() {
        return ourInstance;
    }

    private SessionData() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
