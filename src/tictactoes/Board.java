package tictactoes;

public class Board {
	
	private Pieces[][]Board = new Pieces[3][3];
	private boolean isWon = false; 
	
	 public Board(Pieces[][] Board, boolean isWon) {
		 this.Board = Board;
		 this.isWon = threeInARow(Board);
	}
	 
	 public boolean threeInARow(Pieces[][] Board) {
		 return false; 
	 }
	
	
}
