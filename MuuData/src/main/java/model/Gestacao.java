
package model;

import java.util.Calendar;

public class Gestacao {
    
    private int id;
    private int idBovino;
    private Calendar dataEvento;
    private String tipoAtividade;
    private String situacaoGestacao;

    public Gestacao() {
    }

    public Gestacao(int id, int idBovino, Calendar dataEvento, String tipoAtividade, String situacaoGestacao) {
        this.id = id;
        this.idBovino = idBovino;
        this.dataEvento = dataEvento;
        this.tipoAtividade = tipoAtividade;
        this.situacaoGestacao = situacaoGestacao;
    }
    
    public Gestacao(int idBovino, Calendar dataEvento, String tipoAtividade, String situacaoGestacao) {
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

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public String getSituacaoGestacao() {
        return situacaoGestacao;
    }

    public void setSituacaoGestacao(String situacaoGestacao) {
        this.situacaoGestacao = situacaoGestacao;
    }
    
    
}
