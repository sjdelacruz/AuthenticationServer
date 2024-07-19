package com.authentication.server.repositories.mysql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.server.models.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
