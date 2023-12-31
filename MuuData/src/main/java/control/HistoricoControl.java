package control;

import java.util.ArrayList;
import model.HistoricoDeSaude;
import model.Vacina;
import model.dao.HistoricoDeSaudeDAO;
import model.dao.VacinaDAO;
import model.dao.VacinaGenericaDAO;

public class HistoricoControl {

    private final HistoricoDeSaudeDAO dao;
    private final VacinaDAO vacinaDAO;
    private final VacinaGenericaDAO vacinaGenericaDAO;

    public HistoricoControl() {
        dao = new HistoricoDeSaudeDAO();
        vacinaDAO = new VacinaDAO();
        vacinaGenericaDAO = new VacinaGenericaDAO();
    }

    public HistoricoDeSaude insert(int idBovino, String descricao, String tratamento, String observacoes) {
        HistoricoDeSaude historico = new HistoricoDeSaude(idBovino, descricao, tratamento, observacoes);

        if (dao.insert(historico)) {
            return historico;
        } else {
            return null;
        }
    }

    public Vacina insert(String nome, String descricao, short doses) {
        Vacina vacina = new Vacina(nome, doses, descricao);

        if (vacinaGenericaDAO.insert(vacina)) {
            return vacina;
        }

        return null;
    }

    public Vacina insert(HistoricoDeSaude historico, Vacina vacina) {
        vacina.setIdHistorico(historico.getId());

        /*if (vacinaDAO.existsInHistorico(vacina)) {
            JOptionPane.showMessageDialog(null, "A vacina selecionada já existe no registro!");
            return null;
        }*/
        if (vacinaDAO.insert(vacina)) {
            return vacina;
        }

        return null;
    }

    public HistoricoDeSaude getById(int id) {
        return (HistoricoDeSaude) dao.getById(id);
    }

    public ArrayList<Vacina> getById(HistoricoDeSaude historico) {
        return (ArrayList<Vacina>) vacinaDAO.getById(historico.getId());
    }

    public ArrayList<Vacina> getAll() {
        ArrayList<Object> retorno = vacinaGenericaDAO.getAll();
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

    public boolean delete(int id) {
        return vacinaDAO.delete(id);
    }
}
