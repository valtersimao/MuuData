/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Gestacao;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class GestacaoDAO implements DAO{
    
    private Connection c;
    
    public GestacaoDAO() {
        this.c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Gestacao gestacao = (Gestacao) entite;
        String sql = "INSERT INTO muudata.gestacao (id_bovino, data_evento, tipo_atividade, situacao_gestacao) VALUES (?,?,?,?)";
        
        try(PreparedStatement trans = c.prepareStatement(sql)){
            trans.setInt(1, gestacao.getIdBovino());
            trans.setDate(2, new Date(gestacao.getDataEvento().getTimeInMillis()));
            trans.setString(3, gestacao.getTipoAtividade());
            trans.setString(4, gestacao.getSituacaoGestacao());
            
            trans.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GestacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
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
        Gestacao retorno = new Gestacao();
        String sql = "SELECT id_bovino, data_evento, tipo_atividade, situacao_gestacao FROM muudata.gestacao WHERE id_bovino = ?";
        
        try(PreparedStatement trans = c.prepareStatement(sql)){
            trans.setInt(1, (int)id);
            
            ResultSet resultado = trans.executeQuery();
            
            if(resultado.next()) {
                retorno = new Gestacao(resultado.getInt("id_bovino"), 
                        dataEvento, sql, sql)
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
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
