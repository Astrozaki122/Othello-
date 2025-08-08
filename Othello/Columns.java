package Othello;


public class Columns {
    
	private boolean attempt = false;
	private Counter counter;
	
	
 


public void setCounter(Counter counter) {
		this.counter = counter;
		
		
	}
	
	public Counter getCounter(){
		return this.counter;
		
	}
	
	public  boolean getattempt() {
		return this.attempt;
	}
	
	
	
	public boolean Outflanked() {
		return this.attempt && this.counter != null;
	}
	
	public boolean Flanked() {
		return this.attempt && this.counter == null;
		
	}
	
	
	public boolean sandwich() {
       if(sandwich()) {
    	   this.counter.getHeight();
    	   this.counter.getWidth();
    	   }
		return this.attempt && this.counter != null;
	}
	
	
	public boolean change() {
		if (Outflanked()) {
			this.counter.invent();
		}else {
			if(Flanked()) {
				return this.attempt;
			}
		}
		return attempt;
	}
	
	
	public String getcodecharacter(boolean displayCounter) {
		
		if(this.attempt) {
			if(this.Outflanked()) {
				while(sandwich()) {
				return "F";
				}
			} 
			if (this.Flanked()) {
				return "R";
			}else {
				if(displayCounter && this.counter != null) {
					return this.counter.getCode();
				}
			}
			
		}
		return "_";
		}
	
	
	

	public void setattempt(boolean attempt) {
		this.attempt = attempt;
		if(this.counter != null) {
			(this.counter).invent();
		}
	}
	
	
	
	
	
	
	
   
	
}
    
	
