//Drake Hunt - 9/6/2018

//(Move a circle using keys) Write a program that moves a circle up, down, left, or right using the arrow keys.

import java.util.*;
import javafx.application.Application; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import java.awt.*;
import java.beans.*;
import javax.swing.*;

public class Exercise15_11 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		Circle circle = new Circle(25);
		
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		circle.setCenterX(30);
		circle.setCenterY(125);
		
		pane.getChildren().add(circle);
		circle.setOnKeyPressed(e -> {
			switch (e.getCode()) { 
				case DOWN: circle.setCenterY(circle.getCenterY() + 10); 
				break; 
				case UP: circle.setCenterY(circle.getCenterY() - 10); 
				break; 
				case LEFT: circle.setCenterX(circle.getCenterX() - 10);
				break; 
				case RIGHT: circle.setCenterX(circle.getCenterX() + 10); 
				break;
				default: circle.setCenterX(125);
					circle.setCenterY(125);
				break;
			}
		});
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise15_11");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		circle.requestFocus();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}


