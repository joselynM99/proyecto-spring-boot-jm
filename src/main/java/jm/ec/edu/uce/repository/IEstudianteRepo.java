package jm.ec.edu.uce.repository;

import jm.ec.edu.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	void insertar(Estudiante estudiante);//C
	void buscarPorNombre(String nombre);//R
	void actualizar(Estudiante estudiante);//U
	void borrar(String nombre);//D

}
