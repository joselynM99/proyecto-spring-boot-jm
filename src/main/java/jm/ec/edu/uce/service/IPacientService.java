package jm.ec.edu.uce.service;

import jm.ec.edu.uce.modelo.Paciente;

public interface IPacientService {
	void calcularDeuda();
	void guardarPaciente(Paciente paciente);//C
	void buscarPaciente(String cedula);//R
	void actualizarPaciente(Paciente paciente);//U
	void borrarPaciente(String cedula);//D 
}
