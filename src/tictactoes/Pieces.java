package tictactoes;

public class Pieces {
	
	int value; //this will be 0 for empty, 1 for x, and 2 for o
	int position; //zero for top left, 8 for bottom right 
	
	public Pieces(int value, int position) {
		this.value = value;
		this.position = position;
		
	}
	
}
