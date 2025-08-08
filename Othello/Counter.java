package Othello;


import java.awt.geom.Rectangle2D;


public class Counter {
   
private final String name;
   private final String code;
   private int y;
   private int x;
   private boolean horizontal;
   private boolean vertical;
   private boolean diagonal;
   
   protected int counter;
   private int flipped;
   
   
    public Counter(String name, String code) {
	   this.name = name;
	   this.code = code;
   }
   
    
  public String  getName() {
  	  return name;
    }

    public String getCode() {
  	  return code;
    }
    
    
    
    public void setlocation(int y, int x) {
 	   this.x = x;
 	   this.y = y;
    }
    
    
   public void place() {
	   this.horizontal = !this.horizontal;
	   this.vertical = !this.vertical;
	   this.diagonal = !this.diagonal;
	   
   }
   
   public int getHeight(){
	   if(horizontal) {
		  return this.counter;
	   }else {
		   if(vertical) {
			   return this.counter;
		   } 
	   } 
		 if(diagonal) {
			   return this.counter;
		   }else {
			   return 1;
		   }
	   } 
	   
   public int getWidth(){
	   if(horizontal) {
		  return this.counter;
	   }else {
		   if(vertical) {
			   return this.counter;
		   } 
	   } 
		 if(diagonal) {
			   return this.counter;
		   }else {
			   return 1;
		   }
	   } 
   
   
   
   
   
   public boolean invent() {
		if(this.counter < this.flipped){
			this.flipped++;
		}
			return this.flipped == this.counter;
		}
	   
   

   public void addtotheBoard(final Board board) {
	   if(horizontal) {
		   for (int x =0; x < this.counter; x++) {
			   board.getColumns(x + this.x,this.y).setCounter(this);
		   }
			   
		   }else {
			   if(vertical) {
				   for (int x = 0; x < this.counter; x++);
				   board.getColumns(x + this.x,this.y).setCounter(this);
			   }
				   }
	      if(diagonal) {
	    	  for(int x =  0; x < this.counter; x++) {
	    		  board.getColumns(x + this.x,this.y).setCounter(this);
	    		  
	    	  }
	    	  
	      }else {
	    	  for(int y = 0; y < this.counter; y++) {
	    		  board.getColumns(this.x, this.y).setCounter(this);
	    	  }
	      }
		 }
	   
   public boolean position(final Counter variant) {
   	final Rectangle2D rectThis = new Rectangle2D.Double(this.x, this.y, this.getWidth(), this.getHeight());
   	final Rectangle2D rectOther = new Rectangle2D.Double(variant.x, variant.y, variant.getWidth(), variant.getHeight());
   	final Rectangle2D intersection = rectThis.createIntersection(rectOther);
       return (intersection.getWidth() >= 0) && (intersection.getHeight() >= 0);
   }

   
   public String toString() {
	   final StringBuilder builder = new StringBuilder();
	   if(horizontal) {
		   for(int x =0; x <this.counter; x++) {
			   builder.append("0");
		   }
		   builder.append("/n");
	   }else {
		   if(vertical) {
			   for(int x = 0; x < this.counter; x++) {
				   builder.append("/n");
			   }
		       builder.append("0");
		   }
		   if(diagonal) {
			   for(int x = 0; x < this.counter; x++) {
				   builder.append("/n");
				   
			   }
		       builder.append("0");
		   }
	   
	   }
       return builder.toString();
   }
   
   
   public boolean turn() {
	return true;
}







public int load() {
	return counter;
	
}


public boolean turn(Counter counter2) {
	
	return false;
}





















 







 




































 
   


   
   
   
  
  
 
}
