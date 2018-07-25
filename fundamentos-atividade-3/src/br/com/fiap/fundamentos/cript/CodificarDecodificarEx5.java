package br.com.fiap.fundamentos.cript;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public final class CodificarDecodificarEx5 {
	private final Alphabet alphabet;
	private static String enteredWord;
	public CodificarDecodificarEx5() {
		alphabet = new Alphabet();
	}
	
	

	public static void main(String[] args) {
		CodificarDecodificarEx5 cryptor = new CodificarDecodificarEx5();
		
		            init();
					cryptor.codifyEnteredWord();
				
				
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
		
		CodificarDecodificarEx5 cryptor = new CodificarDecodificarEx5();
		cryptor.uncodifyEnteredWord(codifiedWord.toString());
		
	}
	public void uncodifyEnteredWord(String mensagemCodificada) {
		System.out.println("--------------- PALAVRA DECODIFICADA ------------");
		System.out.println("Palavra original codificada : " + mensagemCodificada);
		StringBuffer uncodifiedWord = new StringBuffer();
		for (int i = 0; i < mensagemCodificada.length(); i++) {
			for (Map.Entry<Character, Character> map : getAlphabet().getAlphabet().entrySet()) {
				if (map.getValue().equals(mensagemCodificada.charAt(i))) {
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