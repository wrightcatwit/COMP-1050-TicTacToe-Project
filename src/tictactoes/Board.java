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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Board extends Application implements Initializable{
	
	@FXML
	private Text title = new Text("Supreme TicTacToe!!");
	
	@FXML
	private Text turn = new Text("");
	
	@FXML
	private GridPane b1;
	@FXML
	private GridPane b2;
	@FXML
	private GridPane b3;
	
	@FXML
	private GridPane b4;
	@FXML
	private GridPane b5;
	@FXML
	private GridPane b6;
	
	@FXML
	private GridPane b7;
	@FXML
	private GridPane b8;
	@FXML
	private GridPane b9;
	
	
	@FXML
	private Text t1;
	@FXML
	private Text t2;
	@FXML
	private Text t3;
	
	@FXML
	private Text t4;
	@FXML
	private Text t5;
	@FXML
	private Text t6;
	
	@FXML
	private Text t7;
	@FXML
	private Text t8;
	@FXML
	private Text t9;
	
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
		
		if(player == 0) {
			turn.setText("X's Turn");
		}else if(player == 1) {
			turn.setText("O's Turn");
		}
		
		b1Buttons = new ArrayList<>(Arrays.asList(b1r1c1, b1r1c2, b1r1c3, b1r2c1, b1r2c2, b1r2c3, b1r3c1, b1r3c2, b1r3c3));
		b2Buttons = new ArrayList<>(Arrays.asList(b2r1c1, b2r1c2, b2r1c3, b2r2c1, b2r2c2, b2r2c3, b2r3c1, b2r3c2, b2r3c3));
		b3Buttons = new ArrayList<>(Arrays.asList(b3r1c1, b3r1c2, b3r1c3, b3r2c1, b3r2c2, b3r2c3, b3r3c1, b3r3c2, b3r3c3));
		b4Buttons = new ArrayList<>(Arrays.asList(b4r1c1, b4r1c2, b4r1c3, b4r2c1, b4r2c2, b4r2c3, b4r3c1, b4r3c2, b4r3c3));
		b5Buttons = new ArrayList<>(Arrays.asList(b5r1c1, b5r1c2, b5r1c3, b5r2c1, b5r2c2, b5r2c3, b5r3c1, b5r3c2, b5r3c3));
		b6Buttons = new ArrayList<>(Arrays.asList(b6r1c1, b6r1c2, b6r1c3, b6r2c1, b6r2c2, b6r2c3, b6r3c1, b6r3c2, b6r3c3));
		b7Buttons = new ArrayList<>(Arrays.asList(b7r1c1, b7r1c2, b7r1c3, b7r2c1, b7r2c2, b7r2c3, b7r3c1, b7r3c2, b7r3c3));
		b8Buttons = new ArrayList<>(Arrays.asList(b8r1c1, b8r1c2, b8r1c3, b8r2c1, b8r2c2, b8r2c3, b8r3c1, b8r3c2, b8r3c3));
		b9Buttons = new ArrayList<>(Arrays.asList(b9r1c1, b9r1c2, b9r1c3, b9r2c1, b9r2c2, b9r2c3, b9r3c1, b9r3c2, b9r3c3));
		
	//making 9 of these later
		b1Buttons.forEach(b -> {
			pressed(b,b1Buttons,b1,t1);
			b.setFocusTraversable(false);
		});
		
		b2Buttons.forEach(b -> {
			pressed(b,b2Buttons,b2,t2);
			b.setFocusTraversable(false);
		});
		
		b3Buttons.forEach(b -> {
			pressed(b,b3Buttons,b3,t3);
			b.setFocusTraversable(false);
		});
		
		b4Buttons.forEach(b -> {
			pressed(b,b4Buttons,b4,t4);
			b.setFocusTraversable(false);
		});
		
		
		b5Buttons.forEach(b -> {
			pressed(b,b5Buttons,b5,t5);
			b.setFocusTraversable(false);
		});
		
		
		b6Buttons.forEach(b -> {
			pressed(b,b6Buttons,b6,t6);
			b.setFocusTraversable(false);
		});
		
		
		b7Buttons.forEach(b -> {
			pressed(b,b7Buttons,b7,t7);
			b.setFocusTraversable(false);
		});
		
		b8Buttons.forEach(b -> {
			pressed(b,b8Buttons,b8,t8);
			b.setFocusTraversable(false);
		});
		
		b9Buttons.forEach(b -> {
			pressed(b,b9Buttons,b9,t9);
			b.setFocusTraversable(false);
		});
	}

	public void setSymbol(Button b) {
		if(player %2 == 0) {
			turn.setText("X's Turn");
			b.setText("X");
			player = 1;
		}else {
			turn.setText("O's Turn");
			b.setText("O");
			player = 0;
		}
	}
	
	//i want to switch this to take an array of all the button ones
	public void gameOver() {
		for(int i = 0; i < 8; i++) {
			String bigLine = switch(i) {
			case 0 -> t1.getText() + t2.getText() + t3.getText();
			case 1 -> t4.getText() + t5.getText() + t6.getText();
			case 2 -> t7.getText() + t8.getText() + t9.getText();
			
			case 3 -> t1.getText() + t4.getText() + t7.getText();
			case 4 -> t2.getText() + t5.getText() + t8.getText();
			case 5 -> t3.getText() + t6.getText() + t9.getText();
			
			case 6 -> t1.getText() + t5.getText() + t9.getText();
			case 7 -> t3.getText() + t5.getText() + t7.getText();

 			default -> null;
			};
			
			if(bigLine.equals("XXX")) {
				title.setText("X Wins!!");
				b1Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b2Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b3Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b4Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b5Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b6Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b7Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b8Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b9Buttons.forEach(b ->{
					b.setDisable(true);
				});
			}else if(bigLine.equals("OOO")) {
				title.setText("O Wins!!");
				b1Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b2Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b3Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b4Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b5Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b6Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b7Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b8Buttons.forEach(b ->{
					b.setDisable(true);
				});
				b9Buttons.forEach(b ->{
					b.setDisable(true);
				});
			}
		}
	}
	
	public void gameOver(ArrayList<Button> e,GridPane l, Text u) {
		for(int i = 0; i < 8; i++) {
			String line = switch(i) {
			case 0 -> e.get(0).getText() + e.get(1).getText() + e.get(2).getText();
			case 1 -> e.get(3).getText() + e.get(4).getText() + e.get(5).getText();
			case 2 -> e.get(6).getText() + e.get(7).getText() + e.get(8).getText();
			
			case 3 -> e.get(0).getText() + e.get(3).getText() + e.get(6).getText();
			case 4 -> e.get(1).getText() + e.get(4).getText() + e.get(7).getText();
			case 5 -> e.get(2).getText() + e.get(5).getText() + e.get(8).getText();
			
			case 6 -> e.get(0).getText() + e.get(4).getText() + e.get(8).getText();
			case 7 -> e.get(2).getText() + e.get(4).getText() + e.get(6).getText();		
			default -> null;
			};
			
			if(line.equals("XXX")) {
				u.setText("X");
				l.setVisible(false);
			}else if(line.equals("OOO")) {
				u.setText("O");
				l.setVisible(false);
			}
		
			
		}
	}
	
	private void pressed(Button b, ArrayList<Button> e,GridPane l,Text u) {
		b.setOnMouseClicked(m -> {
			setSymbol(b);
			b.setDisable(true);
			gameOver(e,l,u);
			gameOver();
		});
	}

	
	
}
