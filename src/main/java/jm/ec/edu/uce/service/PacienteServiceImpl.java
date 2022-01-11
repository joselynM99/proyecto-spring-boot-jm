package jm.ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jm.ec.edu.uce.modelo.Paciente;
import jm.ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacientService {

	//private PacienteRepoImpl paciente = new PacienteRepoImpl(); (desacoplamos con Spring)
	
	@Autowired
	private IPacienteRepo paciente;
	
	@Override
	public void calcularDeuda() {
		// Traer de la base la deuda
		// Multiplicar por 12%
		// calcular multa
		// .....logica
	}

	@Override
	public void guardarPaciente(Paciente paciente) {
		this.paciente.insertar(paciente);
	}

	@Override
	public void buscarPaciente(String cedula) {
		this.paciente.buscarPorCedula(cedula);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		this.paciente.actualizar(paciente);
	}

	@Override
	public void borrarPaciente(String cedula) {
		this.paciente.borrar(cedula);
		
	}
	
}
