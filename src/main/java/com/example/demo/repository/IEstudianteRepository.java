package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
	public void insertarEstudiante(Estudiante estudiante);

	public Estudiante buscaEstudiante(String cedula);

}
