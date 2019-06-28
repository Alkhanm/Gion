package xGion;

import classes.gion.Ranger;
import racas.gion.Elderen;

public class Teste {

	public static void main(String[] args) {
		
		Ranger hunter = new Ranger();
		Elderen lumina = new Elderen();
		lumina.criar("Alkhaiano");
		
		
		System.out.println(lumina.toString() + "\n\n\n");
		
		
		hunter.criar(lumina);
		
       System.out.println(lumina.toString());
		
	}
	
	
	
	
}
