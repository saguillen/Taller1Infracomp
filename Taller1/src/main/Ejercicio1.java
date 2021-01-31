package main;

import java.util.Scanner;

public class Ejercicio1 extends Thread {

	private boolean esPar;
	private static int limite;
	
	public Ejercicio1(boolean paridad)
	{
		this.esPar=paridad;
	}
	
	public void run() {
		if(esPar) {
			for(int i = 1 ; i <= limite; i++) {
				if(i % 2 == 0) //es par
				{
					System.out.println("par: "+i);

				}
				try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
			}
		}	
		else if(!esPar) {
			for(int i = 1 ; i <= limite; i++) {
				if(i % 2 != 0) //es impar
				{
					System.out.println("impar: "+i);

				}
				try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
			}
		}
}
	
	public static void main(String[] args) {

		
		 Scanner input = new Scanner(System.in);
	        limite = input.nextInt();
	        input.close();

	        Ejercicio1 esPAr = new Ejercicio1(true);
	        Ejercicio1  impar= new Ejercicio1(false);

	       esPAr.start();
	       impar.start();
	}

}
