package br.com.fiap.fundamentos.cript;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public final class CodificaDecodifica {
	private final Alphabet alphabet;
	private static String enteredWord;
	public CodificaDecodifica() {
		alphabet = new Alphabet();
	}
	
	

	public static void main(String[] args) {
		CodificaDecodifica cryptor = new CodificaDecodifica();
		
		
		String opcaoViaTeclado = null;
		int opcao = 0;

		do {
			System.out.println("\n");
			System.out.println("             ============================================");
			System.out.println("             |     1 - encriptar mensagem               |");
			System.out.println("             |     2 - decriptar mensagem               |");
			System.out.println("             |     0 - Sair                             |");
			System.out.println("             ============================================");
			System.out.println("\n");
			opcaoViaTeclado = JOptionPane.showInputDialog("Opções do menu -> ");
			System.out.print("\n");

			if (!opcaoViaTeclado.matches("^[0-9]*$"))
				opcaoViaTeclado = "100";

			if (opcaoViaTeclado.equals(""))
				opcaoViaTeclado = "100";

			opcao = Integer.valueOf(opcaoViaTeclado);
			switch (opcao) {
			case 1:
				init();
				cryptor.codifyEnteredWord();
				break;
			case 2:
				init();
				cryptor.uncodifyEnteredWord();
				break;
			
			case 0:
				System.out.println("Programa encerrado.");
				JOptionPane.showMessageDialog(null, "Programa encerrado.");
				break;
			default:
				System.out.println("Opção Inválida!");
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}
		
		            
				
				
	
	public void codifyEnteredWord() {
	    StringBuffer codifiedWord = new StringBuffer();
		System.out.println("--------------- PALAVRA CODIFICADA ------------");
		System.out.println("Palavra original á ser codificada : " + enteredWord);
		
		for (int i = 0; i < enteredWord.length(); i++) {
			for (Map.Entry<Character, Character> map : getAlphabet().getAlphabet().entrySet()) {
				if (map.getKey().equals(enteredWord.charAt(i))) {
					codifiedWord.append(map.getValue());
				}
			}
		}
		System.out.println("Palavra codificada : " + codifiedWord.toString());
		System.out.println("\n");
		saveFile("C:\\Users\\Public\\mensagemCodificada.txt", codifiedWord.toString());
		
		
	}
	public void uncodifyEnteredWord() {
		System.out.println("--------------- PALAVRA DECODIFICADA ------------");
		System.out.println("Palavra original codificada : " + enteredWord);
		StringBuffer uncodifiedWord = new StringBuffer();
		for (int i = 0; i < enteredWord.length(); i++) {
			for (Map.Entry<Character, Character> map : getAlphabet().getAlphabet().entrySet()) {
				if (map.getValue().equals(enteredWord.charAt(i))) {
					uncodifiedWord.append(map.getKey());
				}
			}
		}
		System.out.println("Palavra decodificada : " + uncodifiedWord.toString());
		saveFile("c:\\Users\\Public\\mensagemDecodificada.txt", uncodifiedWord.toString());
	}
	public Alphabet getAlphabet() {
		return alphabet;
	}
	
	
	private static void saveFile(String path, String content) {
		BufferedWriter bw = null;
		
		try {
			
			File file = new File(path);

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			bw.write(content);
						
		}catch(Exception e){
			e.printStackTrace(System.out);
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace(System.out);
			}
		}
	}
	
	public static String init() {
		
		String msg = JOptionPane.showInputDialog("Digite a mensagem");
		enteredWord = msg;
		String result = msg;
		return result;
	}
}