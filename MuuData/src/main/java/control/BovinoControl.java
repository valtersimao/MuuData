/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import model.Bovino;
import model.dao.BovinoDAO;

/**
 *
 * @author Arthur
 */
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
}
