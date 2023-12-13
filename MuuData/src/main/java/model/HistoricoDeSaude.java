
package model;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoricoDeSaude {
    private int id;
    private int idBovino;
    private String descricao;
    private String tratamento;
    private String observacoes;
    
    private ArrayList<Vacina> vacinas;
    private ArrayList<Doenca> doencas;

    public HistoricoDeSaude(int idBovino, String descricao, String tratamento, String observacoes) {
        this.idBovino = idBovino;
        this.descricao = descricao;
        this.tratamento = tratamento;
        this.observacoes = observacoes;
        
        this.vacinas = new ArrayList<>();
        this.doencas = new ArrayList<>();
    }

    public HistoricoDeSaude(int id, int idBovino, String descricao, String tratamento, String observacoes) {
        this.id = id;
        this.idBovino = idBovino;
        this.descricao = descricao;
        this.tratamento = tratamento;
        this.observacoes = observacoes;
        
        this.vacinas = new ArrayList<>();
        this.doencas = new ArrayList<>();
    }

    public HistoricoDeSaude(int id, int idBovino, String descricao, String tratamento, String observacoes, ArrayList<Vacina> vacinas, ArrayList<Doenca> doencas) {
        this.id = id;
        this.idBovino = idBovino;
        this.descricao = descricao;
        this.tratamento = tratamento;
        this.observacoes = observacoes;
        
        this.vacinas = vacinas;
        this.doencas = doencas;
    }
    
    
}
