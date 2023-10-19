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
import model.Bovino;
import tools.FactoryPostgres;

/**
 *
 * @author 0068943
 */
public class BovinoDAO implements DAO{
    
    private Connection c;
    //Caso o bovino seja cadastrado sem nenhum problema a função retorna verdadeiro, caso contrário falso
    public static boolean registraBovino(Bovino bovino) {
          
        try {
            Connection c = FactoryPostgres.getConexaoPostgres();
            String sql = "INSERT INTO muudata.bovino(brinco, nome, peso, sexo, raca) "
            + "VALUES (?,?,?,?,?);";
            PreparedStatement trans;
            trans = c.prepareStatement(sql);
            trans.setInt(1, bovino.getBrinco());
            trans.setString(2, bovino.getNome());
            trans.setInt(3, bovino.getPeso());
            trans.setBoolean(4, bovino.isSexo());
            trans.setString(5, bovino.getRaca());
            trans.executeQuery();
            c.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
          
    }

    public BovinoDAO() {
         c = FactoryPostgres.getConexaoPostgres();
    }

    @Override
    public boolean insert(Object entite) {
        Bovino bovino = (Bovino) entite;
        
        String sql = "INSERT INTO muudata.bovino(brinco, nome, peso, sexo, raca) "
            + "VALUES (?,?,?,?,?);";
        
        try(PreparedStatement trans = this.c.prepareStatement(sql, 
                Statement.RETURN_GENERATED_KEYS)){
            
            trans.setInt(1, bovino.getBrinco());
            trans.setString(2, bovino.getNome());
            trans.setInt(3, bovino.getPeso());
            trans.setBoolean(4, bovino.isSexo());
            trans.setString(5, bovino.getRaca());
            trans.executeQuery();
            
            ResultSet resultSet = trans.getGeneratedKeys();
            
            if(resultSet.next()) {
                bovino.setIdentificador(resultSet.getInt("id"));
                
                return true;
            }else {
               return false; 
            }
        }catch(SQLException ex){
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> getAll() {
        ArrayList<Object> retorno = new ArrayList<>();
        
        try {
            Connection c = FactoryPostgres.getConexaoPostgres();
            String sql = "SELECT id,brinco,nome,sexo,peso,nascimento,raca FROM muudata.bovino";
            PreparedStatement consulta = c.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()) {
                Bovino atual = new Bovino();
                atual.setBrinco(resultado.getInt("brinco"));
                atual.setIdentificador(resultado.getInt("id"));
                atual.setNascimento(resultado.getDate("nascimento"));
                atual.setNome(resultado.getString("nome"));
                atual.setPeso(resultado.getShort("peso"));
                atual.setSexo(resultado.getBoolean("sexo"));
                atual.setRaca(resultado.getString("raca"));
                retorno.add(atual);
            }
        } catch (SQLException ex) {
            System.err.println("SQL ERROR "+ ex.getMessage());
        }
        
        return retorno;
    }

    @Override
    public ArrayList<Object> getWithFilter(Object filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
