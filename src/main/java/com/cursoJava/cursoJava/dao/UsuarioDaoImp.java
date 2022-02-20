package com.cursoJava.cursoJava.dao;

import com.cursoJava.cursoJava.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository // funcionalidad de acceder al respositorio de la base de datos
@Transactional // le da funcionalidad a la clase de aramar la consulta a la base de datos
public class UsuarioDaoImp implements UsuarioDao{


    @PersistenceContext
    EntityManager entityManager; //conexión con la base de datos
    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public boolean verificarEmailPassword(Usuario usuario) {
        String query = "FROM Usuario WHERE email = :email AND password = :password";
        List<Usuario> lista = entityManager.createQuery(query)
                .setParameter("email", usuario.getEmail())
                .setParameter("password", usuario.getPassword())
                .getResultList();

        if (lista.isEmpty()) {
            return false;
        }
        return true;
    }
}
