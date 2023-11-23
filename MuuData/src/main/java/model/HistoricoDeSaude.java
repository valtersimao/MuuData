
package model;

import java.util.ArrayList;


public class HistoricoDeSaude {
    private int id;
    private int idBovino;
    private String descricao;
    private String observacoes;
    
    private ArrayList<Vacina> vacinas;
    private ArrayList<Doenca> doencas;

    public HistoricoDeSaude(int idBovino, String descricao, String observacoes) {
        this.idBovino = idBovino;
        this.descricao = descricao;
        this.observacoes = observacoes;
        
        this.vacinas = new ArrayList<>();
        this.doencas = new ArrayList<>();
    }

    public HistoricoDeSaude(int id, int idBovino, String descricao, String observacoes) {
        this.id = id;
        this.idBovino = idBovino;
        this.descricao = descricao;
        this.observacoes = observacoes;
        
        this.vacinas = new ArrayList<>();
        this.doencas = new ArrayList<>();
    }

    public HistoricoDeSaude(int id, int idBovino, String descricao, String observacoes, ArrayList<Vacina> vacinas, ArrayList<Doenca> doencas) {
        this.id = id;
        this.idBovino = idBovino;
        this.descricao = descricao;
        this.observacoes = observacoes;
        this.vacinas = vacinas;
        this.doencas = doencas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBovino() {
        return idBovino;
    }

    public void setIdBovino(int idBovino) {
        this.idBovino = idBovino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public ArrayList<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(ArrayList<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    public ArrayList<Doenca> getDoencas() {
        return doencas;
    }

    public void setDoencas(ArrayList<Doenca> doencas) {
        this.doencas = doencas;
    }
    
    
}
