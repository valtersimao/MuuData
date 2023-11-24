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
import model.Doenca;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class DoencaDAO implements DAO{
    Connection c;

    public DoencaDAO() {
        this.c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Doenca doenca = (Doenca) entite;
        String sql = "INSERT INTO muudata.doencas(nome, descricao, tratamento, gravidade) VALUES(?,?,?,?) RETURNIG id";
        
        try(PreparedStatement trans = c.prepareStatement(sql)){
            trans.setString(1, doenca.getNome());
            trans.setString(2, doenca.getDesricao());
            trans.setString(3, doenca.getTratamento());
            trans.setString(4, doenca.getGravidade());
            
            ResultSet result = trans.executeQuery();
            
            if(result.next()) {
                doenca.setIdDoenca(result.getInt("id"));
                for (int i = 0; i < doenca.getSintomas().size(); i++) {
                    insertSintoma(doenca.getIdDoenca(), doenca.getSintomas().get(i));
                }
                return true;
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(DoencaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    
    private int insertSintoma(int id_doenca, String sintoma) {
        String sql = "INSERT INTO muudata.sintomas(id_doenca, descricao) VALUES (?,?) RETURNIG ID";
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, id_doenca);
            trans.setString(2, sintoma);
            
            ResultSet resultado = trans.executeQuery();
            
            if(resultado.next()) {
                return resultado.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(DoencaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
