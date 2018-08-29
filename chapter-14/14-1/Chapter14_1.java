import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView;
import javax.swing.text.html.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;

public class Chapter14_1 extends Application {
	@Override 
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5));
		pane.setHgap(5);
		pane.setVgap(5);
		Scene scene = new Scene(pane, 400, 400);
		
		Image image = new Image("DrPepper.jpg");
		Image image2 = new Image("AmericanFlag.png");
		
		ImageView imageView1 = new ImageView(image);
		ImageView imageView2 = new ImageView(image2);
		ImageView imageView3 = new ImageView(image);
		ImageView imageView4 = new ImageView(image2);
		
		imageView1.setFitHeight(100);
		imageView1.setFitWidth(100);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(150);
		imageView3.setFitHeight(100);
		imageView3.setFitWidth(100);
		imageView4.setFitHeight(100);
		imageView4.setFitWidth(150);
		
		pane.add(imageView1, 0, 0);
		pane.add(imageView2, 0, 1);
		pane.add(imageView3, 1, 1);
		pane.add(imageView4, 1, 0);
		
		primaryStage.setTitle("14-1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}