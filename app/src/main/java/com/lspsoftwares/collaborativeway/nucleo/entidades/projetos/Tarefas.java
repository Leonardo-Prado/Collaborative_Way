package com.lspsoftwares.collaborativeway.nucleo.entidades.projetos;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    private String uid;
    private String nome;
    private String dono;
    private String descricao;
    private String etapaUid;
    private String tarefaPreUid;
    private String tarefaPosUid;
    private long previsao;
    private long inicioProgramado;
    private long inicioReal;
    private long fimProgramado;
    private long fimReal;
    private int prioridade;
    private int status = StatusValues.NAO_INICIADO;
    private List<String> responsaveis;
    private boolean colaborativo = false;
    private int maxColaboradores;
    private List<String> colaboradores;
    private String relatorio;

    public Tarefas() {
        responsaveis = new ArrayList<>();
        colaboradores = new ArrayList<>();
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

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEtapaUid() {
        return etapaUid;
    }

    public void setEtapaUid(String etapaUid) {
        this.etapaUid = etapaUid;
    }

    public String getTarefaPreUid() {
        return tarefaPreUid;
    }

    public void setTarefaPreUid(String tarefaPreUid) {
        this.tarefaPreUid = tarefaPreUid;
    }

    public String getTarefaPosUid() {
        return tarefaPosUid;
    }

    public void setTarefaPosUid(String tarefaPosUid) {
        this.tarefaPosUid = tarefaPosUid;
    }

    public long getPrevisao() {
        return previsao;
    }

    public void setPrevisao(long previsao) {
        this.previsao = previsao;
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

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<String> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(List<String> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public boolean isColaborativo() {
        return colaborativo;
    }

    public void setColaborativo(boolean colaborativo) {
        this.colaborativo = colaborativo;
    }

    public int getMaxColaboradores() {
        return maxColaboradores;
    }

    public void setMaxColaboradores(int maxColaboradores) {
        this.maxColaboradores = maxColaboradores;
    }

    public List<String> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<String> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
}
