package com.java.test.multithreading;

public class RemoveDaemon implements Runnable, Daemon {

	public static Thread DAEMON_THREAD;

	public RemoveDaemon() {
		DAEMON_THREAD = new Thread(this);
		//DAEMON_THREAD.setDaemon(true);
		DAEMON_THREAD.start();
	}

	@Override
	public void run() {
		
		while(true) {
			if(!LIST.isEmpty()) {
				
				synchronized (LIST) {
					
					while(!LIST.isEmpty()) {
						System.out.println("Daemon Removing:" + LIST.get(0));
						LIST.remove(0);
					}
				}
				
			} else
			{
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}