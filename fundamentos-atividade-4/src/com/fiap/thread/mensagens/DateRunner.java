package com.fiap.thread.mensagens;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateRunner implements Runnable {

	private final DateTimeFormatter formatter = 
			DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	@Override
	public void run() {
				
		while (true) {
			LocalDateTime date = LocalDateTime.now();
			String formatedDate = formatter.format(date);
			System.out.println(formatedDate);
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace(System.out);
			}
			
		}
		
		
	}
	

}
