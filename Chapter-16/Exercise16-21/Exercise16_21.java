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
import java.util.Scanner;

public class Exercise16_21 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		BorderPane paneForTextField = new BorderPane();
		paneForTextField.setStyle("-fx-border-color: black");
		TextField tf = new TextField("0");
		tf.setFont(Font.font("Ariel", 50));
		tf.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(tf, 200, 200);
		primaryStage.setTitle("Exercise16_21");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		tf.textProperty().addListener(ov -> {
			while (tf.getValue() != 0) {
			tf.setText(tf.getValue() - 1);
			}
		});
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}