/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 0068943
 */
public class Doenca {
    public static final int EM_TRATAMENTO = 0, CURADA = 1, SEM_TRATAR = 2;
    
    private int idDoenca;
    private String nome;
    private String desricao;
    private ArrayList<String> sintomas;
    private String tratamento;
    private String gravidade;
    
    private LocalDate dataEvento;
    private short estado;
    private String observacoes;
    private int idHistorico;

    public Doenca(int id_doenca, String nome, String desricao, ArrayList<String> sintomas, String tratamento, String gravidade) {
        //Criação de uma doenca genérica
        this.idDoenca = id_doenca;
        this.nome = nome;
        this.desricao = desricao;
        this.sintomas = sintomas;
        this.tratamento = tratamento;
        this.gravidade = gravidade;
    }
    
    public Doenca(String nome, String desricao, ArrayList<String> sintomas, String tratamento, String gravidade) {
        //Criação de uma doenca genérica, sem seu id
        this.nome = nome;
        this.desricao = desricao;
        this.sintomas = sintomas;
        this.tratamento = tratamento;
        this.gravidade = gravidade;
    }
    
    public Doenca(int idDoenca, String nome, String desricao, ArrayList<String> sintomas, String tratamento, String gravidade, LocalDate dataEvento, short estado, String observacoes, int idHistorico) {
        this.idDoenca = idDoenca;
        this.nome = nome;
        this.desricao = desricao;
        this.sintomas = sintomas;
        this.tratamento = tratamento;
        this.gravidade = gravidade;
        this.dataEvento = dataEvento;
        this.estado = estado;
        this.observacoes = observacoes;
        this.idHistorico = idHistorico;
    }

    public int getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(int idDoenca) {
        this.idDoenca = idDoenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesricao() {
        return desricao;
    }

    public void setDesricao(String desricao) {
        this.desricao = desricao;
    }

    public ArrayList<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList<String> sintomas) {
        this.sintomas = sintomas;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }
    
    
}
