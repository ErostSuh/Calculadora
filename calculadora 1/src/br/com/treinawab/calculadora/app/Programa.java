package br.com.treinawab.calculadora.app;

import br.com.treinawab.calculadora.fabricas.FabricaCalculadorMatematico;
import br.com.treinaweb.calculadora.interfaces.calculadorMatematico;

public class Programa {

	public static void main(String[] args) {
		String calculo = "+";
		int numero1 = 2;
		int numero2 = 2;
		
		FabricaCalculadorMatematico fabrica = new FabricaCalculadorMatematico();
		
		calculadorMatematico calculador = fabrica.criarCalculador(numero1, numero2, calculo);
		if (calculador != null) {
			System.out.println(calculador.Calcular());
	}else {
		System.out.println("Calculo invalido.");
	}
		
	}

}
