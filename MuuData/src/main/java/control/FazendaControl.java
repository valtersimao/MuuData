package control;

import java.util.Random;
import model.Fazenda;
import model.dao.FazendaDAO;
import tools.EmailService;
import tools.PasswordService;

public class FazendaControl {

    public static final int NO_PROBLEM = 0, USER_NOT_FOUND = 1, USER_EXISTS = 2, INVALID_PASSWORD = 3, INVALID_EMAIL = 4, ANOTHER_ERROR = 5;

    private final FazendaDAO dao;
    private final PasswordService passwordService;
    private int recoveryNumber;
    private boolean isNumberCorrect;

    public FazendaControl() {
        this.isNumberCorrect = false;
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
        if (fazenda == null) {
            return USER_NOT_FOUND;
        }

        if (passwordService.validatePassword(fazenda.getSenha(), senha)) {
            return NO_PROBLEM;
        } else {
            return INVALID_PASSWORD;
        }
    }

    public int signIn(String password, String name, String email) {
        if (!doesNameExists(name)) {
            if (EmailService.validateEmail(email)) {
                password = passwordService.hashPassword(password);
                Fazenda fazenda = new Fazenda(name, email, password);
                if (dao.insert(fazenda)) {
                    return NO_PROBLEM;
                } else {
                    return ANOTHER_ERROR;
                }
            } else {
                return INVALID_EMAIL;
            }
        } else {
            return USER_EXISTS;
        }
    }

    public int signIn(char[] password, String name, String email) {
        return signIn(new String(password), name, email);
    }

    public void recoverPassword(String email) {
        Random r = new Random();

        this.recoveryNumber = r.nextInt(1000, 10000);

        Runnable emailSender = new Runnable() {
            @Override
            public void run() {
                EmailService emailService = new EmailService();
                emailService.sendValidateEmail(recoveryNumber, email);
            }
        };
        emailSender.run();
    }

    public boolean recoverPasswordByName(String name) {
        Fazenda fazenda = getFazenda(name);
        if (fazenda != null) {
            recoverPassword(getFazenda(name).getEmail());
            return true;
        } else {
            return false;
        }
    }

    public boolean validateRecoveryNumber(int userNumber) {
        this.isNumberCorrect = userNumber == this.recoveryNumber;

        return this.isNumberCorrect;
    }

    public boolean changePassword(String password, String name) {
        if (this.isNumberCorrect) {
            String hashedPassword = this.passwordService.hashPassword(password);

            return this.dao.updatePassword(name, hashedPassword);
        }else{
            return false;
        }
    }
}
