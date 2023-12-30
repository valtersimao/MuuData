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

public class DoencaGenericaDAO implements DAO {

    Connection c;

    public DoencaGenericaDAO() {
        this.c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Doenca doenca = (Doenca) entite;
        String sql = "INSERT INTO muudata.doencas(nome, descricao, tratamento, gravidade) VALUES(?,?,?,?) RETURNIG id";

        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, doenca.getNome());
            trans.setString(2, doenca.getDesricao());
            trans.setString(3, doenca.getTratamento());
            trans.setString(4, doenca.getGravidade());

            ResultSet result = trans.executeQuery();

            if (result.next()) {
                doenca.setIdDoenca(result.getInt("id"));
                for (int i = 0; i < doenca.getSintomas().size(); i++) {
                    insertSintoma(doenca.getIdDoenca(), doenca.getSintomas().get(i));
                }
                return true;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(DoencaGenericaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Object entite) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(long id) {
        String sql = "DELETE FROM muudata.sintomas WHERE id_doenca = ?;";
        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, (int) id);

            trans.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(VacinaGenericaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        sql = "DELETE FROM muudata.doencas WHERE id = ";
        try (PreparedStatement trans = c.prepareStatement(sql)) {
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> getAll() {
        ArrayList<Object> retorno = new ArrayList<>();
        String sql = "SELECT id, nome, descricao, tratamento, gravidade FROM muudata.doencas ORDER BY nome";
        try (PreparedStatement trans = c.prepareStatement(sql)) {
            ResultSet resultado = trans.executeQuery();
            while (resultado.next()) {
                Doenca temp = new Doenca(resultado.getInt("id"), 
                        resultado.getString("nome"), 
                        resultado.getString("descricao"),
                        getSintoma(resultado.getInt("id")), 
                        resultado.getString("tratamento"), 
                        resultado.getString("gravidade"));
                retorno.add(temp);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(DoencaGenericaDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    private int insertSintoma(int id_doenca, String sintoma) {
        String sql = "INSERT INTO muudata.sintomas(id_doenca, descricao) VALUES (?,?) RETURNIG ID";
        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setInt(1, id_doenca);
            trans.setString(2, sintoma);

            ResultSet resultado = trans.executeQuery();

            if (resultado.next()) {
                return resultado.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(DoencaGenericaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
