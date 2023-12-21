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
        String sql = "INSERT INTO muudata.vacinas(nome, doses_recomendadas, descricao) VALUES (?,?,?) returning id";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, vacina.getNome());
            trans.setInt(2, vacina.getDosesRecomendadas());
            trans.setString(3, vacina.getDescricao());
            
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
        Vacina vacina = (Vacina) entite;
        String sql = "UPDATE FROM muudata.vacinas SET nome = ?, doses_recomendadas = ?, descricao = ? WHERE id = ?";

        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, vacina.getNome());
            trans.setInt(2, vacina.getDosesRecomendadas());
            trans.setString(3, vacina.getDescricao());
            trans.setInt(4, vacina.getIdVacina());

            trans.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean delete(long id) {
        String sql = "DELETE FROM muudata.vacinas WHERE id = ?";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, (int) id);
            
            trans.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(VacinaGenericaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Object getById(long id) {
        Vacina retorno = null;
        String sql = "SELECT nome, doses_recomendadas, descricao FROM muudata.vacinas WHERE id = ?";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, (int) id);
            
            ResultSet resultado = trans.executeQuery();
            
            while(resultado.next()) {
                retorno = new Vacina(resultado.getInt("id"), 
                        resultado.getString("nome"),
                        resultado.getShort("doses_recomendadas"),
                        resultado.getString("descricao"));
                return retorno;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(VacinaGenericaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public ArrayList<Object> getAll() {
        ArrayList<Object> retorno = new ArrayList<>();
        
        String sql = "SELECT id, nome, doses_recomendadas, descricao FROM muudata.vacinas ORDER BY id;";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            ResultSet resultado = trans.executeQuery();
            
            while(resultado.next()) {
                Vacina atual = new Vacina(resultado.getInt("id"), 
                        resultado.getString("nome"),
                        resultado.getShort("doses_recomendadas"),
                        resultado.getString("descricao"));
                retorno.add(atual);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(VacinaGenericaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return retorno;
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
