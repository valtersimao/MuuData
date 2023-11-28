
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
    private String detalhes;
    private short dosesRecomendadas;
    
    private int idHistorico;
    private LocalDate dataEvento;
    private short dose;
    private int idRelacionamento;

    public Vacina(int idVacina, String nome, short dosesRecomendadas, String detalhes) {
        this.detalhes = detalhes;
        this.idVacina = idVacina;
        this.nome = nome;
        this.dosesRecomendadas = dosesRecomendadas;
    }

    public Vacina(String nome, short dosesRecomendadas, String detalhes) {
        this.detalhes = detalhes;
        this.nome = nome;
        this.dosesRecomendadas = dosesRecomendadas;
    }

    public Vacina(int idVacina, String nome, short dosesRecomendadas, String detalhes, int idHistorico, LocalDate dataEvento, short dose) {
        this.detalhes = detalhes;
        this.idVacina = idVacina;
        this.nome = nome;
        this.dosesRecomendadas = dosesRecomendadas;
        this.idHistorico = idHistorico;
        this.dataEvento = dataEvento;
        this.dose = dose;
    }
    
    
}
