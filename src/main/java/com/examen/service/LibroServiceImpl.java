package com.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Libro;
import com.examen.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{
	
	@Autowired
	private LibroRepository repository;
	
	@Override
	public Libro insertaLibro(Libro obj) {
		return repository.save(obj);
	}
	
	@Override
	public List<Libro> listaLibro() {
		return repository.findAll();
	}

}
