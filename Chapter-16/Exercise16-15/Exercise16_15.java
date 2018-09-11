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

public class Exercise16_15 extends Application {
	
	private ComboBox<String> cbo = new ComboBox<>();
	private double pWidth = 500, pHeight = 350;
	
	@Override
	public void start(Stage primaryStage) {
		VBox vB = new VBox();
		vB.setPadding(new Insets(10, 10, 10, 10));
		HBox hB = new HBox();
		hB.setPadding(new Insets(0, 100, 100, 100));
		
		cbo.getItems().addAll("TOP", "RIGHT", "LEFT", "BOTTOM");
		cbo.setPrefWidth(150);
		cbo.setValue("TOP");
		String pos = cbo.getValue().toString();
		pos.equals(cbo.getValue().toString());
		
		Text text = new Text("Position"); 
		text.setFill(Color.BLACK);
		
		Text text2 = new Text ("Graphic Text Gap");
		
		BorderPane paneForTextField = new BorderPane();
		paneForTextField.setStyle("-fx-border-color: black");
		paneForTextField.setLeft(new Label("Graphic Text Gap"));
		TextField tf = new TextField("0");
		
		BorderPane pane = new BorderPane();
		ImageView image = new ImageView("DrPepper.jpg");
		Label label = new Label("Dr. Pepper", image);
		image.setFitHeight(50);
		image.setFitWidth(50);
		pane.setCenter(label);
		
		hB.getChildren().addAll(text, cbo, text2, tf);
		vB.getChildren().addAll(hB, pane);
		
		Scene scene = new Scene(vB, pWidth, pHeight);
		primaryStage.setTitle("Exercise16_15");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		cbo.valueProperty().addListener(new ChangeListener<String>() {
			@Override public void changed(ObservableValue ov, String t, String i) {
				System.out.println(i);
				if (i == "TOP") {
					label.setContentDisplay(ContentDisplay.TOP);
				}
				else if (i == "RIGHT") {
					label.setContentDisplay(ContentDisplay.RIGHT);
				}
				else if (i == "LEFT") {
					label.setContentDisplay(ContentDisplay.LEFT);
				}
				else if (i == "BOTTOM") {
					label.setContentDisplay(ContentDisplay.BOTTOM);
				}
			}
});
		tf.setOnAction(e -> {
			label.setGraphicTextGap(Double.parseDouble(tf.getText()));
		});
		
		System.out.println(pos);
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}