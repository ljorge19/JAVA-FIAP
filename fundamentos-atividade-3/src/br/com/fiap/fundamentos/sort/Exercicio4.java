package br.com.fiap.fundamentos.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio4 {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("TONY STARK", 45, 'M', "STARK INDUSTRIES"));
		pessoas.add(new Pessoa("BRUCE WAYNE", 39, 'M', "WAYNE INTERPRISES"));
		pessoas.add(new Pessoa("NATASHA ROMANOFF", 37, 'F', "AVENGERS"));
		pessoas.add(new Pessoa("STEVE ROGERS", 90, 'M', "AVENGERS"));
		pessoas.add(new Pessoa("LOGAN", 87, 'M', "XMAN"));

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Lista normal");
		System.out.println("--------------------------------------------------------------------------------");
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.toString());

		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				return p1.getNome().compareTo(p2.getNome());
			}
		});

		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Lista em ordem crescente");
		System.out.println("--------------------------------------------------------------------------------");
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.toString());

		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				return p2.getNome().compareTo(p1.getNome());
			}
		});

		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Lista em ordem decrescente");
		System.out.println("--------------------------------------------------------------------------------");
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.toString());

		
		
		
			  for (int i = 0; i < pessoas.size(); i++) {
			    if (pessoas.get(i).getNome().equals("STEVE ROGERS")) {
			    	pessoas.remove(i);
			    }
			  }

		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("retirando o elemento \"STEVE ROGERS\" da lista");
		System.out.println("--------------------------------------------------------------------------------");
		
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.toString());
	}

}
