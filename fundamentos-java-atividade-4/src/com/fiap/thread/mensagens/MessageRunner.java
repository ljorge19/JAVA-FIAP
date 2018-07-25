package com.fiap.thread.mensagens;

import java.util.List;

public class MessageRunner implements Runnable {

	private List<String> messages;
	
	public MessageRunner(List<String> messages) {
		this.messages = messages;
	}
	
	@Override
	public void run() {
		int count = 1;
		for (String message : messages) {
			System.out.println(message);
			
			if (count < messages.size()) {
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					e.printStackTrace(System.out);
				}
			}
			
			
			count++;
			
		}
		
	}

}
