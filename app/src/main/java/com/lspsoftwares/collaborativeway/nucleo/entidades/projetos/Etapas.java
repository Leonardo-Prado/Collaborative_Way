package com.lspsoftwares.collaborativeway.nucleo.entidades.projetos;

import java.util.List;

public class Etapas {

    private String uid;
    private String nome;
    private String descricao;
    private String relatorio;
    private String projetoUid;
    private List<String> tarefasUid;
    private List<String> equipesUid;
    private int status = StatusValues.NAO_INICIADO;
    private String etapaPreUid;
    private String etapaSucessUid;
    private long inicioProgramado;
    private long inicioReal;
    private long fimProgramado;
    private long fimReal;

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

    public List<String> getTarefasUid() {
        return tarefasUid;
    }

    public void setTarefasUid(List<String> tarefasUid) {
        this.tarefasUid = tarefasUid;
    }

    public List<String> getEquipesUid() {
        return equipesUid;
    }

    public void setEquipesUid(List<String> equipesUid) {
        this.equipesUid = equipesUid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEtapaPreUid() {
        return etapaPreUid;
    }

    public void setEtapaPreUid(String etapaPreUid) {
        this.etapaPreUid = etapaPreUid;
    }

    public String getEtapaSucessUid() {
        return etapaSucessUid;
    }

    public void setEtapaSucessUid(String etapaSucessUid) {
        this.etapaSucessUid = etapaSucessUid;
    }

    public long getInicioProgramado() {
        return inicioProgramado;
    }

    public void setInicioProgramado(long inicioProgramado) {
        this.inicioProgramado = inicioProgramado;
    }

    public long getInicioReal() {
        return inicioReal;
    }

    public void setInicioReal(long inicioReal) {
        this.inicioReal = inicioReal;
    }

    public long getFimProgramado() {
        return fimProgramado;
    }

    public void setFimProgramado(long fimProgramado) {
        this.fimProgramado = fimProgramado;
    }

    public long getFimReal() {
        return fimReal;
    }

    public void setFimReal(long fimReal) {
        this.fimReal = fimReal;
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
