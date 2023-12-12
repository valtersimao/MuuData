package model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Bovino {

    public static final boolean MACHO = true, FEMEA = false;
    public static final int ID_DEFAULT = 0;

    private int brinco;
    private int id;
    private String nome;
    private String raca;
    private boolean sexo;
    private LocalDate nascimento;
    private Integer peso;
    private Integer idMae;
    private int idadeMeses;
    private LocalDate gestPrevist;

    public Bovino() {
    }

    public Bovino(int brinco, int id, String nome, Integer peso) {
        this.brinco = brinco;
        this.id = id;
        this.nome = nome;
        this.peso = peso;
    }

    public Bovino(int brinco, String nome, String raca, boolean sexo, Integer peso) {
        this.brinco = brinco;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.peso = peso;
        this.idMae = ID_DEFAULT;
    }

    public Bovino(int brinco, String nome, String raca, boolean sexo, LocalDate nascimento, Integer idMae) {
        this.brinco = brinco;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.idMae = idMae;
        this.peso = 0;
    }

    public Bovino(int brinco, int id, String nome, String raca, boolean sexo, LocalDate nascimento, Integer peso, Integer idMae) {
        this.brinco = brinco;
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.peso = peso;
        this.idMae = idMae;
    }

    @Override
    public String toString() {
        char sex = sexo ? 'M' : 'F';
        if (nome == null) {
            return brinco + " :  (" + sex + ")";
        }
        return brinco + " : " + nome + " (" + sex + ")";
    }

}
