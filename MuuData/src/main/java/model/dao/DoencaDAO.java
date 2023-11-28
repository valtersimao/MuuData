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
import model.Doenca;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class DoencaDAO implements DAO {

    Connection c;

    public DoencaDAO() {
        this.c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Doenca doenca = (Doenca) entite;
        String sql = "INSERT INTO muudata.historico_doenca (id_historico, id_doenca, data_evento, observacoes, estado)"
                + " VALUES(?,?,?,?,?) RETURNING ID";

        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, doenca.getIdHistorico());
            trans.setInt(2, doenca.getIdDoenca());
            trans.setDate(3, java.sql.Date.valueOf(doenca.getDataEvento()));
            trans.setString(4, doenca.getObservacoes());
            trans.setShort(5, doenca.getEstado());

            ResultSet result = trans.executeQuery();

            if (result.next()) {
                doenca.setId(result.getInt("id"));
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
        ArrayList<Doenca> retorno = new ArrayList<>();
        
        String sql = "SELECT D.nome, D.tratamento, D.gravidade, D.id_doenca, D.descricao, H.id,H.id_doenca, H.data_evento, H.observacoes, H.estado"
                + " FROM muudata.historico_doenca H JOIN muudata.doencas D ON H.id_doenca = D.id_doenca "
                + "WHERE H.id_historico = ?";

        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, (int) id);
            
            ResultSet result = trans.executeQuery();
            while (result.next()) {
                Doenca temp = new Doenca(result.getInt("id_deonca"),
                        result.getString("nome"),
                        result.getString("descricao"),
                        getSintoma(result.getInt("id_deonca")),
                        result.getString("tratamento"),
                        result.getString("gravidade"),
                        result.getDate("data_evento").toLocalDate(),
                        result.getShort("estado"),
                        result.getString("observacoes"),
                        (int)id,
                        result.getInt("id"));
                
                retorno.add(temp);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(DoencaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    @Override
    public ArrayList<Object> getAll() {
        ArrayList<Object> retorno = new ArrayList<>();
        String sql = "SELECT D.nome, D.tratamento, D.gravidade, D.id_doenca, D.descricao, H.id, H.id_historico, H.id_doenca, H.data_evento, H.observacoes, H.estado"
                + " FROM muudata.historico_doenca H JOIN muudata.doencas D ON H.id_doenca = D.id_doenca";

        try (PreparedStatement trans = c.prepareStatement(sql)) {
            ResultSet result = trans.executeQuery();
            while (result.next()) {
                Doenca temp = new Doenca(result.getInt("id_deonca"),
                        result.getString("nome"),
                        result.getString("descricao"),
                        getSintoma(result.getInt("id_deonca")),
                        result.getString("tratamento"),
                        result.getString("gravidade"),
                        result.getDate("data_evento").toLocalDate(),
                        result.getShort("estado"),
                        result.getString("observacoes"),
                        result.getInt("id_historico"),
                        result.getInt("id"));
                
                retorno.add(temp);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(DoencaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private ArrayList<String> getSintoma(int id) {
        ArrayList<String> retorno = new ArrayList<>();
        String sql = "SELECT descricao FROM muudata.sintomas WHERE id_doenca = ?";

        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, id);

            ResultSet result = trans.executeQuery();
            while (result.next()) {
                retorno.add(result.getString("descricao"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(DoencaGenericaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
