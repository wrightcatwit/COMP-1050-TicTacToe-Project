package tictactoes;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
	private Button b2r1c1;
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
	private Button b3r1c1;
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
  	private Button b4r1c1;
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
  	private Button b5r1c1;
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
  	private Button b6r1c1;
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
  	private Button b7r1c1;
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
  	private Button b8r1c1;
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
    
    @FXML
  	private Button b9r1c1;
  	@FXML
  	private Button b9r1c2;
  	@FXML
  	private Button b9r1c3;
  	@FXML
  	private Button b9r2c1;
  	@FXML
  	private Button b9r2c2;
  	@FXML
  	private Button b9r2c3;
  	@FXML 
  	private Button b9r3c1;
    @FXML
    private Button b9r3c2;
    @FXML 
    private Button b9r3c3;
    
    ArrayList<Button> b1Buttons;
    ArrayList<Button> b2Buttons;
    ArrayList<Button> b3Buttons;
    ArrayList<Button> b4Buttons;
    ArrayList<Button> b5Buttons;
    ArrayList<Button> b6Buttons;
    ArrayList<Button> b7Buttons;
    ArrayList<Button> b8Buttons;
    ArrayList<Button> b9Buttons;
	
	public static void main(String[] args) {launch(args);}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("TicTacToeUI.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("TicTacToes");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
//
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		b1Buttons = new ArrayList<>(Arrays.asList(b1r1c1, b1r2c1, b1r3c1, b1r2c1, b1r2c2, b1r2c3, b1r3c1, b1r3c2, b1r3c3));
		b2Buttons = new ArrayList<>(Arrays.asList(b2r1c1, b2r2c1, b2r3c1, b2r2c1, b2r2c2, b2r2c3, b2r3c1, b2r3c2, b2r3c3));
		b3Buttons = new ArrayList<>(Arrays.asList(b3r1c1, b3r2c1, b3r3c1, b3r2c1, b3r2c2, b3r2c3, b3r3c1, b3r3c2, b3r3c3));
		b4Buttons = new ArrayList<>(Arrays.asList(b4r1c1, b4r2c1, b4r3c1, b4r2c1, b4r2c2, b4r2c3, b4r3c1, b4r3c2, b4r3c3));
		b5Buttons = new ArrayList<>(Arrays.asList(b5r1c1, b5r2c1, b5r3c1, b5r2c1, b5r2c2, b5r2c3, b5r3c1, b5r3c2, b5r3c3));
		
		b6Buttons = new ArrayList<>(Arrays.asList(b6r1c1, b6r2c1, b6r3c1, b6r2c1, b6r2c2, b6r2c3, b6r3c1, b6r3c2, b6r3c3));
		b7Buttons = new ArrayList<>(Arrays.asList(b7r1c1, b7r2c1, b7r3c1, b7r2c1, b7r2c2, b7r2c3, b7r3c1, b7r3c2, b7r3c3));
		b8Buttons = new ArrayList<>(Arrays.asList(b8r1c1, b8r2c1, b8r3c1, b8r2c1, b8r2c2, b8r2c3, b8r3c1, b8r3c2, b8r3c3));
		b9Buttons = new ArrayList<>(Arrays.asList(b9r1c1, b9r2c1, b9r3c1, b9r2c1, b9r2c2, b9r2c3, b9r3c1, b9r3c2, b9r3c3));
	}

	

	
	
}
