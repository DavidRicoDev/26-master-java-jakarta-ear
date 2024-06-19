package es.davidrico.jakarta.ear.ejb.servicios;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import es.davidrico.jakarta.ear.ejb.entities.Usuario;
import es.davidrico.jakarta.ear.ejb.repositorios.UsuarioRepository;

import java.util.List;

@Stateless
public class UsuarioServiceImpl implements UsuarioService{

    @Inject
    private UsuarioRepository repository;

    @Override
    public List<Usuario> listar() {
        return repository.listar();
    }
}
