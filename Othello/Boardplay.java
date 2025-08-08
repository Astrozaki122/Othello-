package Othello;

public class Boardplay {
	public static void main(String[] args) {
		Board B = new Board(8,8);
		
		items items = new items(5,5);
		B.display(items);
		
		System.out.println(B);
		
		
	}



}
