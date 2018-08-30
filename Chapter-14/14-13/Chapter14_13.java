import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Chapter14_13 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Arc arc1 = new Arc(200, 200, 200, 200, 36, 36);
		Arc arc2 = new Arc(200, 200, 200, 200, 72, 72);
		Arc arc3 = new Arc(200, 200, 200, 200, 144, 144);
		Arc arc4 = new Arc(200, 200, 200, 200, 144 + 36 + 108, 108);
		
		arc1.setFill(Color.BLUE);
		arc2.setFill(Color.RED);
		arc3.setFill(Color.ORANGE);
		arc4.setFill(Color.GREEN);
		
		arc1.setType(ArcType.ROUND);
		arc2.setType(ArcType.ROUND);
		arc3.setType(ArcType.ROUND);
		arc4.setType(ArcType.ROUND);
		
		pane.getChildren().add(arc1);
		pane.getChildren().add(arc2);
		pane.getChildren().add(arc3);
		pane.getChildren().add(arc4);
		
		pane.getChildren().add(new Text(250, 100, "Quizes 10%"));
		pane.getChildren().add(new Text(125, 100, "Project 40%"));
		pane.getChildren().add(new Text(100, 250, "Final 40%"));
		pane.getChildren().add(new Text(275, 225, "Midterm 30%"));
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("14-13");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}