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
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.beans.property.*;
import javafx.beans.value.*;
import javafx.animation.*;
import javafx.util.Duration;

class Exercise15_Animation extends Application {
	
	double pWidth = 300, pHeight = 300;
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Rectangle r = new Rectangle(0, 0, 10, 10);
		r.setFill(Color.ORANGE);
		
		Polygon p = new Polygon();
		double centerX = pWidth / 3, centerY = pHeight / 3;
		double radius = Math.min(pWidth, pHeight) * 0.4;
		p.setRotate(22.5);
		list.clear();
		
		for(int i = 0; i < 5; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5));
			list.add(centerY + radius * Math.sin(2 * i * Math.PI / 5));
		}
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}