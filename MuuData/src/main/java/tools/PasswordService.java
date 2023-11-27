/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

/**
 *
 * @author 0068943
 */
public class PasswordService {
    private Argon2 argon2;
    
    public PasswordService() {
        argon2 = getArgon2Instance();
    }
    public String hashPassword(String password) {
        String securePassword;
        
        securePassword = argon2.hash(4, 65586, 2, password);
        
        return securePassword;
    }
    
    public boolean validatePassword(String hash, String userEnterPassword) {
         return argon2.verify(hash, userEnterPassword.toCharArray());
    }
    
    private Argon2 getArgon2Instance() {
        return Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2d, 16, 32);
    }
}
