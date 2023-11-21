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

        String sql = "INSERT INTO muudata.bovino(brinco, nome, peso, sexo, raca, nascimento";

        if (bovino.getIdMae() != Bovino.ID_DEFAULT) {
            sql += ", id_mae) VALUES (?,?,?,?,?,?,?) returning id";
        } else {
            sql += ") VALUES (?,?,?,?,?,?) returning id";
        }

        try (PreparedStatement trans = this.c.prepareStatement(sql)) {

            trans.setInt(1, bovino.getBrinco());
            trans.setString(2, bovino.getNome());
            trans.setInt(3, bovino.getPeso());
            trans.setBoolean(4, bovino.isSexo());
            trans.setString(5, bovino.getRaca());

            if (bovino.getNascimento() == null) {
                trans.setDate(6, null);
            } else {
                trans.setDate(6, new java.sql.Date(bovino.getNascimento().getTimeInMillis()));
            }
            if (bovino.getIdMae() != 0) {
                trans.setInt(7, bovino.getIdMae());
            }

            ResultSet resultSet = trans.executeQuery();;

            if (resultSet.next()) {
                bovino.setId(resultSet.getInt("id"));

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
        Bovino bovino = (Bovino) entite;
        String sql = "UPDATE muudata.bovino SET nome = ?, peso = ?, brinco = ? WHERE id = ?";

        try (PreparedStatement trans = c.prepareStatement(sql)) {
            trans.setString(1, bovino.getNome());
            trans.setInt(2, bovino.getPeso());
            trans.setInt(3, bovino.getBrinco());
            trans.setInt(4, bovino.getId());

            trans.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
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
            String sql = "SELECT id,brinco,nome,sexo,peso,nascimento,raca,id_mae FROM muudata.bovino WHERE id = ? ORDER BY brinco ASC";
            PreparedStatement consulta = c.prepareStatement(sql);
            consulta.setLong(1, id);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                Calendar nascimento = Calendar.getInstance();
                nascimento.setTime(resultado.getDate("nascimento"));

                retorno = new Bovino(resultado.getInt("brinco"),
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("raca"),
                        resultado.getBoolean("sexo"),
                        nascimento, resultado.getInt("peso"),
                        resultado.getInt("id_mae"));

                consulta.close();
                return retorno;
            } else {
                consulta.close();
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
            String sql = "SELECT id,brinco,nome,sexo,peso,nascimento,raca,id_mae  FROM muudata.bovino WHERE id != 0 ORDER BY brinco ASC";
            PreparedStatement consulta = c.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                Calendar nascimento = Calendar.getInstance();
                nascimento.setTime(resultado.getDate("nascimento"));
                
                Bovino atual = new Bovino(resultado.getInt("brinco"),
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("raca"),
                        resultado.getBoolean("sexo"),
                        nascimento, resultado.getInt("peso"),
                        resultado.getInt("id_mae"));

                retorno.add(atual);
            }
            consulta.close();;
        } catch (SQLException ex) {
            System.err.println("SQL ERROR " + ex.getMessage());
        }

        return retorno;
    }

    public ArrayList<Object> getFemale() {
        ArrayList<Object> retorno = new ArrayList<>();

        try {
            String sql = "SELECT id,brinco,nome,sexo,peso,nascimento,raca,id_mae  FROM muudata.bovino  WHERE sexo = false AND id != 0 ORDER BY brinco ASC";
            PreparedStatement consulta = c.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                Calendar nascimento = Calendar.getInstance();
                nascimento.setTime(resultado.getDate("nascimento"));
                
                Bovino atual = new Bovino(resultado.getInt("brinco"),
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("raca"),
                        resultado.getBoolean("sexo"),
                        nascimento, resultado.getInt("peso"),
                        resultado.getInt("id_mae"));

                retorno.add(atual);
            }
            consulta.close();;
        } catch (SQLException ex) {
            System.err.println("SQL ERROR " + ex.getMessage());
        }

        return retorno;
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        //brinco, nome, idMae
        Bovino bovino = (Bovino) filter;
        ArrayList<Object> retorno = new ArrayList<>();

        boolean possuiNome = false, possuiBrinco = false, possuiIdMae = false;
        String sql = "SELECT id,brinco,nome,sexo,peso,nascimento,raca FROM muudata.bovino WHERE id != 0";
        if (bovino.getNome() != null) {
            possuiNome = true;
            sql += "nome LIKE ? OR nome LIKE ? OR nome LIKE ?";
        }
        if (bovino.getBrinco() != 0) {
            if (possuiNome) {
                sql += " OR";
            }
            sql += " brinco = ?";
            possuiBrinco = true;
        }
        if (bovino.getIdMae() != 0) {
            if (possuiNome || possuiBrinco) {
                sql += " OR";
            }
            sql += " id_mae = ?";
            possuiIdMae = true;
        }
        if (!possuiNome && !possuiBrinco && !possuiIdMae) {
            return null;
        }
        try (PreparedStatement trans = this.c.prepareStatement(sql)) {
            int i = 1;
            if (possuiNome) {
                trans.setString(i, bovino.getNome() + "%");
                trans.setString(i + 1, "%" + bovino.getNome());
                trans.setString(i + 2, "%" + bovino.getNome() + "%");
                i = 4;
            }
            if (possuiBrinco) {
                trans.setInt(i, bovino.getBrinco());
                i++;
            }
            if (possuiIdMae) {
                trans.setInt(i, bovino.getIdMae());
            }

            ResultSet resultado = trans.executeQuery();
            while (resultado.next()) {
                Calendar nascimento = Calendar.getInstance();
                nascimento.setTime(resultado.getDate("nascimento"));
                
                Bovino atual = new Bovino(resultado.getInt("brinco"),
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("raca"),
                        resultado.getBoolean("sexo"),
                        nascimento, resultado.getInt("peso"),
                        resultado.getInt("id_mae"));


                retorno.add(atual);
            }
        } catch (SQLException ex) {

        }
        return retorno;
    }
}
