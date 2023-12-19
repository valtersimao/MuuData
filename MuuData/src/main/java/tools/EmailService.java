/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


/**
 *
 * @author 0068943
 */
public class EmailService {
    private final Session session;
    private Properties props;
    
    private static final String HOST = "smtp.gmail.com";
    private static final String PROT = "587";
    private static final String USERNAME = "datamuu@gmail.com";
    private static final String PASSWORD = "xtvq kcji ddin svez";
    
    public EmailService() {
        this.props = new Properties();
        this.props.put("mail.smtp.auth", "true");
        this.props.put("mail.smtp.starttls.enable", "true");
        this.props.put("mail.smtp.host", HOST);
        this.props.put("mail.smtp.port", PROT);
        
        this.session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
            
        });
    }
    public static boolean validateEmail(String email) {
        try {
            InternetAddress internetAddress = new InternetAddress(email);
            internetAddress.validate();
            return true;
        } catch (AddressException e) {
            return false;
        }
    }
    
    public boolean emailSender(String assunto, String texto, String recipient){
        try {
            // Criação da mensagem
            Message message = new MimeMessage(this.session);
            message.setFrom(new jakarta.mail.internet.InternetAddress(USERNAME));
            message.setRecipients(Message.RecipientType.TO, jakarta.mail.internet.InternetAddress.parse(recipient));
            message.setSubject(assunto);
            message.setText(texto);

            // Envio da mensagem
            Transport.send(message);

            System.out.println("E-mail enviado com sucesso!");
            return true;

        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean sendValidateEmail(int number, String recipient) {
        String texto = "O seu código de recuperação é: " + number;
        return emailSender("Recuperação de conta", texto, recipient);
    }
}
