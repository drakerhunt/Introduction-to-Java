import javafx.collections.ObservableList;
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
import javafx.scene.control.*;
import javafx.scene.control.Labeled;
import javafx.collections.*;
import javafx.scene.image.ImageView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import java.util.Scanner;
import java.util.Timer;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;

public class Exercise16_21 extends Application { 
	TextField tf = new TextField("0");
	
	Timeline animation = new Timeline(
		new KeyFrame(Duration.millis(1000), e -> {
			int temp = Integer.parseInt(tf.getText()) - 1;
			tf.setText(temp + "");
			if (temp == 0) {
				stopAPlayM();
			}
		}));
		
	Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer mediaPlayer = new MediaPlayer(media);
	
	public void stopAPlayM() {
		animation.stop();
		mediaPlayer.play();
	}
		
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		BorderPane paneForTextField = new BorderPane();
		paneForTextField.setStyle("-fx-border-color: black");
		tf.setEditable(true);
		tf.setFont(Font.font("Ariel", 50));
		tf.setAlignment(Pos.CENTER);
		
		mediaPlayer.setCycleCount(Timeline.INDEFINITE);
		
		animation.setCycleCount(Timeline.INDEFINITE);
		tf.setOnAction(ov -> {
			animation.play();
		});
		
		Scene scene = new Scene(tf, 200, 200);
		primaryStage.setTitle("Exercise16_21");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}