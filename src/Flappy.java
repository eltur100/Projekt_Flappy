import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Flappy extends Application{	
	
	
	public static void main (String args[]){
		launch(args);
	}
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		view(primaryStage);
	}
	
	public void view(Stage primaryStage){
		
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25, 25, 25, 25));
		
		Text title = new Text("FlappyBird!");
		title.setFont(Font.font("Arial", 20));
		root.add(title, 0, 0, 2, 1);
		
		Scene scene = new Scene(root, 500, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Flappy");
		primaryStage.show();
	}
}
