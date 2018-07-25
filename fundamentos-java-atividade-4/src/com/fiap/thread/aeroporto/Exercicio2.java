package com.fiap.thread.aeroporto;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto("Aeroporto de Guarulhos");
		Aviao tan = new Aviao("RYANAIR AIRLINES", aeroporto);
		Aviao ole = new Aviao("TURKISH AIRLINES", aeroporto);
		Aviao linha = new Aviao("BRITISH AIRLINES", aeroporto);
		
		aeroporto.start();
		tan.start();
		ole.start();
		linha.start();
	}
	
}
