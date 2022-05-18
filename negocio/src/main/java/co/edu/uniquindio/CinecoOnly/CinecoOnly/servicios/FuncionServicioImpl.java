package co.edu.uniquindio.CinecoOnly.CinecoOnly.servicios;

import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Funcion;
import co.edu.uniquindio.CinecoOnly.CinecoOnly.entidades.Pelicula;
import co.edu.uniquindio.CinecoOnly.CinecoOnly.repositorios.FuncionRepo;
import co.edu.uniquindio.CinecoOnly.CinecoOnly.repositorios.PeliculaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionServicioImpl implements  FuncionServicio{

    @Autowired
    private FuncionRepo funcionRepo;

    @Autowired
    private PeliculaRepo peliculaRepo;

    @Override
    public List<Pelicula> listarCartelera() throws Exception{

        return peliculaRepo.listarCartelera();
    }

    @Override
    public List<Pelicula> listarProximosEstrenos() throws Exception{

        return peliculaRepo.listarProximosEstrenos();
    }
    @Override
    public Funcion publicarFuncion(Funcion f) throws Exception {

        try{
            Funcion funcion = funcionRepo.save(f);

            return funcion;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void actualizarFuncion(Funcion f) throws Exception {
        try {
            funcionRepo.save(f);

        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void eliminarFuncion(Funcion f) throws Exception {
        Optional<Funcion> funcion = funcionRepo.findById(f.getCodigoFuncion());
        if(funcion.isEmpty()){
            throw new Exception("El codigo del producto no existe");
        }else{
            funcionRepo.deleteById(f.getCodigoFuncion());
        }
    }

    @Override
    public Pelicula obtenerPelicula(Integer codigo) throws Exception {
        return peliculaRepo.findById(codigo).orElseThrow(() -> new Exception("El código de la pelicula no es válido"));
    }


}
