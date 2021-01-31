package main;

import java.util.Scanner;

public class Ejercicio1Runnable implements Runnable{

	private boolean esPar;
	private static int limite;
	
	public Ejercicio1Runnable(boolean paridad)
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
			for(int i = 1 ; i <= (limite); i++) {
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

	        Thread esPAr = new Thread(new Ejercicio1Runnable(true));
	        Thread impar = new Thread(new Ejercicio1Runnable(false));

	        esPAr.start();
	        impar.start();
	}

	

}
