package es.davidrico.jakarta.ear.ejb.repositorios;

import es.davidrico.jakarta.ear.ejb.entities.Usuario;

import java.util.List;

public interface UsuarioRepository {
    List<Usuario> listar();
}
