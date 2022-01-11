package jm.ec.edu.uce.modelo;

import java.math.BigDecimal;

public class Cuenta {
	private String numero;
	//private double saldo; //Cuando usamos dinero no debemos usar double
	private BigDecimal saldo;
	
	//Metodos get y set
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
	

}
