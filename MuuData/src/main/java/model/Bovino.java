package model;

import java.util.Calendar;

public class Bovino {
    public static final boolean MACHO = true, FEMEA = false;
    
    private int brinco;
    private int identificador;
    private String nome;
    private String raca;
    private boolean sexo;
    private Calendar nascimento;
    private Integer peso;
    private Integer idMae;

    public int getBrinco() {
        return brinco;
    }

    public void setBrinco(int brinco) {
        this.brinco = brinco;
    }

    public int getIdMae() {
        return idMae;
    }

    public void setIdMae(int idMae) {
        this.idMae = idMae;
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
        char sex = sexo ? 'M' : 'F';
        if(nome == null) {
            return brinco + " :  ("+ sex+")";
        }
        return brinco + " : " + nome + " ("+ sex+")";
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
