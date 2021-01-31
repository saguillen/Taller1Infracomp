package main;

public class Ejemplo1T1b {

	private  int contador = 0;
	
	public void incrementar()
	{
		for(int i = 0; i< 10000;i++)
		{
			contador++;
		}
		
	}
	public int getContador(){
		return contador;
	}
	
	public static void main(String[] args){
		Ejemplo1T1b c = new Ejemplo1T1b();
		
		for(int i=0;i<1000;i++){
			c.incrementar();
			
		}
		System.out.println(c.getContador());
	}
	
}
