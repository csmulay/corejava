package com.java.test.multithreading;

public class RunDaemon {

	public static void main(String[] args) {
		
		AddDaemon testDaemon1 = new AddDaemon();
		RemoveDaemon testDaemon2 = new RemoveDaemon();
		
		try {
			testDaemon1.DAEMON_THREAD.join();
			
			System.out.println("Add Daemon exited");
			
			testDaemon2.DAEMON_THREAD.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("FINAL:" + Daemon.LIST.toString());
		
		
	}

}
