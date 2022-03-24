package br.com.treinaweb.calculadora.classes;

public class Potencializador extends CalculoMatematico {

	public Potencializador(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	protected int doCalcular() {
		return (int) Math.pow(numero1, numero2);
	}

}
