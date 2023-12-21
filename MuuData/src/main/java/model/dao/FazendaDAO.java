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
import model.Fazenda;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class FazendaDAO implements DAO{
    
    Connection c;
    
    public FazendaDAO(){
        this.c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Fazenda fazenda = (Fazenda) entite;
        
        String sql = "INSERT INTO muudata.fazenda (nome, email, senha, tipo_de_criacao) VALUES (?,?,?,?)";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, fazenda.getNome());
            trans.setString(2, fazenda.getEmail());
            trans.setString(3, fazenda.getSenha());
            trans.setInt(4, fazenda.getTipoCriacao());
            
            trans.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(FazendaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public Fazenda getByName(String name) {
        String sql = "SELECT nome, email, senha, tipo_de_criacao FROM muudata.fazenda WHERE nome = ?";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, name);
            
            ResultSet result = trans.executeQuery();
            
            if(result.next()) {
                return new Fazenda(name,
                        result.getString("email"),
                        result.getInt("tipo_de_criacao"),
                        result.getString("senha"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(FazendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Object> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean updatePassword(String name, String password) {
        String sql = "UPDATE muudata.fazenda SET senha = ? WHERE name = ?";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, password);
            trans.setString(2, name);
            
            trans.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(FazendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
