/*Drake Hunt - 9/6/2018
(Auto resize stop sign) Rewrite Programming Exercise 14.15 so that the stop sign’s width and height are automatically resized when the window is resize*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import java.math.*;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.beans.property.*;
import javafx.beans.value.*;

public class Exercise15_23 extends Application {
	
	double pWidth = 400, pHeight = 800;
	Polygon oct = new Polygon();
	ObservableList<Double> list = oct.getPoints();
	
	@Override
	public void start(Stage primaryStage) {
		
		StackPane pane = new StackPane();
		
		setValue();
		
		oct.setFill(Color.RED);
		oct.setStroke(Color.WHITE);
		pane.getChildren().add(oct);
		Label label = new Label("STOP");
		label.setFont(Font.font("Times New Roman", 100));
		label.setTextFill(Color.WHITE);
		pane.getChildren().add(label);
		
		Scene scene = new Scene(pane, 350, 350);
		primaryStage.setTitle("14_15");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		scene.widthProperty().addListener(ov -> {
			pWidth = pane.getWidth();
			setValue();
		});
		scene.heightProperty().addListener(ov -> {
			pHeight = pane.getHeight();
			setValue();
		});
	}
	
	private void setValue() {
		
		double centerX = pWidth / 3, centerY = pHeight / 3;
		double radius = Math.min(pWidth, pHeight) * 0.4;
		oct.setRotate(22.5);
		list.clear();
		
		for(int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
			list.add(centerY + radius * Math.sin(2 * i * Math.PI / 8));
		}
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}