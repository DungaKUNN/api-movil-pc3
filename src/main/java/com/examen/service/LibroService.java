package com.examen.service;

import java.util.List;

import com.examen.entity.Libro;

public interface LibroService {

	public abstract Libro insertaLibro(Libro obj);
	public abstract List<Libro> listaLibro();
}
