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
    public static final int NO_PROBLEM = 0, USER_NOT_FOUND = 1, USER_EXISTS = 2, INVALID_PASSWORD = 3, ANOTHER_ERROR = 4;
            
    private final FazendaDAO dao;
    private final PasswordService passwordService;
    
    public FazendaControl() {
        this.dao = new FazendaDAO();
        this.passwordService = new PasswordService();
    }
    
    public boolean doesNameExists(String name) {
        return dao.getByName(name) != null;
    }
    
    public Fazenda getFazenda(String name) {
        return dao.getByName(name);
    }
    
    public int logIn(String name, char[] senha) {
        return logIn(name, new String(senha));
    }
    
    public int logIn(String name, String senha) {
        Fazenda fazenda = dao.getByName(name);
        if(fazenda == null) {
            return USER_NOT_FOUND;
        }
        
        if(passwordService.validatePassword(fazenda.getSenha(), senha)){
            return NO_PROBLEM;
        }else {
            return INVALID_PASSWORD;
        }
    }
    
    public int signIn(String password, String name, String email) {
        if(!doesNameExists(name)){
            password = passwordService.hashPassword(password);
            Fazenda fazenda = new Fazenda(name, email, password);
            if(dao.insert(fazenda)){
                return NO_PROBLEM;
            }else{
                return ANOTHER_ERROR;
            }
        }else {
            return USER_EXISTS;
        }
    }
    public int signIn(char[] password, String name, String email){
        return signIn(new String(password), name, email);
    }
}
