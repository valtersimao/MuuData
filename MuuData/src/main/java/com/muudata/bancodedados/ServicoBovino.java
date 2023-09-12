/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muudata.bancodedados;

import com.muudata.bancodedados.conexao.Conexao;
import com.muudata.entites.Bovino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author 0068943
 */
public class ServicoBovino {
    public static List<Bovino> consultaBovino() {
        List<Bovino> retorno = new ArrayList<Bovino>();
        
        try {
            Connection c = new Conexao().obterConexao();
            String sql = "SELECT * FROM arthur_ribeiro.bovino";
            PreparedStatement consulta = c.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()) {
                Bovino atual = new Bovino();
                atual.setBrinco(resultado.getInt("brinco"));
                atual.setIdentificador(resultado.getInt("identificador"));
                atual.setNascimento(resultado.getDate("nascimento"));
                atual.setNome(resultado.getString("nome"));
                atual.setPeso(resultado.getShort("peso"));
                atual.setSexo(resultado.getBoolean("sexo"));
                atual.setRaca(resultado.getString("raca"));
                retorno.add(atual);
            }
            c.close();
        } catch (SQLException ex) {
            System.err.println("SQL ERROR "+ ex.getMessage());
        }
        
        return retorno;
    }
    //Caso o bovino seja cadastrado sem nenhum problema a função retorna verdadeiro, caso contrário falso
    public static boolean registraBovino(Bovino bovino) {
          
        try {
            Connection c = Conexao.obterConexao();
            String sql = "INSERT INTO arthur_ribeiro.bovino(brinco, nome, peso, sexo, raca) "
            + "VALUES (?,?,?,?,?);";
            PreparedStatement insercao;
            insercao = c.prepareStatement(sql);
            insercao.setInt(1, bovino.getBrinco());
            insercao.setString(2, bovino.getNome());
            insercao.setInt(3, bovino.getPeso());
            insercao.setBoolean(4, bovino.isSexo());
            insercao.setString(5, bovino.getRaca());
            insercao.executeQuery();
            c.close();

            return true;
        } catch (SQLException e) {
            return false;
        }
          
    }
}
