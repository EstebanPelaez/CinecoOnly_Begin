package co.edu.uniquindio.CinecoOnly.CinecoOnly.repositorios;

import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepo extends JpaRepository<Ciudad, Integer> {

    //Consultas
}
