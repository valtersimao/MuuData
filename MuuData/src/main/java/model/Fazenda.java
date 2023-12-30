package model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class Fazenda {
    public static final int GADO_DE_CORTE = 0, GADO_LEITEIRO = 1, GADO_MISTO = 2;
    
    @NonNull
    private String nome;
    @NonNull
    private String email;
    private int tipoCriacao;
    @NonNull
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
