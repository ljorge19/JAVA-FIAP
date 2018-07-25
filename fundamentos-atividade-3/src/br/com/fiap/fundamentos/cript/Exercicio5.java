package br.com.fiap.fundamentos.cript;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String [] args) {

		String msg = JOptionPane.showInputDialog("Digite a mensagem");
		StringBuilder builder = new StringBuilder();

		for (int i = 0, lenth = msg.length(); i < lenth; i++) {
			char ch = msg.charAt(i);
			ch += 1;
			builder.append(ch);
		}
		 
		saveFile("C:\\Users\\Public\\mensagemCodificada.txt", builder.toString());
		saveFile("c:\\Users\\Public\\mensagemDecodificada.txt", msg);


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
	

}
