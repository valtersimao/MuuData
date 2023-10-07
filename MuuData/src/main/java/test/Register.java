package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Register {

    private File sql;
    private File planilha;

    public Register() {
        this.sql = new File("sql.txt");
        this.planilha = new File("planilha.csv");
    }

    public void imprimeSQL(Bovino boi) throws IOException {
        String sqlTxt = "INSERT INTO muudata.bovino(brinco, nome, sexo, raca) VALUES ";
        sqlTxt += "('" + boi.getBrinco() + "','" + boi.getNome()
                + "','" + boi.isSexo() + "','" + boi.getRaca() + "');";
        
        sqlTxt += "\n";
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(this.sql, true));
        bw.write(sqlTxt);
        bw.flush();
        bw.close();
    }
    
    public void imprimeBoi(Bovino boi) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(this.planilha,true));
        
        //String linha0 = "nome, sexo, brinco, data, raca, peso\n";
        
        //bw.write(linha0);
        
        String linha = boi.getNome() + "," + boi.getSexoTxt() + "," +
                boi.getBrinco() + "," + boi.getData() + "," +
                boi.getRaca() + "," + boi.getPeso() + "," + boi.getOrigem() + "\n";
        
        bw.write(linha);
        bw.flush();
        bw.close();
    }

}
