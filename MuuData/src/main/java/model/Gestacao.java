
package model;

import java.time.LocalDate;

public class Gestacao {
    public static final int EM_ANDAMENTO = 0, FINALIZADA = 1, ABORTADA = 2;
    public static final int NATURAL = 0, ARTIFICIAL = 1;
    
    private int id;
    private int idBovino;
    private LocalDate dataEvento;
    private int tipoAtividade;
    private int situacaoGestacao;

    public Gestacao() {
    }

    public Gestacao(int id, LocalDate dataEvento, int situacaoGestacao) {
        this.id = id;
        this.dataEvento = dataEvento;
        this.situacaoGestacao = situacaoGestacao;
    }
    
    public Gestacao(int id, int idBovino, LocalDate dataEvento, int tipoAtividade, int situacaoGestacao) {
        this.id = id;
        this.idBovino = idBovino;
        this.dataEvento = dataEvento;
        this.tipoAtividade = tipoAtividade;
        this.situacaoGestacao = situacaoGestacao;
    }
    
    public Gestacao(int idBovino, LocalDate dataEvento, int tipoAtividade, int situacaoGestacao) {
        this.idBovino = idBovino;
        this.dataEvento = dataEvento;
        this.tipoAtividade = tipoAtividade;
        this.situacaoGestacao = situacaoGestacao;
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

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public int getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(int tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public int getSituacaoGestacao() {
        return situacaoGestacao;
    }

    public void setSituacaoGestacao(int situacaoGestacao) {
        this.situacaoGestacao = situacaoGestacao;
    }
    
    
}
