import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.*;

public class Exercise14_27 extends Application {
	@Override
	public void start(Stage primaryStage) {
		ClockPane clock = new ClockPane().setCurrentTime();
		
		Pane pane = new Pane();
		pane.setCenter(clock);
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("14-27");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}