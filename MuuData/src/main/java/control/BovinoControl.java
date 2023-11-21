package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.Bovino;
import model.dao.BovinoDAO;

public class BovinoControl {

    private BovinoDAO dao;

    public BovinoControl() {
        this.dao = new BovinoDAO();
    }

    public boolean insert(Bovino bovino) {
        return this.dao.insert(bovino);
    }

    public boolean insert(String nome, int brinco, int peso, String raca, boolean sexo) {
        Bovino boi = new Bovino(brinco, nome, raca, sexo, peso);

        return this.dao.insert(boi);
    }

    public boolean insert(String nome, int brinco, String raca, boolean sexo, int idMae, String data) throws ParseException{
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        Date dataNascimento = dateFormat.parse(data);
        Calendar c = Calendar.getInstance();
        c.setTime(dataNascimento);
        
        Bovino boi = new Bovino(brinco, nome, raca, sexo, c, idMae);

        return this.dao.insert(boi);
    }

    public ArrayList<Bovino> getAll() {
        ArrayList<Object> retorno = this.dao.getAll();
        ArrayList<Bovino> bovinos = new ArrayList<>();

        retorno.forEach((it) -> {
            bovinos.add((Bovino) it);
        });

        return bovinos;
    }

    public Bovino getById(long id) {
        return (Bovino) this.dao.getById(id);
    }

    public ArrayList<Bovino> getFemale() {
        ArrayList<Object> retorno = this.dao.getFemale();
        ArrayList<Bovino> bovinos = new ArrayList<>();

        retorno.forEach((it) -> {
            bovinos.add((Bovino) it);
        });

        return bovinos;
    }

    public ArrayList<Bovino> getWithFilter(Bovino filter) {
        ArrayList<Object> retorno = this.dao.getWithFilter(filter);
        ArrayList<Bovino> bovinos = new ArrayList<>();

        retorno.forEach((it) -> {
            bovinos.add((Bovino) it);
        });

        return bovinos;
    }

    public boolean delete(Bovino bovino) {
        return this.dao.delete(bovino.getId());
    }

    public boolean delete(int id) {
        return this.dao.delete(id);
    }

    public boolean update(Bovino bovino) {
        return this.dao.update(bovino);
    }
}
