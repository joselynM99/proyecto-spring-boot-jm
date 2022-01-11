package jm.ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import jm.ec.edu.uce.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

	private static final Logger LOG = LoggerFactory.getLogger(EstudianteRepoImpl.class);

	@Override
	public void insertar(Estudiante estudiante) {
		LOG.info("Se guardo al estudiante: " + estudiante);
	}

	@Override
	public void buscarPorNombre(String nombre) {
		LOG.info("Buscando al estudiante de nombre: " + nombre);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		LOG.info("Actualizando información de: " + estudiante);
	}

	@Override
	public void borrar(String nombre) {
		LOG.info("Borrando al estudiante de nombre: " + nombre);
	}

}
