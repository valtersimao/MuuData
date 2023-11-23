package control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import model.Gestacao;
import model.dao.GestacaoDAO;

public class GestacaoControl {

    private GestacaoDAO dao;

    public GestacaoControl() {
        this.dao = new GestacaoDAO();
    }

    public boolean insert(String data, int idBovino, int tipoAtividade, int situacaoGestacao) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataEvento = LocalDate.parse(data, formatter);

            Gestacao gest = new Gestacao(idBovino, dataEvento, tipoAtividade, situacaoGestacao);

            return dao.insert(gest);
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public boolean update(Gestacao gestacao) {
        return this.dao.update(gestacao);
    }

    public boolean update(String data, int idBovino, int id) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataEvento = LocalDate.parse(data, formatter);

            Gestacao gest = new Gestacao(id, dataEvento, idBovino);

            return dao.update(gest);
        } catch (DateTimeParseException e) {
            return false;
        }

    }

    public ArrayList<Gestacao> getById(int id) {
        return (ArrayList<Gestacao>) this.dao.getById(id);
    }

    public ArrayList<Gestacao> getAll() {
        ArrayList<Gestacao> retorno = new ArrayList<>();
        ArrayList<Object> temp = this.dao.getAll();

        temp.forEach(it -> {
            retorno.add((Gestacao) it);
        });

        return retorno;
    }

    public ArrayList<Gestacao> getWithFilter(Gestacao gest) {
        ArrayList<Gestacao> retorno = new ArrayList<>();
        ArrayList<Object> temp = this.dao.getWithFilter(gest);

        temp.forEach(it -> {
            retorno.add((Gestacao) it);
        });

        return retorno;
    }

    public ArrayList<Gestacao> getWithFilter(int situacaoGestacao) {
        Gestacao gest = new Gestacao();
        gest.setSituacaoGestacao(situacaoGestacao);

        ArrayList<Gestacao> retorno = new ArrayList<>();
        ArrayList<Object> temp = this.dao.getWithFilter(gest);

        temp.forEach(it -> {
            retorno.add((Gestacao) it);
        });

        return retorno;
    }

}
