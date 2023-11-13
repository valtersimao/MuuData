/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import model.Bovino;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class BovinoDAO implements DAO {

    private Connection c;

    public BovinoDAO() {
        c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Bovino bovino = (Bovino) entite;

        String sql = "INSERT INTO muudata.bovino(brinco, nome, peso, sexo, raca, id_mae, nascimento) "
                + "VALUES (?,?,?,?,?,?,?) returning id;";

        try (PreparedStatement trans = this.c.prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS)) {

            trans.setInt(1, bovino.getBrinco());
            trans.setString(2, bovino.getNome());
            trans.setInt(3, bovino.getPeso());
            trans.setBoolean(4, bovino.isSexo());
            trans.setString(5, bovino.getRaca());
            trans.setInt(6, bovino.getIdMae());
            trans.setDate(7, new java.sql.Date(bovino.getNascimento().getTimeInMillis()));
            trans.executeQuery();

            ResultSet resultSet = trans.getGeneratedKeys();

            if (resultSet.next()) {
                bovino.setIdentificador(resultSet.getInt("id"));

                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean insertSemPeso(Object entite) {
        Bovino bovino = (Bovino) entite;

        String sql = "INSERT INTO muudata.bovino(brinco, nome, sexo, raca, id_mae, nascimento) "
                + "VALUES (?,?,?,?,?,?) returning id;";

        try (PreparedStatement trans = this.c.prepareStatement(sql)) {

            trans.setInt(1, bovino.getBrinco());
            trans.setString(2, bovino.getNome());
            trans.setBoolean(3, bovino.isSexo());
            trans.setString(4, bovino.getRaca());
            trans.setInt(5, bovino.getIdMae());
            trans.setDate(6, new java.sql.Date(bovino.getNascimento().getTimeInMillis()));
            ResultSet resultSet = trans.executeQuery();

            //= trans.getGeneratedKeys();
            if (resultSet.next()) {
                bovino.setIdentificador(resultSet.getInt("id"));

                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Object entite) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(long id) {
        String sql = "DELETE FROM muudata.bovino WHERE id = " + id;
        try (PreparedStatement trans = c.prepareStatement(sql)) {

            trans.setLong(1, id);

            trans.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    @Override
    public Object getById(long id) {
        Bovino retorno;
        try {
            String sql = "SELECT id,brinco,nome,sexo,peso,nascimento,raca FROM muudata.bovino WHERE id = ? ORDER BY brinco ASC";
            PreparedStatement consulta = c.prepareStatement(sql);
            consulta.setLong(1, id);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                retorno = new Bovino();
                retorno.setBrinco(resultado.getInt("brinco"));
                retorno.setIdentificador(resultado.getInt("id"));
                retorno.setNome(resultado.getString("nome"));
                retorno.setPeso(resultado.getShort("peso"));
                retorno.setSexo(resultado.getBoolean("sexo"));
                retorno.setRaca(resultado.getString("raca"));
                if (resultado.getDate("nascimento") != null) {
                    Calendar nascimento = Calendar.getInstance();
                    nascimento.setTime(resultado.getDate("nascimento"));
                    retorno.setNascimento(nascimento);
                }

                return retorno;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.err.println("SQL ERROR " + ex.getMessage());
            return null;
        }
    }

    @Override
    public ArrayList<Object> getAll() {
        ArrayList<Object> retorno = new ArrayList<>();

        try {
            String sql = "SELECT id,brinco,nome,sexo,peso,nascimento,raca FROM muudata.bovino ORDER BY brinco ASC";
            PreparedStatement consulta = c.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                Bovino atual = new Bovino();
                atual.setBrinco(resultado.getInt("brinco"));
                atual.setIdentificador(resultado.getInt("id"));
                atual.setNome(resultado.getString("nome"));
                atual.setPeso(resultado.getShort("peso"));
                atual.setSexo(resultado.getBoolean("sexo"));
                atual.setRaca(resultado.getString("raca"));

                if (resultado.getDate("nascimento") != null) {
                    Calendar nascimento = Calendar.getInstance();
                    nascimento.setTime(resultado.getDate("nascimento"));
                    atual.setNascimento(nascimento);
                }

                retorno.add(atual);
            }
        } catch (SQLException ex) {
            System.err.println("SQL ERROR " + ex.getMessage());
        }

        return retorno;
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
