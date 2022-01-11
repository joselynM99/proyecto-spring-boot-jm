package jm.ec.edu.uce.service.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)

public class MatriculaSingletonServiceImpl implements IMatriculaSingletonService {

	private String codigo;

	@Override
	public String establecerDato(String valor) {
		this.codigo = valor;
		return this.codigo;
	}
	@Override
	public String obtenerCodigo() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	// Metodos Set y Get

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	

}
