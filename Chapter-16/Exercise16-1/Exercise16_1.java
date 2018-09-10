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
		
		HBox pane = new HBox();
		Text t = new Text("Programming is fun");
		t.setFont(Font.font("Ariel", 50));
		t.setStrokeWidth(2);
		t.setStroke(Color.BLACK);
		t.setText(t.getText());
		pane.getChildren().add(t);
		pane.setAlignment(Pos.CENTER);
		
		vB.getChildren().addAll(hBRadioButtons, pane, hBButtons);
		hBButtons.setAlignment(Pos.BOTTOM_CENTER);
		hBRadioButtons.setAlignment(Pos.TOP_CENTER);
		t.setTextAlignment(TextAlignment.LEFT);
		
		Scene scene = new Scene(vB, 1000, 500);
		primaryStage.setTitle("Exercise 16-1");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		btRight.setOnAction(e -> {
			if (pane.getAlignment() != Pos.CENTER_RIGHT) {
				if (pane.getAlignment() == Pos.CENTER_LEFT) {
					pane.setAlignment(Pos.CENTER);
				}
				else if (pane.getAlignment() == Pos.CENTER) {
					pane.setAlignment(Pos.CENTER_RIGHT);
				}
			}
		});
		btLeft.setOnAction(e -> {
			if (pane.getAlignment() != Pos.CENTER_LEFT) {
				if (pane.getAlignment() == Pos.CENTER_RIGHT) {
					pane.setAlignment(Pos.CENTER);
				}
				else {
					pane.setAlignment(Pos.CENTER_LEFT);
				}
			}
		});
		
		rbRed.setOnAction(e -> {
		if (rbRed.isSelected())
			t.setFill(Color.RED);
		});
		rbYellow.setOnAction(e -> {
		if (rbYellow.isSelected())
			t.setFill(Color.YELLOW);
		});
		rbBlack.setOnAction(e -> {
		if (rbBlack.isSelected()) 
			t.setFill(Color.BLACK);
		});
		rbOrange.setOnAction(e -> {
		if (rbOrange.isSelected()) 
			t.setFill(Color.ORANGE);
		});
		rbGreen.setOnAction(e -> {
		if (rbGreen.isSelected())
			t.setFill(Color.GREEN);
		});
	}
	
		public static void main(String[] args) {
			Application.launch(args);
	}
}