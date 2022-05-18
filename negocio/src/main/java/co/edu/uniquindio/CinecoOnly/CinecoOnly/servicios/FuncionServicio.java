package co.edu.uniquindio.CinecoOnly.CinecoOnly.servicios;

import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Asiento;
import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Funcion;
import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Pelicula;

import java.util.List;

public interface FuncionServicio {

    List<Pelicula> listarCartelera() throws Exception;

    List<Pelicula> listarProximosEstrenos() throws Exception;

    Funcion publicarFuncion(Funcion f) throws Exception;

    void actualizarFuncion(Funcion f) throws Exception;

    void eliminarFuncion(Funcion f) throws Exception;

    Pelicula obtenerPelicula(Integer codigo) throws Exception;
}
