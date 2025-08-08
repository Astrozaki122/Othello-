package Othello;
import java.util.ArrayList;
import java.util.List;
public class items {
    
	List<Counter> counter = new ArrayList<Counter>();

	public items(int DarkCounter, int WhiteCounter ) {
		for(int i = 0; i < DarkCounter; i++) {
			this.counter.add(new DarkCounter());
		}
    	 for(int i = 0; i < WhiteCounter; i++) {
    		 this.counter.add(new WhiteCounter());
    	 }
     }
 
	public List<Counter> getCounter() {
		return this.counter;
	}
     
     
}





















































