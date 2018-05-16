	package flappy;
	
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
			root.setAlignment(Pos.BASELINE_CENTER);
			root.setHgap(10);
			root.setVgap(10);
			root.setPadding(new Insets(25, 25, 25, 25));
			
			Text title = new Text("FlappyBird!");
			title.setFont(Font.font("Arial", 20));
			root.add(title, 0, 0, 1, 1);
			
			Button play = new Button("     Play     ");
			HBox hbButton1 = new HBox(10);
			hbButton1.setAlignment(Pos.BASELINE_CENTER);
			hbButton1.getChildren().add(play);
			root.add(hbButton1, 0, 5);
			
			Button highscore = new Button("Highscore");
			HBox hbButton2 = new HBox(10);
			hbButton2.setAlignment(Pos.BASELINE_CENTER);
			hbButton2.getChildren().add(highscore);
			root.add(hbButton2, 0, 10);
			
			Button options = new Button(" Optionen ");
			HBox hbButton3 = new HBox(10);
			hbButton3.setAlignment(Pos.BASELINE_CENTER);
			hbButton3.getChildren().add(options);
			root.add(hbButton3, 0, 15);
			
			Scene scene = new Scene(root, 500, 300);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Flappy");
		
			primaryStage.show();
		}
		
		.setOnMouseClicked(event ->{
			
		});
		
		Button highscore = new Button("Highscore");
		HBox hbButton2 = new HBox(10);
		hbButton2.setAlignment(Pos.BASELINE_CENTER);
		hbButton2.getChildren().add(highscore);
		root.add(hbButton2, 0, 10);
		
		highscore.setOnMouseClicked(event ->{
			
		});
		
		Button options = new Button(" Optionen ");
		HBox hbButton3 = new HBox(10);
		hbButton3.setAlignment(Pos.BASELINE_CENTER);
		hbButton3.getChildren().add(options);
		root.add(hbButton3, 0, 15);
		
		options.setOnMouseClicked(event ->{
			
		});
		
		Scene scene = new Scene(root, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Flappy");
	
		primaryStage.show();

	}
}
