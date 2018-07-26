package com.fiap.thread.aeroporto;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto("Aeroporto de Guarulhos");
		Aviao tan = new Aviao("TAN 123", aeroporto);
		Aviao ole = new Aviao("OLÉ 111", aeroporto);
		Aviao linha = new Aviao("LINHA 222", aeroporto);
		
		aeroporto.start();
		tan.start();
		ole.start();
		linha.start();
	}
	
}
