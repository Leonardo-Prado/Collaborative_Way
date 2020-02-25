package com.lspsoftwares.collaborativeway.nucleo.entidades.projetos;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String uid;
    private String nome;
    private String descricao;
    private String relatorio;
    private List<String> etapasUid;
    private List<String> equipesUid;
    private String admUid;
    private long previsao;
    private long inicioProgramado;
    private long fimProgramado;
    private long inicioReal;
    private long fimReal;
    private int status;
    private CollaborativeWall wall;

    public Projeto() {
        etapasUid = new ArrayList<>();
        equipesUid = new ArrayList<>();
        wall = new CollaborativeWall();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public List<String> getEtapasUid() {
        return etapasUid;
    }

    public void setEtapasUid(List<String> etapasUid) {
        this.etapasUid = etapasUid;
    }

    public List<String> getEquipesUid() {
        return equipesUid;
    }

    public void setEquipesUid(List<String> equipesUid) {
        this.equipesUid = equipesUid;
    }

    public String getAdmUid() {
        return admUid;
    }

    public void setAdmUid(String admUid) {
        this.admUid = admUid;
    }

    public long getInicioProgramado() {
        return inicioProgramado;
    }

    public void setInicioProgramado(long inicioProgramado) {
        this.inicioProgramado = inicioProgramado;
    }

    public long getFimProgramado() {
        return fimProgramado;
    }

    public void setFimProgramado(long fimProgramado) {
        this.fimProgramado = fimProgramado;
    }

    public long getInicioReal() {
        return inicioReal;
    }

    public void setInicioReal(long inicioReal) {
        this.inicioReal = inicioReal;
    }

    public long getFimReal() {
        return fimReal;
    }

    public void setFimReal(long fimReal) {
        this.fimReal = fimReal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public CollaborativeWall getWall() {
        return wall;
    }

    public void setWall(CollaborativeWall wall) {
        this.wall = wall;
    }

    public long getPrevisao() {
        return previsao;
    }

    public void setPrevisao(long previsao) {
        this.previsao = previsao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
}
