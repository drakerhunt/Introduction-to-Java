import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import java.util.*;

public class Exercise14_27 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Random ran = new Random();
		int randomHour = ran.nextInt(11);
		int randomMin = ran.nextInt(2);
		System.out.println(randomHour);
		System.out.println(randomMin);
		if (randomMin == 1)
			randomMin = 30;
		ClockPane clock = new ClockPane(randomHour, randomMin, 0);
		clock.setSecondHandVisable(false);
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("14-27");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}