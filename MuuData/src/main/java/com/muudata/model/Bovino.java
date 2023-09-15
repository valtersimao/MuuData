/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muudata.model;

import java.sql.Date;

/**
 *
 * @author 0068943
 */
public class Bovino {
    private int brinco;
    private int identificador;
    private String nome;
    private String raca;
    private boolean sexo; // macho-1 ; femea-0
    private Date nascimento;
    private int peso;

    public int getBrinco() {
        return brinco;
    }

    public void setBrinco(int brinco) {
        this.brinco = brinco;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Bovino{" + "brinco=" + brinco + ", identificador=" + identificador + ", nome=" + nome + ", raca=" + raca + ", sexo=" + sexo + ", nascimento=" + nascimento + ", peso=" + peso + '}';
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
