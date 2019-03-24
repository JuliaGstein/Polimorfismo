/**
 * 
 */
package br.com.sobrecarga;

import java.util.ArrayList;
import java.util.List;

public abstract class Agencia {
	String numero;
	List<Conta> contas = new ArrayList<>();

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	
}
