import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class newFX {
	
	public class Main extends Application {

	Stage window;
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		Launch(args);		
	}
	
	@Override
	public void start(Stage primaryStage) throws exception {
		window = primaryStage;
		
		Label label1 = new Label("Get ready to construct your Venn-Diagram");
		Button button1 = new Button("Construct Venn-Diagram!");
		button1.setOnAction(e -> window.setScene(scene2));
		
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		StackPane layout2 = new StackPane();
		//layout2.getChildren().add();
		scene2 = new Scene(layout2, 1000, 600);
		
		window.setScene(scene1);
		Window.setTitle("Constructing a simple Venn-Diagram");
		window.show();
	}
	}
}
