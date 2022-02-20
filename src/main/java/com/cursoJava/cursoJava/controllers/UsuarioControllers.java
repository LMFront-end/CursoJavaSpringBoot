package com.cursoJava.cursoJava.controllers;

import com.cursoJava.cursoJava.dao.UsuarioDao;
import com.cursoJava.cursoJava.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//anotacion
@RestController
public class UsuarioControllers {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();

        usuario.setId(id);
        usuario.setNombre("Lina");
        usuario.setApellido("Guerrero");
        usuario.setEmail("lina@gmail.com");
        usuario.setTelefono("3182991851");
        usuario.setPassword("123456");


        return usuario;
    }

    // GET
    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    //POST
    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, usuario.getPassword());
        // modificar la constraseña con un HASH
        usuario.setPassword(hash);

        usuarioDao.registrar(usuario);
    }

    //editar
    @RequestMapping(value = "usuario7896")
    public Usuario editar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Lina");
        usuario.setApellido("Guerrero");
        usuario.setEmail("lina@gmail.com");
        usuario.setTelefono("3182991851");
        usuario.setPassword("123456");


        return usuario;
    }

    //eliminar
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }

    // buscar
    @RequestMapping(value = "usuario456")
    public Usuario buscar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Lina");
        usuario.setApellido("Guerrero");
        usuario.setEmail("lina@gmail.com");
        usuario.setTelefono("3182991851");
        usuario.setPassword("123456");


        return usuario;
    }
}
