package br.com.treinaweb.calculadora.classes;

import br.com.treinaweb.calculadora.interfaces.calculadorMatematico;

public abstract class CalculoMatematico implements calculadorMatematico {

	protected int numero1;
	protected int numero2;
	
	public CalculoMatematico(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	@Override
	public boolean Validar() {
		return numero1 >= 0 && numero2 >= 0;
	}

	@Override
	public final int Calcular() {
		if(Validar()) {
			return doCalcular();
		}else {
			return -1;
		}
	}
	
	protected abstract int doCalcular();
	
}
