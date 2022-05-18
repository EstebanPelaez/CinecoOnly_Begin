package co.edu.uniquindio.CinecoOnly.CinecoOnly.repositorios;

import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaRepo extends JpaRepository<Pelicula, Integer> {

    //Consultas
    @Query("select p from Pelicula p where p.fechaInicio <= CURRENT_DATE and p.fechaFin >= current_date")
    List<Pelicula> listarCartelera();

    @Query ("select p from Pelicula p where p.fechaInicio > CURRENT_DATE ")
    List<Pelicula> listarProximosEstrenos();
}
