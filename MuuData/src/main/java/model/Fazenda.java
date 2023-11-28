/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author 0068943
 */

@Getter
@Setter
public class Fazenda {
    public static final int GADO_DE_CORTE = 0, GADO_LEITEIRO = 1, GADO_MISTO = 2;
    
    private String nome;
    private String email;
    private int tipoCriacao;
    private String senha; 

    public Fazenda(String nome, String email, int tipoCriacao, String senha) {
        this.nome = nome;
        this.email = email;
        this.tipoCriacao = tipoCriacao;
        this.senha = senha;
    }

    public Fazenda(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
}
