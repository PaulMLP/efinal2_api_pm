package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;

public interface IEstudianteService {

	public void insertarEstudiante(Estudiante estudiante);

	public EstudianteTO buscaEstudiante(String cedula);
}
