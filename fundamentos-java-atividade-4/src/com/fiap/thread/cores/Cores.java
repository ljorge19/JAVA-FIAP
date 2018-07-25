package com.fiap.thread.cores;

public enum Cores {
	
	BRANCO("Branco", 21),
	PRETO("Preto", 22),
	VERMELHO("Vermelho", 23),
	AMARELO("Amarelo",24 ),
	AZUL("Azul", 25);
	
	private String nome;
	private int codigo;
	
	Cores(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String recuperarNomeDaCor() {
		return nome;
	}
	
	public int recuperarCodigoDaCor() {
		return codigo;
	}	
}
