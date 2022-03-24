package br.com.treinawab.calculadora.fabricas;

import br.com.treinaweb.calculadora.classes.Adicao;
import br.com.treinaweb.calculadora.classes.Divisao;
import br.com.treinaweb.calculadora.classes.Multiplicacao;
import br.com.treinaweb.calculadora.classes.Potencializador;
import br.com.treinaweb.calculadora.classes.subtracao;
import br.com.treinaweb.calculadora.interfaces.calculadorMatematico;

public class FabricaCalculadorMatematico {

	public calculadorMatematico criarCalculador(int numero1, int numero2, String calculo) {
		if(calculo.equals("+")) {
			return new Adicao(numero1, numero2);
		}else if (calculo.equals("-")) {
			return new subtracao(numero1, numero2);
		}else if (calculo.equals("*")) {
			return new Multiplicacao(numero1, numero2);
		}else if (calculo.equals("/")) {
			return new Divisao(numero1, numero2);
		}else if (calculo.equals("^")) {
			return new Potencializador(numero1, numero2);
		}else {
			return null;
		}
	}
	
}
