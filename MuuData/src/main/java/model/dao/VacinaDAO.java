/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Vacina;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class VacinaDAO implements DAO{
    Connection c;
    
    public VacinaDAO() {
        this.c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Vacina vacina = (Vacina) entite;
        String sql = "INSERT INTO muudata.historico_vacina(id_historico, id_vacina, data_evento, dose) VALUES (?,?,?,?) RETURNING id";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, vacina.getIdHistorico());
            trans.setInt(2, vacina.getIdVacina());
            trans.setDate(3, java.sql.Date.valueOf(vacina.getDataEvento()));
            trans.setInt(4, vacina.getDose());
            
            ResultSet result = trans.executeQuery();
            if(result.next()) {
                vacina.setIdRelacionamento(result.getInt("id_relacionamento"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VacinaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        ArrayList<Vacina> retorno = new ArrayList<>();
        String sql = "SELECT R.data_evento, R.dose, R.id_relacionamento, V.id, V.nome, V.doses_recomendadas, V.detalhes"
                + " FROM muudata.historico_vacina R JOIN muudata.vacinas V ON V.id = R.id_vacina"
                + " WHERE R.id_historico = ?";
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, (int) id);
            ResultSet result = trans.executeQuery();
            
            while(result.next()) {
                Vacina vacina = new Vacina(result.getInt("id"), result.getString("nome"),
                        result.getString("detalhes"),
                        result.getShort("doses_recomendadas"),
                        (int)id,
                        result.getDate("data_evento").toLocalDate(),
                        result.getShort("dose"),
                        result.getInt("id_relacionamento"));
                retorno.add(vacina);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(VacinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
    }

    @Override
    public ArrayList<Object> getAll() {
        ArrayList<Object> retorno = new ArrayList<>();
        String sql = "SELECT R.id_historico, R.data_evento, R.dose, R.id_relacionamento, V.id, V.nome, V.doses_recomendadas, V.detalhes"
                + " FROM muudata.historico_vacina R JOIN muudata.vacinas V ON V.id = R.id_vacina";
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            ResultSet result = trans.executeQuery();
            while(result.next()) {
                Vacina vacina = new Vacina(result.getInt("id"), result.getString("nome"),
                        result.getString("detalhes"),
                        result.getShort("doses_recomendadas"),
                        result.getInt("id_historico"),
                        result.getDate("data_evento").toLocalDate(),
                        result.getShort("dose"),
                        result.getInt("id_relacionamento"));
                retorno.add(vacina);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(VacinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
