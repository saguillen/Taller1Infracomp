package main;

public class EjThreads02 implements Runnable {
	
	public void run()
	{
		System.out.println("implementando la interfaz Runnable.");
	}
	
	public static void main(String[] args) {
	
		Thread t = new Thread( new EjThreads02());

		t.start();
	}

}
