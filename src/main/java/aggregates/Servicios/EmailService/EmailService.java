/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregates.Servicios.EmailService;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *
 * @author FranDev
 */
public class EmailService {

    private final String senderEmail = "cuevabarriosfrancisco@gmail.com"; // Tu correo
    private final String senderPassword = "sbfokegkofgnvjha"; // Contraseña de tu correo

    public void sendVerificationCode(String recipientEmail, String code) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(senderEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
        message.setSubject("Código de verificación");
        message.setText("Tu código de verificación es: " + code);

        Transport.send(message);
    }
    
    
    public static void main(String[] args) throws MessagingException {
          EmailService emailService = new EmailService();
          emailService.sendVerificationCode("ponceanderson977@gmail.com", "22");
    }
}
