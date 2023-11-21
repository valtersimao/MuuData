
package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            Date dataNascimento = dateFormat.parse(data);
            Calendar c = Calendar.getInstance();
            c.setTime(dataNascimento);
            
            Gestacao gest = new Gestacao(idBovino, c, tipoAtividade, situacaoGestacao);
            
            return dao.insert(gest);
        } catch (ParseException ex) {
            Logger.getLogger(GestacaoControl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
