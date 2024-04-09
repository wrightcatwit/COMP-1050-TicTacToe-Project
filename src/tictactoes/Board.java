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
	
	@FXML
	private Button b2r1r1;
	@FXML
	private Button b2r1c2;
	@FXML
	private Button b2r1c3;
	@FXML
	private Button b2r2c1;
	@FXML
	private Button b2r2c2;
	@FXML
	private Button b2r2c3;
	@FXML 
	private Button b2r3c1;
    @FXML
    private Button b2r3c2;
    @FXML 
    private Button b2r3c3;
    
    @FXML
	private Button b3r1r1;
	@FXML
	private Button b3r1c2;
	@FXML
	private Button b3r1c3;
	@FXML
	private Button b3r2c1;
	@FXML
	private Button b3r2c2;
	@FXML
	private Button b3r2c3;
	@FXML 
	private Button b3r3c1;
    @FXML
    private Button b3r3c2;
    @FXML 
    private Button b3r3c3;
    
    @FXML
  	private Button b4r1r1;
  	@FXML
  	private Button b4r1c2;
  	@FXML
  	private Button b4r1c3;
  	@FXML
  	private Button b4r2c1;
  	@FXML
  	private Button b4r2c2;
  	@FXML
  	private Button b4r2c3;
  	@FXML 
  	private Button b4r3c1;
    @FXML
    private Button b4r3c2;
    @FXML 
    private Button b4r3c3;
    
    @FXML
  	private Button b5r1r1;
  	@FXML
  	private Button b5r1c2;
  	@FXML
  	private Button b5r1c3;
  	@FXML
  	private Button b5r2c1;
  	@FXML
  	private Button b5r2c2;
  	@FXML
  	private Button b5r2c3;
  	@FXML 
  	private Button b5r3c1;
    @FXML
    private Button b5r3c2;
    @FXML 
    private Button b5r3c3;
    
    @FXML
  	private Button b6r1r1;
  	@FXML
  	private Button b6r1c2;
  	@FXML
  	private Button b6r1c3;
  	@FXML
  	private Button b6r2c1;
  	@FXML
  	private Button b6r2c2;
  	@FXML
  	private Button b6r2c3;
  	@FXML 
  	private Button b6r3c1;
    @FXML
    private Button b6r3c2;
    @FXML 
    private Button b6r3c3;
    
    @FXML
  	private Button b7r1r1;
  	@FXML
  	private Button b7r1c2;
  	@FXML
  	private Button b7r1c3;
  	@FXML
  	private Button b7r2c1;
  	@FXML
  	private Button b7r2c2;
  	@FXML
  	private Button b7r2c3;
  	@FXML 
  	private Button b7r3c1;
    @FXML
    private Button b7r3c2;
    @FXML 
    private Button b7r3c3;
    
    @FXML
  	private Button b8r1r1;
  	@FXML
  	private Button b8r1c2;
  	@FXML
  	private Button b8r1c3;
  	@FXML
  	private Button b8r2c1;
  	@FXML
  	private Button b8r2c2;
  	@FXML
  	private Button b8r2c3;
  	@FXML 
  	private Button b8r3c1;
    @FXML
    private Button b8r3c2;
    @FXML 
    private Button b8r3c3;
	
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
