package jm.ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import jm.ec.edu.uce.modelo.Cuenta;

@Repository
@Qualifier("Corriente")
public class CuentaCorrienteRepoImpl implements ICuentaRepo{
	private static final Logger LOG = LoggerFactory.getLogger(CuentaCorrienteRepoImpl.class);


	@Override
	public void crear(Cuenta cuenta) {
		LOG.info("Se ha ingresado una nueva cuenta: "+cuenta);
	}

}
