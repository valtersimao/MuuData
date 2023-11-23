/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import model.Vacina;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class VacinaGenericaDAO implements DAO{
    
    private Connection c;
    
    public VacinaGenericaDAO(){
        c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Vacina vacina = (Vacina) entite;
        String sql = "INSERT INTO muudata.vacina(nome, doses_recomendadas, detalhes) VALUES (?,?,?) RETURNIG id";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, vacina.getNome());
            trans.setInt(2, vacina.getDosesRecomendadas());
            trans.setString(3, vacina.getDetalhes());
            
            ResultSet result = trans.executeQuery();
            if(result.next()){
                vacina.setIdVacina(result.getInt("id"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VacinaGenericaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Object entite) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
