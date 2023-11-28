/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Fazenda;
import model.dao.FazendaDAO;
import tools.PasswordService;

/**
 *
 * @author 0068943
 */
public class FazendaControl {
    private final FazendaDAO dao;
    private final PasswordService passwordService;
    
    public FazendaControl() {
        this.dao = new FazendaDAO();
        this.passwordService = new PasswordService();
    }
    
    public boolean doesNameExists(String name) {
        return dao.getByName(name) != null;
    }
    
    public Fazenda logIn(String name, char[] senha) {
        return logIn(name, new String(senha));
    }
    
    public Fazenda logIn(String name, String senha) {
        Fazenda fazenda = dao.getByName(name);
        
        if(passwordService.validatePassword(fazenda.getSenha(), senha)){
            return fazenda;
        }else {
            return null;
        }
    }
    
    public Fazenda signIn(String password, String name, String email) {
        if(!doesNameExists(name)){
            password = passwordService.hashPassword(password);
            Fazenda fazenda = new Fazenda(name, email, email);
            if(dao.insert(fazenda)){
                return fazenda;
            }
        }
        return null;
    }
    public Fazenda signIn(char[] password, String name, String email){
        return signIn(new String(password), name, email);
    }
}
