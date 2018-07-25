package com.fiap.thread.aeroporto;

public class Aeroporto extends Thread {

	private String nome;
	private boolean pistaDisponivel;	
	
	public Aeroporto(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void run() {
		while(true) {
			alterarEstadoPista(true);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			
             alterarEstadoPista(false);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
		
	}
	
	
	public synchronized void aguardarPistaDisponivel() {
 
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			
		
		
	}
	
	public synchronized void alterarEstadoPista(Boolean disponivel) {
		
		if (disponivel == true){
		pistaDisponivel = disponivel;				
		notifyAll();
		}
	}
	
}
