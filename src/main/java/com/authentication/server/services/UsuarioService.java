package com.authentication.server.services;

import java.util.List;

import com.authentication.server.models.usuario.Usuario;

public interface UsuarioService {

	List<Usuario> getUsuarios();
}
