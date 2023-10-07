package test;

public class Bovino {
    private int brinco;
    private String nome;
    private String raca;
    private boolean sexo;  // macho-1 ; femea-0
    private String data; // dd/mm/aaaa;
    private int peso;
    private String origem;
    
    private String sexoTxt;

    public Bovino(int brinco, String nome, String raca, boolean sexo, String data, int peso, String origem) {
        this.brinco = brinco;
        this.nome = nome.isEmpty() ? brinco + "" : nome;
        this.raca = raca;
        this.sexo = sexo;
        this.data = data;
        this.origem = origem;
        this.peso = peso;
        
        this.sexoTxt = sexo ? "M" : "F";
    }

    public int getBrinco() {
        return brinco;
    }

    public String getSexoTxt() {
        return sexoTxt;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public boolean isSexo() {
        return sexo;
    }

    public String getData() {
        return data;
    }

    public String getOrigem() {
        return origem;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return brinco + "," + nome + "," + raca + "," + sexoTxt + "," + data + "," + peso;
    }
    
    
}
