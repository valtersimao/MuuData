package control;

import java.util.ArrayList;
import model.Bovino;
import model.dao.BovinoDAO;

public class BovinoControl {
    private BovinoDAO dao;

    public BovinoControl() {
        this.dao = new BovinoDAO();
    }
    
    public boolean insert(Bovino bovino) {
        return this.dao.insert(bovino);
    }
    public boolean insertSemPeso(Bovino bovino) {
        return this.dao.insertSemPeso(bovino);
    }
    
    public ArrayList<Bovino> getAll() {
        ArrayList<Object> retorno = this.dao.getAll();
        ArrayList<Bovino> bovinos = new ArrayList<>();
        
        retorno.forEach((it) -> {
            bovinos.add((Bovino) it);
        });
        
        return bovinos;
    }
}
