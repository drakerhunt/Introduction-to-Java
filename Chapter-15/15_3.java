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

public class 15_3 extends Application {
	
	CirclePane circlePane = new CirclePane();
	
	GridPane pane2 = new GridPane();
	
	@Override
	public void start(Stage primaryStage) {
		
		
		pane2.setAlignment(Pos.BASELINE_CENTER);
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		LeftHandlerClass handler1 = new LeftHandlerClass();
		btLeft.setOnAction(handler1);
		RightHandlerClass handler2 = new RightHandlerClass();
		btRight.setOnAction(handler2);
		pane2.getChildren().add(btLeft);
		pane2.getChildren().add(btRight);
		
		BorderPane pane3 = new BorderPane();
		pane3.setLeft(circlePane);
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
			circlePane.enlarge();
		}
	}

	class RightHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			circlePane.shrink();
		}
	}
	
	class CirclePane extends StackPane {
		private Circle circle = new Circle(25);
		
		public CirclePane() {
			getChildren().add(circle);
			circle.setStroke(Color.BLACK);
			circle.setFill(Color.WHITE);
		}
		
		public void enlarge() {
			int c = circlePane.getColumnIndex();
			int r = circlePane.getRowIndex();
			pane2.setColumnIndex(circlePane, )
		}
		
		public void shrink() {
			circle.setRadius(circle.getRadius() - 2);
		}
	}
}


