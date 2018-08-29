import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView;
import javax.swing.text.html.*;

public class Chapter14_1 extends Application {
	@Override 
	public void start(Stage primaryStage) {
		
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));
		Scene scene = new Scene(pane, 250, 250);
		Image image = new Image("DrPepper.jpg");
		Image image2 = new Image("AmericanFlag.png");
		ImageView imageView1 = new ImageView(image);
		imageView1.setFitHeight(100);
		imageView1.setFitWidth(100);
		pane.getChildren().add(imageView1);
		
		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(150);
		pane.getChildren().add(imageView2);
		
		primaryStage.setTitle("14-1");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		ImageView imageView3 = new ImageView(image);
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}