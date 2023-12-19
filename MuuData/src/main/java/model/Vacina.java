package model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vacina {
    private int idVacina;
    private String nome;
    private String descricao;
    private short dosesRecomendadas;
    
    private int idHistorico;
    private LocalDate dataEvento;
    private short dose;
    private int idRelacionamento;

    public Vacina(int idVacina, String nome, short dosesRecomendadas, String prioridade) {
        this.descricao = prioridade;
        this.idVacina = idVacina;
        this.nome = nome;
        this.dosesRecomendadas = dosesRecomendadas;
    }
    
    public Vacina(String nome, short dosesRecomendadas, String prioridade, int idHistorico, LocalDate dataEvento, short dose) {
        this.descricao = prioridade;
        this.nome = nome;
        this.dosesRecomendadas = dosesRecomendadas;
        this.idHistorico = idHistorico;
        this.dataEvento = dataEvento;
        this.dose = dose;
    }
    
    public Vacina(int idVacina, String nome, short dosesRecomendadas, String prioridade, int idHistorico, LocalDate dataEvento, short dose, int idRelacionamento) {
        this.descricao = prioridade;
        this.idVacina = idVacina;
        this.nome = nome;
        this.dosesRecomendadas = dosesRecomendadas;
        this.idHistorico = idHistorico;
        this.dataEvento = dataEvento;
        this.dose = dose;
        this.idRelacionamento = idRelacionamento;
    }

    @Override
    public String toString() {
        return "Vacina : " + nome;
    }
}