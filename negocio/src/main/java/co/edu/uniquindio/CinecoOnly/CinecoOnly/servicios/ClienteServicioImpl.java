package co.edu.uniquindio.CinecoOnly.CinecoOnly.servicios;

import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Cliente;
import co.edu.uniquindio.CinecoOnly.CinecoOnly.repositorios.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServicioImpl implements ClienteServicio {

    @Autowired
    private ClienteRepo clienteRepo;

    @Override
    public Cliente registrarCliente(Cliente c) throws Exception {

        Optional<Cliente> buscado = clienteRepo.findById(c.getCodigo());

        if(buscado.isPresent()){
            throw new Exception("El codigo del cliente ya existe");
        }
        //buscado = null; -> terminar
        /*if(buscado.isPresent()){
            throw new Exception("El email del cliente ya está registrado");
        }*/

       return clienteRepo.save(c);
    }

    @Override
    public Cliente actualizarCliente(Cliente c) throws Exception {
        return null;
    }

    @Override
    public void eliminarCliente(Integer codigo) throws Exception {

    }

    @Override
    public Cliente iniciarSesion(String email, String contrasenia) throws Exception{
        return clienteRepo.findByEmailAndContrasenia(email, contrasenia).orElseThrow( () -> new Exception("Los datos de autenticacion son incorrectos"));
    }

    @Override
    public Cliente recuperarContrasenia(String email, Integer codigo) throws Exception{
        return  clienteRepo.findByEmailAndCodigo(email,codigo).orElseThrow( () -> new Exception("El usuario no existe"));
    }

}
