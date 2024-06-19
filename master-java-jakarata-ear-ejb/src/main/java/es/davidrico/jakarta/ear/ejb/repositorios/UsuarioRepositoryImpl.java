package es.davidrico.jakarta.ear.ejb.repositorios;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import es.davidrico.jakarta.ear.ejb.entities.Usuario;

import java.util.List;

@RequestScoped
public class UsuarioRepositoryImpl implements UsuarioRepository{
    @Inject
    private EntityManager em;

    @Override
    public List<Usuario> listar() {
        return em.createQuery("from Usuario", Usuario.class).getResultList();
    }
}
