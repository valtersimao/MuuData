/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muudata.bancodedados.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 0068943
 */
public class Conexao {
    private static Connection ifConexoes;
    
    public static Connection obterConexao() {
        try {
            String url = "jdbc:postgresql://10.90.24.56:5432/aula";
            String usuario = "Valter";
            String senha = "senha123";

            Connection con = DriverManager.getConnection(url, usuario, senha);
            return con;
        } catch (java.sql.SQLException ex) {
            System.out.println("Erro ao conectar no banco: "+ex.getMessage());
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
