package es.davidrico.jakarta.ear.ejb.servicios;

import jakarta.ejb.Local;
import es.davidrico.jakarta.ear.ejb.entities.Usuario;

import java.util.List;

@Local
public interface UsuarioService {
    List<Usuario> listar();
}
