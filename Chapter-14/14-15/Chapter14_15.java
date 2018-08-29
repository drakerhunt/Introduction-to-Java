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
import javafx.scene.text.*;
import javafx.scene.control.Label;

public class Chapter14_15 extends Application {
	@Override
	public void start(Stage primaryStage) {
	
	StackPane pane = new StackPane();
	//Pane pane2 = new Pane();
	Scene scene = new Scene(pane, 350, 350);
	
	Polygon oct = new Polygon();
	pane.getChildren().add(oct);
	oct.setFill(Color.RED);
	oct.setStroke(Color.WHITE);
	ObservableList<Double> list = oct.getPoints();
	final double WIDTH = 400, HEIGHT = 800;
	double centerX = WIDTH / 3, centerY = HEIGHT / 3;
	double radius = Math.min(WIDTH, HEIGHT) * 0.4;
	oct.setRotate(22.5);
	
	for(int i = 0; i < 8; i++) {
		list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
		list.add(centerY + radius * Math.sin(2 * i * Math.PI / 8));
	}
	
	Label label = new Label("STOP");
	label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 100));
	label.setTextFill(Color.WHITE);
	pane.getChildren().add(label);
	
	primaryStage.setTitle("14_15");
	primaryStage.setScene(scene);
	primaryStage.show();
}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}