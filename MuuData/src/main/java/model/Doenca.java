package model;

import java.time.LocalDate;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
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
    private int id;

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
    
}
