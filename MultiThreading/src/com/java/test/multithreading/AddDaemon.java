package com.java.test.multithreading;

public class AddDaemon implements Runnable, Daemon {


	public static Thread DAEMON_THREAD;
	private int count = 0;

	public AddDaemon() {
		DAEMON_THREAD = new Thread(this);
		DAEMON_THREAD.start();
	}

	@Override
	public void run() {
		
		while(count < 20){
			synchronized (LIST) {
				LIST.add("Count " + count++);
				System.out.println("Daemon Added:" + Daemon.LIST.toString());
			}
			try {
				Thread.sleep((long) (Math.random()*1000+1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
