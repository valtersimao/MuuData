package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Gestacao;
import model.dao.GestacaoDAO;

public class GestacaoControl {

    private GestacaoDAO dao;

    public GestacaoControl() {
        this.dao = new GestacaoDAO();
    }

    public boolean insert(String data, int idBovino, int tipoAtividade, int situacaoGestacao) {
        try {
            Calendar c = convertToCalendar(data);

            Gestacao gest = new Gestacao(idBovino, c, tipoAtividade, situacaoGestacao);

            return dao.insert(gest);
        } catch (ParseException ex) {
            return false;
        }
    }

    public boolean update(Gestacao gestacao) {
        return this.dao.update(gestacao);
    }

    public boolean update(String data, int idBovino,int id) {
        try {
            Calendar c = convertToCalendar(data);
            
            Gestacao gest = new Gestacao(id, c, idBovino);
            
            return dao.update(gest);
            
        } catch (ParseException ex) {
            return false;
        }
    }
    
    public ArrayList<Gestacao> getById(int id) {
        return (ArrayList<Gestacao>)this.dao.getById(id);
    }
    
    public ArrayList<Gestacao> getAll() {
        ArrayList<Gestacao> retorno = new ArrayList<>();
        ArrayList<Object> temp = this.dao.getAll();
        
        temp.forEach(it -> {
            retorno.add((Gestacao)it);
        });
        
        return retorno;
    }
    
    public ArrayList<Gestacao> getWithFilter(Gestacao gest) {
        ArrayList<Gestacao> retorno = new ArrayList<>();
        ArrayList<Object> temp = this.dao.getWithFilter(gest);
        
        temp.forEach(it -> {
            retorno.add((Gestacao)it);
        });
        
        return retorno;
    }
    
    public ArrayList<Gestacao> getWithFilter(int situacaoGestacao) {
        Gestacao gest = new Gestacao();
        gest.setSituacaoGestacao(situacaoGestacao);
        
        ArrayList<Gestacao> retorno = new ArrayList<>();
        ArrayList<Object> temp = this.dao.getWithFilter(gest);
        
        temp.forEach(it -> {
            retorno.add((Gestacao)it);
        });
        
        return retorno;
    }

    private Calendar convertToCalendar(String source) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        Date dataNascimento = dateFormat.parse(source);
        Calendar c = Calendar.getInstance();
        c.setTime(dataNascimento);
        
        return c;
    }
}
