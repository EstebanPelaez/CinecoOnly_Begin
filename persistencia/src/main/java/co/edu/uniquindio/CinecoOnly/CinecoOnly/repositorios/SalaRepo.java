package co.edu.uniquindio.CinecoOnly.CinecoOnly.repositorios;


import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepo extends JpaRepository<Sala, Integer> {

    //Consultas
}
