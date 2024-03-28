package tictactoes;

public class Pieces {
	
	int value; //this will be 0 for empty, 1 for x, and 2 for o
	int positionX, positionY;//self explanatory/read GameMaster 
	
	public Pieces(int value, int positionX, int positionY) {
		this.value = value;
		this.positionX = positionX;
		this.positionY = positionY;
		
	}
	
}
