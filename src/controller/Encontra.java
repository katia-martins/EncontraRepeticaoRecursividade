package controller;

public class Encontra {

	public Encontra() {
		super();
	}
	
	public int pertence(int num, int comparador) {
		
		if (num == 0) {
			return 0;
		} 
		else {
			int div = num / 10;
			int ocorre = 0;
			
			if (num % 10 == comparador) {
				
				ocorre = 1;
			}
			
			return ocorre + pertence(div, comparador);
		}
	}

}
