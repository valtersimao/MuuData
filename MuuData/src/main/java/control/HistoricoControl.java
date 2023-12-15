package control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import model.HistoricoDeSaude;
import model.Vacina;
import model.Doenca;
import model.dao.HistoricoDeSaudeDAO;
import model.dao.VacinaDAO;
import model.dao.VacinaGenericaDAO;
import model.dao.DoencaDAO;
import model.dao.DoencaGenericaDAO;

/**
 *
 * @author 0068943
 */
public class HistoricoControl {

    private final HistoricoDeSaudeDAO dao;
    private final VacinaDAO vacinaDAO;
    private final VacinaGenericaDAO vacinaGenericaDAO;
    private final DoencaDAO doencaDAO;

    public HistoricoControl() {
        dao = new HistoricoDeSaudeDAO();
        vacinaDAO = new VacinaDAO();
        vacinaGenericaDAO = new VacinaGenericaDAO();
        doencaDAO = new DoencaDAO();
    }

    public HistoricoDeSaude insert(int idBovino, String descricao, String tratamento, String observacoes) {
        HistoricoDeSaude historico = new HistoricoDeSaude(idBovino, descricao, tratamento, observacoes);

        if (dao.insert(historico)) {
            return historico;
        } else {
            return null;
        }
    }

    public Vacina insert(HistoricoDeSaude historico, String nome, short doses, String prioridade, String data) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataEvento = LocalDate.parse(data, formatter);

            Vacina vacina = new Vacina(nome, doses, prioridade, doses, dataEvento, doses);
            vacina.setIdHistorico(historico.getId());

            if (vacinaGenericaDAO.insert(vacina)) {
                int idVacina = vacina.getIdVacina();

                if (idVacina > 0) {
                    if (vacinaDAO.insert(vacina)) {
                        return vacina;
                    }
                }
            }

            return null;
        } catch (DateTimeParseException e) {
            return null;
        }
    }

    public Doenca insert(HistoricoDeSaude historico, Doenca doenca) {
        doenca.setIdHistorico(historico.getId());

        if (doencaDAO.insert(doenca)) {
            return doenca;
        } else {
            return null;
        }
    }

    public HistoricoDeSaude getById(int id) {
        return (HistoricoDeSaude) dao.getById(id);
    }
    
    public ArrayList<Vacina> getById(HistoricoDeSaude historico) {
        return (ArrayList<Vacina>) vacinaDAO.getById(historico.getId());
    }
    
    public ArrayList<Vacina> getAll() {
        ArrayList<Object> retorno = this.vacinaDAO.getAll();
        ArrayList<Vacina> vacinas = new ArrayList<>();

        retorno.forEach((it) -> {
            Vacina vacina = (Vacina) it;
            vacinas.add(vacina);
        });

        return vacinas;
    }

    public HistoricoDeSaude update(String descricao, String tratamento, String observacoes, int id, int idBovino) {
        HistoricoDeSaude historico = new HistoricoDeSaude(id, idBovino, descricao, tratamento, observacoes);

        if (update(historico)) {
            return historico;
        } else {
            return null;
        }
    }

    public boolean update(HistoricoDeSaude historico) {
        return dao.update(historico);
    }

    public Vacina update(String nome, String prioridade, short doses, int idVacina) {
        Vacina vacina = new Vacina(idVacina, nome, doses, prioridade);

        if (update(vacina)) {
            return vacina;
        } else {
            return null;
        }
    }

    public boolean update(Vacina vacina) {
        return vacinaGenericaDAO.update(vacina);
    }
    
    public boolean delete(int id) {
        return vacinaDAO.delete(id) && vacinaGenericaDAO.delete(id);
    }
}