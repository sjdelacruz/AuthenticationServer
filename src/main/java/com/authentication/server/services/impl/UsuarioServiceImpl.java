package com.authentication.server.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.authentication.server.models.usuario.Usuario;
import com.authentication.server.repositories.mysql.UsuarioRepository;
import com.authentication.server.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private final UsuarioRepository repository;
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Usuario> getUsuarios() {
		return repository.findAll();
	}
	
	

}
