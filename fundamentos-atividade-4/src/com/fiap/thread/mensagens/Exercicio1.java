package com.fiap.thread.mensagens;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		List<String> messages = new ArrayList<>();
		messages.add("Mensagem 1");
		messages.add("Mensagem 2");
		messages.add("Mensagem 3");
		
		Thread thread1 = new Thread(new MessageRunner(messages));
		thread1.start();
		
		Thread thread2 = new Thread(new DateRunner());
		thread2.start();
		
		
		while(true) {
			System.out.println("\n");
			System.out.println("Thread1: " + thread1.getState().toString());	
			System.out.println("Thread2: " + thread2.getState().toString());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}
