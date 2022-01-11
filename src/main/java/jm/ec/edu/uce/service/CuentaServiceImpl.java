package jm.ec.edu.uce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jm.ec.edu.uce.modelo.Cuenta;
import jm.ec.edu.uce.repository.ICuentaRepo;

@Service
public class CuentaServiceImpl implements ICuentaService {

	private static final Logger LOG = LoggerFactory.getLogger(CuentaServiceImpl.class);

	@Autowired
	@Qualifier("Ahorros")
	private ICuentaRepo cuentaRepo;
	
	@Autowired
	@Qualifier("Corriente")
	private ICuentaRepo cuentaRepoA;
	

	@Override
	public void ingresarCuentaHabiente(Cuenta cuenta) {
		LOG.info("Aqui se guarda el cliente");
		////////programacion del guardar cliente
		LOG.info("Aquí se guarda la cuenta");
		if(cuenta.getSaldo().intValue()>=500){
			this.cuentaRepo.crear(cuenta);

		}else {
			this.cuentaRepoA.crear(cuenta);
		}
				
	}
	

}
