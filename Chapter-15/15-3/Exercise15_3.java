//Drake Hunt - 9/6/2018

//(Move the ball) Write a program that moves the ball in a pane. You should define a pane class for displaying the ball and provide the methods for moving the ball left, right, up, and down, as shown below. Check the boundary to prevent the ball from moving out of sight completely.

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

public class Exercise15_3 extends Application {
	
	Circle circle = new Circle(25);
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		circle.setCenterX(30);
		circle.setCenterY(125);
		pane.getChildren().add(circle);
		
		HBox pane2 = new HBox();
		pane2.setAlignment(Pos.BASELINE_CENTER);
		
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		
		LeftHandlerClass handler1 = new LeftHandlerClass();
		btLeft.setOnAction(handler1);
		RightHandlerClass handler2 = new RightHandlerClass();
		btRight.setOnAction(handler2);
		UpHandlerClass handler3 = new UpHandlerClass();
		btUp.setOnAction(handler3);
		DownHandlerClass handler4 = new DownHandlerClass();
		btDown.setOnAction(handler4);
		
		pane2.getChildren().add(btLeft);
		pane2.getChildren().add(btRight);
		pane2.getChildren().add(btUp);
		pane2.getChildren().add(btDown);
		
		BorderPane pane3 = new BorderPane();
		pane3.setLeft(pane);
		pane3.setBottom(pane2);
		BorderPane.setAlignment(pane2, Pos.CENTER);
		
		Scene scene = new Scene(pane3, 300, 300);
		primaryStage.setTitle("Handle Event");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	class LeftHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			if (circle.getCenterX() > 35) {
				circle.setCenterX(circle.getCenterX() - 20);
			}
		}
	}

	class RightHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			if (circle.getCenterX() > 5 && circle.getCenterX() < 260) {
				circle.setCenterX(circle.getCenterX() + 20);
			}
		}
	}
	
	class UpHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			if (circle.getCenterY() > 40) {
				circle.setCenterY(circle.getCenterY() - 20);
			}
		}
	}
	
	class DownHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			if (circle.getCenterY() < 260) {
				circle.setCenterY(circle.getCenterY() + 20);
			}
		}
	}
}


