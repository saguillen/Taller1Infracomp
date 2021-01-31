package main;

public class Ejemplo2T1b extends Thread{
	
	private static  int contador = 0;

	public void run()
	{
		for(int i = 0; i<10000;i++)
		{
			contador++;
		}
	}

	public static void main(String[] args) {

		Ejemplo2T1b[] t = new Ejemplo2T1b[1000];
		
		for(int i = 0; i<t.length;i++ )
		{
			t[i] = new Ejemplo2T1b();
			t[i].start();
		}
		System.out.println(contador);
	}

}
