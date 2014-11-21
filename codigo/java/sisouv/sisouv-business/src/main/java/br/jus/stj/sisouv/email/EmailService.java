package br.jus.stj.sisouv.email;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Stateless
@LocalBean
public class EmailService {
	public void enviarEmail(String emailTo, String assunto, String mensagem) {
		enviarEmail(null, null, null, emailTo, assunto, mensagem);
	}

	public void enviarEmail(final String username, final String senha,
			String emailFrom, String emailTo, String assunto, String mensagem) {
		final Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("email.properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Session session = null;
		if (username == null) {
			session = Session.getInstance(prop);
		} else {
			session = Session.getInstance(prop, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, senha);
				}
			});
		}

		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(emailFrom == null ? prop
					.getProperty("mail.emailfrom.default") : emailFrom));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(emailTo));
			message.setSubject(assunto);
			message.setText(mensagem);
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException();
		}

	}
}
