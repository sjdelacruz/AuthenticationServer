package com.authentication.server.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.authentication.server.models.muebleria.Mueble;
import com.authentication.server.repositories.postgresql.MuebleRepository;
import com.authentication.server.services.MuebleService;

@Service
public class MuebleServiceImpl implements MuebleService{

	private final MuebleRepository repository;
	
	public MuebleServiceImpl(MuebleRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Mueble> getMuebles() {
		return repository.findAll();
	}

}
