package br.com.fiap.fundamentos.data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {

	public static void main(String [] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		// 2012-09-10 12:00
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
		String date = formatter.format(localDateTime);		
		System.out.println(date);
				
		// 10-09-12 12:00:00
		formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss"); 
		date = formatter.format(localDateTime);		
		System.out.println(date);
				
		// Monday (dia da semana)
		formatter = DateTimeFormatter.ofPattern("EEEE"); 
		date = formatter.format(localDateTime);		
		System.out.println(date);
		
		// 2012 (ano)
		formatter = DateTimeFormatter.ofPattern("Y"); 
		date = formatter.format(localDateTime);		
		System.out.println(date);
		
		// AD (era)
		formatter = DateTimeFormatter.ofPattern("G"); 
		date = formatter.format(localDateTime);		
		System.out.println(date);
	}		
}


