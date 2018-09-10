import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox; 
import javafx.scene.layout.*; 
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import javafx.geometry.Pos;

public class Exercise16_1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		HBox hBRadioButtons = new HBox();
		hBRadioButtons.setStyle("-fx-border-color: black");
		hBRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: black");
		HBox hBButtons = new HBox();
		hBButtons.setStyle("-fx-border-color: black");
		hBButtons.setStyle("-fx-border-width: 2px; -fx-border-color: black");
		VBox vB = new VBox(125);
		
		
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbBlack = new RadioButton("Black");
		RadioButton rbOrange = new RadioButton("Orange");
		RadioButton rbGreen = new RadioButton("Green");
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbBlack.setToggleGroup(group);
		rbOrange.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		hBRadioButtons.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
		
		Button btLeft = new Button("<=");
		Button btRight = new Button("=>");
		hBButtons.getChildren().addAll(btLeft, btRight);
				
		Label label = new Label("Programming is fun");
		label.setFont(Font.font("Ariel", 20));
		
		vB.getChildren().addAll(hBRadioButtons, label, hBButtons);
		hBButtons.setAlignment(Pos.BOTTOM_CENTER);
		hBRadioButtons.setAlignment(Pos.TOP_CENTER);
		
		Scene scene = new Scene(vB, 350, 350);
		primaryStage.setTitle("Exercise 16-1");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		rbRed.setOnAction(e -> {
		if (rbRed.isSelected())
			label.setTextFill(Color.RED);
		});
		rbYellow.setOnAction(e -> {
		if (rbYellow.isSelected())
			label.setTextFill(Color.YELLOW);
		});
		rbBlack.setOnAction(e -> {
		if (rbBlack.isSelected()) 
			label.setTextFill(Color.BLACK);
		});
		rbOrange.setOnAction(e -> {
		if (rbOrange.isSelected()) 
			label.setTextFill(Color.ORANGE);
		});
		rbGreen.setOnAction(e -> {
		if (rbGreen.isSelected())
			label.setTextFill(Color.GREEN);
		});
	}
	
		public static void main(String[] args) {
			Application.launch(args);
	}
}