package jm.ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jm.ec.edu.uce.modelo.Estudiante;
import jm.ec.edu.uce.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	@Autowired
	private IEstudianteRepo estudiante;

	@Override
	public void guardarEstudiante(Estudiante estudiante) {
		this.estudiante.insertar(estudiante);
	}

	@Override
	public void buscarEstudiante(String nombre) {
		this.estudiante.buscarPorNombre(nombre);
		
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		this.estudiante.actualizar(estudiante);
	}

	@Override
	public void borrarEstudiante(String nombre) {
		this.estudiante.borrar(nombre);
	}

}
