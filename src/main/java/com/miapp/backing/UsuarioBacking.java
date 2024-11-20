package com.miapp.backing;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.miapp.beans.Usuario;
import com.miapp.services.UsuarioService;

@ManagedBean
@ViewScoped
public class UsuarioBacking {
    private UsuarioService usuarioService;
    private Usuario nuevoUsuario;
    private List<Usuario> usuarios;

    // Constructor
    public UsuarioBacking() {
        usuarioService = new UsuarioService(); // Instanciar el servicio
        nuevoUsuario = new Usuario("", ""); // Usuario vacío para el formulario
        usuarios = usuarioService.obtenerUsuarios(); // Cargar usuarios
    }

    // Métodos para interactuar con la UI
    public void agregarUsuario() {
        usuarioService.agregarUsuario(nuevoUsuario);
        nuevoUsuario = new Usuario("", ""); // Reiniciar el formulario
        usuarios = usuarioService.obtenerUsuarios(); // Actualizar la lista
    }

    // Getters y Setters
    public Usuario getNuevoUsuario() {
        return nuevoUsuario;
    }

    public void setNuevoUsuario(Usuario nuevoUsuario) {
        this.nuevoUsuario = nuevoUsuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
