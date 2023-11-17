
package model;

import java.util.Calendar;

public class Gestacao {
    
    private int id;
    private int idBovino;
    private Calendar dataEvento;
    private int tipoAtividade;
    private int situacaoGestacao;

    public Gestacao() {
    }

    public Gestacao(int id, int idBovino, Calendar dataEvento, int tipoAtividade, int situacaoGestacao) {
        this.id = id;
        this.idBovino = idBovino;
        this.dataEvento = dataEvento;
        this.tipoAtividade = tipoAtividade;
        this.situacaoGestacao = situacaoGestacao;
    }
    
    public Gestacao(int idBovino, Calendar dataEvento, int tipoAtividade, int situacaoGestacao) {
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

    public Calendar getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Calendar dataEvento) {
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
