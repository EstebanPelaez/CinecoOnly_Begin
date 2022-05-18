package co.edu.uniquindio.CinecoOnly.CinecoOnly.repositorios;

import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Tipo_Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_TicketRepo extends JpaRepository<Tipo_Ticket, Integer> {

    //Consultas
}
