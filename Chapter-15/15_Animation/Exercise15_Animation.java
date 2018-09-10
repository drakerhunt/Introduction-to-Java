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
import javafx.scene.shape.*;
import javafx.collections.ObservableList;
import java.math.*;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.beans.property.*;
import javafx.beans.value.*;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.input.MouseButton;

public class Exercise15_Animation extends Application {
	
	double pWidth = 400, pHeight = 500;
	Polygon p = new Polygon();
	ObservableList<Double> list = p.getPoints();
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		double centerX = pWidth / 2.5, centerY = pHeight / 2.5;
		double radius = Math.min(pWidth, pHeight) * 0.4;
		p.setRotate(126);
		list.clear();
		for(int i = 0; i < 5; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5));
			list.add(centerY + radius * Math.sin(2 * i * Math.PI / 5));
		}
		p.setFill(Color.RED);
		p.setStroke(Color.BLACK);
		pane.getChildren().add(p);
		
		Rectangle r = new Rectangle(0, 0, 75, 50);
		r.setFill(Color.BLUE);
		r.setStroke(Color.BLACK);
		pane.getChildren().add(r);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4500));
		pt.setPath(p);
		pt.setNode(r);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play();
		
		FadeTransition ft = new FadeTransition(Duration.millis(4500), r);
		ft.setFromValue(1.0);
		ft.setToValue(.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		pane.setOnMouseClicked( e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pt.play();
				ft.play();
			}
			else if (e.getButton() == MouseButton.SECONDARY) {
				pt.pause();
				ft.pause();
			}
		});
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Exercise15_Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void setValue() {
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}