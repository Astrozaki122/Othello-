package Othello;



public class Counterrelase {
	public static void main(String [] args) {
		Counter[] counter = new Counter[] {
				new DarkCounter(), new WhiteCounter()
		};
	
		for(Counter c: counter) {
			System.out.println(c.getName());
			System.out.println(c);
			c.place();
			System.out.println(c);
			
		}
	
	
	
	}
   
	




}
