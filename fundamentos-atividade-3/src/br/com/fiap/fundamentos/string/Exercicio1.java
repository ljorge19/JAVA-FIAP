package br.com.fiap.fundamentos.string;

public class Exercicio1 {

	public static void main(String [] args) {
        
		String string = ""; 
        int z=1; 
        for (int i = 0; i < 12; i++) { 
               z++; 
               string += "string"; 
        }
        
        System.out.println("String: " + string);
        System.out.println("Quantidade de Objetos do tipo String: " + z);
        System.out.println("Utilizar as classes StringBuilder ou StringBuffer (caso necessite de operações Thread-Safe)!");
        
	}
	
}
