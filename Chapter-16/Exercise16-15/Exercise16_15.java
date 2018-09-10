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
import javafx.collections.*;
import javafx.scene.image.ImageView;

public class Exercise16_15 extends Application {
	
	private ComboBox<String> cbo = new ComboBox<>();
	private double pWidth = 500, pHeight = 350;
	
	@Override
	public void start(Stage primaryStage) {
		VBox vB = new VBox();
		vB.setPadding(new Insets(10, 10, 10, 10));
		HBox hB = new HBox();
		
		cbo.getItems().addAll("TOP", "RIGHT", "LEFT", "BOTTOM", "MIDDLE");
		cbo.setPrefWidth(100);
		cbo.setValue("TOP");
		
		Text text = new Text("Position"); 
		text.setFill(Color.BLACK);
		
		Text text2 = new Text ("Graphic Text Gap");
		
		BorderPane paneForTextField = new BorderPane();
		paneForTextField.setStyle("-fx-border-color: black");
		paneForTextField.setLeft(new Label("Graphic Text Gap"));
		TextField tf = new TextField("Enter Here");
		
		GridPane pane = new GridPane();
		Text text3 = new Text("Dr. Pepper");
		ImageView image = new ImageView("DrPepper.jpg");
		image.setFitHeight(50);
		image.setFitWidth(50);
		pane.getColumnConstraints().add(new ColumnConstraints(133));
		pane.getRowConstraints().add(new RowConstraints(170));
		pane.setConstraints(image, 3, 3);
		pane.setConstraints(text3, 2, 2);
		pane.getChildren().addAll(image, text3);
		
		hB.getChildren().addAll(text, cbo, text2, tf);
		vB.getChildren().addAll(hB, pane);
		
		Scene scene = new Scene(vB, pWidth, pHeight);
		primaryStage.setTitle("Exercise16_15");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		cbo.addListener(ov -> {
			pane.setConstraints(image, 1, 1);
		});
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}