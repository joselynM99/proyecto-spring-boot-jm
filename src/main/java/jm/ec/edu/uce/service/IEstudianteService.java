package jm.ec.edu.uce.service;

import jm.ec.edu.uce.modelo.Estudiante;

public interface IEstudianteService {
	void guardarEstudiante(Estudiante estudiante);//C
	void buscarEstudiante(String nombre);//R
	void actualizarEstudiante(Estudiante estudiante);//U
	void borrarEstudiante(String nombre);//D 
}
