/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

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
    
    public HistoricoDeSaude insert(int idBovino, String descricao, String observacoes) {
        HistoricoDeSaude historico = new HistoricoDeSaude(idBovino, descricao, observacoes);
        
        if (dao.insert(historico)) {
            return historico;
        }else {
            return null;
        }
    }
    
    public Vacina insert(HistoricoDeSaude historico, Vacina vacina) {
        vacina.setIdHistorico(historico.getId());
        
        if (vacinaDAO.insert(vacina)) {
            return vacina;
        } else {
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
    
    public HistoricoDeSaude getById(int id){
        return (HistoricoDeSaude)dao.getById(id);
    }
    
    public HistoricoDeSaude update(String descricao, String observacoes, int id, int idBovino) {
        HistoricoDeSaude historico = new HistoricoDeSaude(id, idBovino, descricao, observacoes);
        
        if (update(historico)) {
            return historico;
        }else{
            return null;
        }
    }
    
    public boolean update(HistoricoDeSaude historico) {
        return dao.update(historico);
    }
    
    
}