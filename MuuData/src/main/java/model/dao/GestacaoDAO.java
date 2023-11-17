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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Gestacao;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class GestacaoDAO implements DAO {

    private Connection c;

    public GestacaoDAO() {
        this.c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Gestacao gestacao = (Gestacao) entite;
        String sql = "INSERT INTO muudata.gestacao (id_bovino, data_evento, tipo_atividade, situacao_gestacao) VALUES (?,?,?,?) returning id";

        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, gestacao.getIdBovino());
            trans.setDate(2, new Date(gestacao.getDataEvento().getTimeInMillis()));
            trans.setString(3, gestacao.getTipoAtividade());
            trans.setString(4, gestacao.getSituacaoGestacao());

            ResultSet result = trans.executeQuery();
            if (result.next()) {
                gestacao.setId(result.getInt("id"));
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(GestacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean update(Object entite) {
        Gestacao gestacao = (Gestacao) entite;
        String sql = "UPDATE muudata.gestacao SET situacao_gestacao = ?, data_evento = ? WHERE id = ?";
        
        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, gestacao.getSituacaoGestacao());
            if(gestacao.getDataEvento()== null) {
                trans.setDate(2, null);
            }else {
                trans.setDate(6, new java.sql.Date(gestacao.getDataEvento().getTimeInMillis()));
            }
            trans.setInt(3, gestacao.getId());
            
            trans.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GestacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getById(long id) {
        Gestacao retorno;
        String sql = "SELECT id_bovino, data_evento, tipo_atividade, situacao_gestacao FROM muudata.gestacao WHERE id = ?";

        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, (int) id);

            ResultSet resultado = trans.executeQuery();

            if (resultado.next()) {
                Calendar dataEvento = Calendar.getInstance();
                dataEvento.setTime(resultado.getDate("data_evento"));
                retorno = new Gestacao(resultado.getInt("id_bovino"),
                        dataEvento, resultado.getString("tipo_atividade"), "situacao_gestacao");
                return retorno;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Object> getAll() {
        ArrayList<Object> retorno = new ArrayList<>();
        String sql = "SELECT id_bovino, data_evento, tipo_atividade, situacao_gestacao FROM muudata.gestacao";

        try (PreparedStatement trans = c.prepareStatement(sql)) {

            ResultSet resultado = trans.executeQuery();

            while (resultado.next()) {
                Gestacao gestacao = new Gestacao();
                Calendar dataEvento = Calendar.getInstance();
                dataEvento.setTime(resultado.getDate("data_evento"));
                gestacao = new Gestacao(resultado.getInt("id_bovino"),
                        dataEvento, resultado.getString("tipo_atividade"), "situacao_gestacao");
                retorno.add(gestacao);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
