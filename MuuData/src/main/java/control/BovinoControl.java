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
    
    public ArrayList<Bovino> getAll() {
        ArrayList<Object> retorno = this.dao.getAll();
        ArrayList<Bovino> bovinos = new ArrayList<>();
        
        retorno.forEach((it) -> {
            bovinos.add((Bovino) it);
        });
        
        return bovinos;
    }
    
    public Bovino getById(long id) {
        return (Bovino) this.dao.getById(id);
    }
    
    public ArrayList<Bovino> getFemale() {
        ArrayList<Object> retorno = this.dao.getFemale();
        ArrayList<Bovino> bovinos = new ArrayList<>();
        
        retorno.forEach((it) -> {
            bovinos.add((Bovino) it);
        });
        
        return bovinos;
    }
    
    public ArrayList<Bovino> getWithFilter(Bovino filter) {
        ArrayList<Object> retorno = this.dao.getWithFilter(filter);
        ArrayList<Bovino> bovinos = new ArrayList<>();
        
        retorno.forEach((it) -> {
            bovinos.add((Bovino) it);
        });
        
        return bovinos;
    }
    
    public boolean delete(Bovino bovino) {
        return this.dao.delete(bovino.getIdentificador());
    }
    
    public boolean delete(int id) {
        return this.dao.delete(id);
    }
    
    public boolean update(Bovino bovino) {
        return this.dao.update(bovino);
    }
}
