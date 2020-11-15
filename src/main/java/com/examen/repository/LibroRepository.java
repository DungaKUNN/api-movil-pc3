package com.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.entity.Libro;

public interface LibroRepository  extends JpaRepository<Libro, Integer>{

	

}
