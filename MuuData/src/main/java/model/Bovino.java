package model;

import java.time.LocalDate;

public class Bovino {

    public static final boolean MACHO = true, FEMEA = false;
    public static final int ID_DEFAULT = 0;

    private int brinco;
    private int id;
    private String nome;
    private String raca;
    private boolean sexo;
    private LocalDate nascimento;
    private Integer peso;
    private Integer idMae;
    private int idadeMeses;

    public Bovino() {
    }

     public Bovino(int brinco, int id, String nome, Integer peso) {
        this.brinco = brinco;
        this.id = id;
        this.nome = nome;
        this.peso = peso;
    }
    
    public Bovino(int brinco, String nome, String raca, boolean sexo, Integer peso) {
        this.brinco = brinco;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.peso = peso;
        this.idMae = ID_DEFAULT;
    }

    public Bovino(int brinco, String nome, String raca, boolean sexo, LocalDate nascimento, Integer idMae) {
        this.brinco = brinco;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.idMae = idMae;
        this.peso = 0;
    }

    public Bovino(int brinco, int id, String nome, String raca, boolean sexo, LocalDate nascimento, Integer peso, Integer idMae) {
        this.brinco = brinco;
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.peso = peso;
        this.idMae = idMae;
    }

    public int getIdadeMeses() {
        return idadeMeses;
    }

    public void setIdadeMeses(int idadeMeses) {
        this.idadeMeses = idadeMeses;
    }
    
    public int getBrinco() {
        return brinco;
    }

    public void setBrinco(int brinco) {
        this.brinco = brinco;
    }

    public Integer getIdMae() {
        return idMae;
    }

    public void setIdMae(int idMae) {
        this.idMae = idMae;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int identificador) {
        this.id = identificador;
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
        if (nome == null) {
            return brinco + " :  (" + sex + ")";
        }
        return brinco + " : " + nome + " (" + sex + ")";
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
