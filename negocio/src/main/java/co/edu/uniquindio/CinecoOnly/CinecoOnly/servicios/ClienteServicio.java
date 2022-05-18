package co.edu.uniquindio.CinecoOnly.CinecoOnly.servicios;

import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Cliente;

public interface ClienteServicio {

    Cliente registrarCliente(Cliente c) throws Exception;

    Cliente actualizarCliente(Cliente c) throws Exception;

    void eliminarCliente(Integer codigo)throws Exception;

    Cliente iniciarSesion(String email, String contrasenia) throws Exception;

    Cliente recuperarContrasenia(String email, Integer codigo) throws Exception;

}
