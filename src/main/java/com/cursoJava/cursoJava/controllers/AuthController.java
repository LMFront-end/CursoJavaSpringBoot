package com.cursoJava.cursoJava.controllers;

import com.cursoJava.cursoJava.dao.UsuarioDao;
import com.cursoJava.cursoJava.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// inicio de sesion y autenticación
@RestController
public class AuthController {

    @Autowired
    private UsuarioDao usuarioDao;

    // POST - Envia la información
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario) {

        if (usuarioDao.verificarEmailPassword(usuario)) {
            return "Ok";
        }
        return "fail";
    }
}
