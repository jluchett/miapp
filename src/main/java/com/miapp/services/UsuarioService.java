package com.miapp.services;

import java.util.ArrayList;
import java.util.List;
import com.miapp.beans.Usuario;

public class UsuarioService {
    private List<Usuario> usuarios;

    // Constructor
    public UsuarioService() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan Pérez", "juan.perez@mail.com"));
        usuarios.add(new Usuario("María Gómez", "maria.gomez@mail.com"));
    }

    // Obtener la lista de usuarios
    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    // Agregar un nuevo usuario
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
