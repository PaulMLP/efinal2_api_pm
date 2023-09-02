package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;

@Service
public class EstudianteImplService implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		this.estudianteRepository.insertarEstudiante(estudiante);
	}

	@Override
	public EstudianteTO buscaEstudiante(String cedula) {
		return this.convertir(this.estudianteRepository.buscaEstudiante(cedula));
	}

	private EstudianteTO convertir(Estudiante e) {
		EstudianteTO eto = new EstudianteTO();
		eto.setId(e.getId());
		eto.setNombre(e.getNombre());
		eto.setApellido(e.getApellido());
		eto.setCedula(e.getCedula());

		return eto;
	}
}
