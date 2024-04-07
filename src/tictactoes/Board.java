package tictactoes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Board extends Application {
	
	private int[][] Secs = new int[3][3]; 
	
	public static void main(String[] args) {launch(args);}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("TicTacToeUI.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("TicTacToes");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
}
