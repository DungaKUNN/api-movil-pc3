package com.examen.service;

import java.util.List;

import com.examen.entity.Libro;

public interface LibroService {

	public List<Libro> listaLibro();
	public List<Libro> listaLibroPorNombre(String tipo);
}
