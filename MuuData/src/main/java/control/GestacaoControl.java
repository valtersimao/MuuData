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

    public Gestacao insert(int idBovino, int tipoAtividade, int situacaoGestacao, String data) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataEvento = LocalDate.parse(data, formatter);

            Gestacao gest = new Gestacao(idBovino, dataEvento, tipoAtividade, situacaoGestacao);

            if (dao.insert(gest)) {
                return gest;
            }
            
            return null;
        } catch (DateTimeParseException e) {
            return null;
        }
    }

    public boolean update(Gestacao gestacao) {
        return this.dao.update(gestacao);
    }

    public Gestacao update(String data, int tipo, int situacao, int id) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataEvento = LocalDate.parse(data, formatter);

            Gestacao gest = new Gestacao(id, dataEvento, situacao);
            gest.setTipoAtividade(tipo);
            
            if (this.update(gest)) {
                return gest;
            }
            
            return null;
        } catch (DateTimeParseException e) {
            return null;
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
