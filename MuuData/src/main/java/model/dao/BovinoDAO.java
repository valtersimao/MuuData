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
import model.Bovino;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class BovinoDAO implements DAO {

    private final Connection c;
    private final String fazenda;

    public BovinoDAO(String fazenda) {
        this.fazenda = fazenda;
        c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Bovino bovino = (Bovino) entite;

        String sql = "INSERT INTO muudata.bovino(brinco, nome, peso, sexo, raca, nascimento, nome_fazenda";

        if (bovino.getIdMae() != Bovino.ID_DEFAULT) {
            sql += ", id_mae) VALUES (?,?,?,?,?,?,?,?) returning id";
        } else {
            sql += ") VALUES (?,?,?,?,?,?,?) returning id";
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
                trans.setDate(6, java.sql.Date.valueOf(bovino.getNascimento()));
            }
            
            trans.setString(7, fazenda);
            if (bovino.getIdMae() != 0) {
                trans.setInt(8, bovino.getIdMae());
            }

            ResultSet resultSet = trans.executeQuery();

            if (resultSet.next()) {
                bovino.setId(resultSet.getInt("id"));
                
                new HistoricoDeSaudeDAO().insert(new model.HistoricoDeSaude(resultSet.getInt("id"), "", ""));

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
        //TODO
        String sql = "DELETE FROM muudata.bovino WHERE id = ?";
        try (PreparedStatement trans = c.prepareStatement(sql)) {

            trans.setInt(1, (int)id);

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
                LocalDate nascimento;
                if(resultado.getDate("nascimento")!=null){
                    nascimento = resultado.getDate("nascimento").toLocalDate();
                }else{
                    nascimento = null;
                }

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
            String sql = "SELECT id,brinco,nome,sexo,peso,nascimento,raca,id_mae  FROM muudata.bovino WHERE id != 0 AND nome_fazenda = ? ORDER BY brinco ASC";
            try (PreparedStatement consulta = c.prepareStatement(sql)) {
                consulta.setString(1, fazenda);
                
                ResultSet resultado = consulta.executeQuery();
                while (resultado.next()) {
                    LocalDate nascimento;
                    if(resultado.getDate("nascimento")!=null){
                        nascimento = resultado.getDate("nascimento").toLocalDate();
                    }else{
                        nascimento = null;
                    }
                    Bovino atual = new Bovino(resultado.getInt("brinco"),
                            resultado.getInt("id"),
                            resultado.getString("nome"),
                            resultado.getString("raca"),
                            resultado.getBoolean("sexo"),
                            nascimento, resultado.getInt("peso"),
                            resultado.getInt("id_mae"));
                    
                    retorno.add(atual);
                }
            }
        } catch (SQLException ex) {
            System.err.println("SQL ERROR " + ex.getMessage());
        }

        return retorno;
    }

    public ArrayList<Object> getFemale() {
        ArrayList<Object> retorno = new ArrayList<>();

        try {
            String sql = "SELECT id,brinco,nome,sexo,peso,nascimento,raca,id_mae  FROM muudata.bovino  WHERE sexo = false AND id != 0 AND nome_fazenda = ? ORDER BY brinco ASC";
            try (PreparedStatement consulta = c.prepareStatement(sql)) {
                consulta.setString(1, fazenda);
                
                ResultSet resultado = consulta.executeQuery();
                while (resultado.next()) {
                    LocalDate nascimento;
                    if(resultado.getDate("nascimento")!=null){
                        nascimento = resultado.getDate("nascimento").toLocalDate();
                    }else{
                        nascimento = null;
                    }
                    
                    Bovino atual = new Bovino(resultado.getInt("brinco"),
                            resultado.getInt("id"),
                            resultado.getString("nome"),
                            resultado.getString("raca"),
                            resultado.getBoolean("sexo"),
                            nascimento, resultado.getInt("peso"),
                            resultado.getInt("id_mae"));
                    
                    retorno.add(atual);
                }
            }
        } catch (SQLException ex) {
            System.err.println("SQL ERROR " + ex.getMessage());
        }

        return retorno;
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        //TODO
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
                LocalDate nascimento;
                if(resultado.getDate("nascimento")!=null){
                    nascimento = resultado.getDate("nascimento").toLocalDate();
                }else{
                    nascimento = null;
                }
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
