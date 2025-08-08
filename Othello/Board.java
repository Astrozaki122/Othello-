package Othello;
import java.util.ArrayList;
import java.util.List;



public class Board {
  
  private int height;
  private int width;
  private Columns[][] board;
  private List<Counter> counter = new ArrayList<>();
  final int counters = 4;
 
  private int insert(int counter) {
		return counter;
}
 public  int getHeight() {
	  return height;
  }
  
  public int getWidth() {
	  return width;
  }
  
  public Board(int height, int width) {
	  super();
	  this.height = height; 
	  this.width = width;
  
	  
  this.board = new Columns[width][height];
  for (int i=0; i < this.board.length; i++) {
	  Columns[] row = this.board[i];
   for (int j=0; j < row.length; j++) {
	   row[j] = new Columns();
   }
  }
 }
  public boolean Coordinate(int x,int y) { 
	  return x >= 0 && y >= 0 && x < this.width && y < this.height;
  }

  
  public Columns getColumns(int x, int y) {
	  return this.board[y][x];
	  }
  
 
  
  
	  
  public void display(items items) {
	  for (Counter c: items.getCounter()) {
		  setCounter(c);
		  
	  }
  }
  
  public Counter setCounter(Counter counter) {
       
	final int position = counter.load();
	  for ( int i = 0; i < position; i++) {
		  ((Counter) counter).place();
		  
		  
	  }
  
  
    int set = 0;
    boolean setting = true; 
   while (setting) {
	  if (set > counters) {
		  for(int i = 0; i < this.board.length; i++) {
			  Columns[] row = this.board[i];
		  for (int j = 0; j < row.length; j++) {
			  row[j].setCounter(null);
		  } 
		}
		  for(Counter DC: this.counter) {
			  DC.setlocation(3,4);
		  for(Counter WC: this.counter) {
			  WC.setlocation(3,5);
		  }
			  
		  }
		  
		  if(((Counter) this.counter).turn()) {
			  ((Counter) counter).place();
		  }else {
			  ((Counter) counter).place();
		  }
		  
		  
		  this.counter.clear();
		  }
  }
  
  
 counter.place();
  int x = insert(this.width - counter.getWidth());
  int y = insert(this.height - counter.getHeight());
  counter.setlocation(x, y);
  setting = false;
   
   
  
   for(final Counter c : this.counter) {
		  if(c.position(counter)) {
			  setting = true;
			  break;
		  }
	  }
	 
   boolean sandwich = true;
    while(sandwich) {
  if(counter.invent()) {
	  counter.addtotheBoard(this);
	  this.counter.add((Counter) counter);
	 
  }
 
  if(!counter.invent()) {
	  counter.addtotheBoard(this);
	  this.counter.add((Counter) counter);
	 
  }
    }
  set++;
	return counter;
	}



@SuppressWarnings("unused")
public Columns playthrough(final int x, final int y) {
	  Columns columns = getColumns(x,y);
	  if(!columns.getattempt()) {
		  columns.setattempt(true);
		  Counter flipped = null;
		  boolean gamefinish = false;
		  while(columns.sandwich()) {
		  if(columns.Outflanked()) {
			  ((Columns) this.counter).change();
			  if(columns.Flanked()) {
				flipped = columns.getCounter();
						   if(!columns.Flanked()) {
							  gamefinish = false;
							 break;
						 }
					 } 
		  }  
		return new Columns();
		 } 
		 }
	return columns;
	
    }

	   
	  
  


  
  
  
  public String[] toStringArray(final boolean displaycounter) {
	  final String[] array = new String[this.height];
	  for(int y = 0; y < this.height; y++) {
		  final StringBuilder builder = new StringBuilder(this.width);
		  for(int x = 0; x < this.width; x++) {
			  Columns columns = getColumns(x,y);
			  builder.append(columns.getcodecharacter(displaycounter));
		  }
	      array[y] = builder.toString();
	  }
    return array;
  }

 

  public  String toString() {
		final String[] array = toStringArray(true);
		final StringBuilder builder = new StringBuilder();
		for(int y = 0; y < this.height; y++) {
			builder.append(array[y]);
			builder.append("\n");
		}
		return builder.toString();
	}








}

  



