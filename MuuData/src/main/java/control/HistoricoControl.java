/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.HistoricoDeSaude;
import model.dao.HistoricoDeSaudeDAO;

/**
 *
 * @author 0068943
 */
public class HistoricoControl {
    
    private final HistoricoDeSaudeDAO dao;
    
    public HistoricoControl() {
        dao = new HistoricoDeSaudeDAO();
    }
    
    public HistoricoDeSaude insert(int idBovino, String descricao, String observacoes) {
        HistoricoDeSaude historico = new HistoricoDeSaude(idBovino, descricao, observacoes);
        
        if(dao.insert(historico)) {
            return historico;
        }else {
            return null;
        }
    }
    
    public HistoricoDeSaude getById(int id){
        return (HistoricoDeSaude)dao.getById(id);
    }
    
    public HistoricoDeSaude update(String descricao, String observacoes, int id, int idBovino) {
        HistoricoDeSaude historico = new HistoricoDeSaude(id, idBovino, descricao, observacoes);
        
        if(update(historico)) {
            return historico;
        }else{
            return null;
        }
    }
    
    public boolean update(HistoricoDeSaude historico) {
        return dao.update(historico);
    }
}
