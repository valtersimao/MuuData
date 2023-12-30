package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doenca;
import model.HistoricoDeSaude;
import model.Vacina;
import tools.FactoryPostgres;

public class HistoricoDeSaudeDAO implements DAO{
    private Connection c;
    
    public HistoricoDeSaudeDAO(){
        this.c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        HistoricoDeSaude historico = (HistoricoDeSaude) entite;
        String sql = "INSERT INTO muudata.historico_de_saude (id_bovino, descricao, observacoes, tratamento) VALUES (?,?,?,?) RETURNING id";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, historico.getIdBovino());
            trans.setString(2, historico.getDescricao());
            trans.setString(3, historico.getObservacoes());
            trans.setString(4, historico.getTratamento());
            
            ResultSet result = trans.executeQuery();
            if(result.next()) {
                historico.setId(result.getInt("id"));
                return true;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Object entite) {
        HistoricoDeSaude historico = (HistoricoDeSaude) entite;
        
        String sql = "UPDATE muudata.historico_de_saude SET descricao = ?, observacoes = ?, tratamento = ? WHERE id = ?";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, historico.getDescricao());
            trans.setString(2, historico.getObservacoes());
            trans.setString(3, historico.getTratamento());
            trans.setInt(4, historico.getId());
            
            trans.execute();
            return true;
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        
    }

    @Override
    public boolean delete(long id) {
        //TODO
        String sql = "DELETE FROM muudata.historico_de_saude WHERE id = ?";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, (int)id);
            
            trans.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public Object getById(long id) {
        HistoricoDeSaude historico = null;
        String sql = "SELECT id, observacoes, descricao, tratamento FROM muudata.historico_de_saude WHERE id_bovino = ?";
        
        try(PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, (int)id);
            
            ResultSet result = trans.executeQuery();
            if(result.next()) {
                historico = new HistoricoDeSaude(result.getInt("id"),
                        (int)id,
                        result.getString("descricao"),
                        result.getString("tratamento"),
                        result.getString("observacoes"),
                        (ArrayList<Vacina>)new VacinaDAO().getById(result.getInt("id")),
                        (ArrayList<Doenca>)new DoencaDAO().getById(result.getInt("id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDeSaudeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historico;
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
