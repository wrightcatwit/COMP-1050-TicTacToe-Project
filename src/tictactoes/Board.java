	package tictactoes;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Board extends Application implements Initializable{
	//HHH
	@FXML
	GridPane o1 = new GridPane();
	
	private int player = 0;
	
	@FXML
	private Button b1r1c1;
	@FXML
	private Button b1r1c2;
	@FXML
	private Button b1r1c3;
	@FXML
	private Button b1r2c1;
	@FXML
	private Button b1r2c2;
	@FXML
	private Button b1r2c3;
	@FXML
	private Button b1r3c1;
	@FXML
	private Button b1r3c2;
	@FXML
	private Button b1r3c3;
	
	public static void main(String[] args) {launch(args);}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("TicTacToeUI.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("TicTacToes");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
}
