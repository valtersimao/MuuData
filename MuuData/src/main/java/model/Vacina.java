
package model;

import java.time.LocalTime;

public class Vacina {
    private int idVacina;
    private String nome;
    private String detalhes;
    private short dosesRecomendadas;
    
    private int idHistorico;
    private LocalTime dataEvento;
    private short dose;

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

    public Vacina(int idVacina, String nome, short dosesRecomendadas, String detalhes, int idHistorico, LocalTime dataEvento, short dose) {
        this.detalhes = detalhes;
        this.idVacina = idVacina;
        this.nome = nome;
        this.dosesRecomendadas = dosesRecomendadas;
        this.idHistorico = idHistorico;
        this.dataEvento = dataEvento;
        this.dose = dose;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public int getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(int idVacina) {
        this.idVacina = idVacina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getDosesRecomendadas() {
        return dosesRecomendadas;
    }

    public void setDosesRecomendadas(short dosesRecomendadas) {
        this.dosesRecomendadas = dosesRecomendadas;
    }

    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }

    public LocalTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalTime dataEvento) {
        this.dataEvento = dataEvento;
    }

    public short getDose() {
        return dose;
    }

    public void setDose(short dose) {
        this.dose = dose;
    }
    
    
}
