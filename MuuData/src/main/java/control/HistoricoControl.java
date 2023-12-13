package control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import model.HistoricoDeSaude;
import model.Vacina;
import model.Doenca;
import model.dao.DoencaDAO;
import model.dao.HistoricoDeSaudeDAO;
import model.dao.VacinaDAO;

/**
 *
 * @author 0068943
 */
public class HistoricoControl {

    private final HistoricoDeSaudeDAO dao;
    private final VacinaDAO vacinaDAO;
    private final DoencaDAO doencaDAO;

    public HistoricoControl() {
        dao = new HistoricoDeSaudeDAO();
        vacinaDAO = new VacinaDAO();
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

    public boolean insert(HistoricoDeSaude historico, String nome, short doses, String prioridade, String data) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataEvento = LocalDate.parse(data, formatter);
            
            Vacina vacina = new Vacina(nome, doses, prioridade, dataEvento);
            vacina.setIdHistorico(historico.getId());

            if (vacinaDAO.insert(vacina)) {
                return true;
            } else {
                return false;
            }
        } catch (DateTimeParseException e) {
            return false;
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
}
