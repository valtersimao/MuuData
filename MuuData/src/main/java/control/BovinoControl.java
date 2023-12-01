package control;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import model.Bovino;
import model.dao.BovinoDAO;

public class BovinoControl {

    private final BovinoDAO dao;

    public BovinoControl(String fazenda) {
        this.dao = new BovinoDAO(fazenda);
    }

    public boolean insert(Bovino bovino) {
        return this.dao.insert(bovino);
    }

    public boolean insert(String nome, int brinco, int peso, String raca, boolean sexo) {
        Bovino boi = new Bovino(brinco, nome, raca, sexo, peso);

        return this.dao.insert(boi);
    }

    public boolean insert(String nome, int brinco, String raca, boolean sexo, int idMae, String data) throws ParseException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate nascimento = LocalDate.parse(data, formatter);

            Bovino boi = new Bovino(brinco, nome, raca, sexo, nascimento, idMae);

            return this.dao.insert(boi);
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public ArrayList<Bovino> getAll() {
        ArrayList<Object> retorno = this.dao.getAll();
        ArrayList<Bovino> bovinos = new ArrayList<>();

        retorno.forEach((it) -> {
            Bovino boi = (Bovino) it;
            if (boi.getNascimento() != null) {
                boi.setIdadeMeses((int) calcIdade(boi.getNascimento()));
            }
            bovinos.add(boi);
        });

        return bovinos;
    }

    public Bovino getById(long id) {
        Bovino boi = (Bovino) this.dao.getById(id);
        if (boi.getNascimento() != null) {
            boi.setIdadeMeses((int) this.calcIdade(boi.getNascimento()));
        }
        return boi;
    }

    public ArrayList<Bovino> getFemale() {
        ArrayList<Object> retorno = this.dao.getFemale();
        ArrayList<Bovino> bovinos = new ArrayList<>();

        retorno.forEach((it) -> {
            Bovino boi = (Bovino) it;
            if (boi.getNascimento() != null) {
                boi.setIdadeMeses((int) calcIdade(boi.getNascimento()));
            }
            bovinos.add(boi);
        });

        return bovinos;
    }

    public ArrayList<Bovino> getWithFilter(Bovino filter) {
        ArrayList<Object> retorno = this.dao.getWithFilter(filter);
        ArrayList<Bovino> bovinos = new ArrayList<>();

        retorno.forEach((it) -> {
            Bovino boi = (Bovino) it;
            if (boi.getNascimento() != null) {
                boi.setIdadeMeses((int) calcIdade(boi.getNascimento()));
            }
            bovinos.add(boi);
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
    
    public boolean update(int peso, String nome, int brinco, int id) {
        return this.dao.update(new Bovino(brinco, id, nome, peso));
    }

    public long calcIdade(LocalDate nascimento) {
        //this.nascimento.
        LocalDate dataAtual = LocalDate.now();

        return ChronoUnit.MONTHS.between(nascimento, dataAtual);
    }
}
