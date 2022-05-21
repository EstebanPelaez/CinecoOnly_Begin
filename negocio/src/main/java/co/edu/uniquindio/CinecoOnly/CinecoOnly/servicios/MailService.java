package co.edu.uniquindio.CinecoOnly.CinecoOnly.servicios;

import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Mail;

public interface MailService {

    Mail sendSimpleMail(Mail mail) throws Exception;
}
