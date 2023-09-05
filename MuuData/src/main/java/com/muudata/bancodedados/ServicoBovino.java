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

/**
 *
 * @author 0068943
 */
public class ServicoBovino {
    public List<Bovino> consultaBovino() {
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
        } catch (SQLException ex) {
            System.err.println("SQL ERROR "+ ex.getMessage());
        }
        
        return retorno;
    }
    public void registraBovino(Bovino bovino) {
        //TODO  
    }
}
