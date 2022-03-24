package br.com.treinaweb.calculadora.classes;

import br.com.treinaweb.calculadora.interfaces.calculadorMatematico;

public abstract class CalculoMatematico implements calculadorMatematico {

	private int numero1;
	private int numero2;
	
	public CalculoMatematico(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	@Override
	public boolean validar() {
		return numero1 >= 0 && numero2 >= 0;
	}

	@Override
	public final int calcular() {
		if(validar()) {
			return doCalcular();
		}else {
			return -1;
		}
	}
	
	protected abstract int doCalcular();
	
}
