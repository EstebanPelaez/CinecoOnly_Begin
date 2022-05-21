package co.edu.uniquindio.CinecoOnly.CinecoOnly.repositorios;

import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Funcion;
import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionRepo extends JpaRepository<Funcion, Integer> {

    //Consultas

}
