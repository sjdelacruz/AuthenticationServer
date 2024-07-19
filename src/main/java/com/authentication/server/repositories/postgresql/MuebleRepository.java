package com.authentication.server.repositories.postgresql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.server.models.muebleria.Mueble;

public interface MuebleRepository extends JpaRepository<Mueble, Integer>{

}
