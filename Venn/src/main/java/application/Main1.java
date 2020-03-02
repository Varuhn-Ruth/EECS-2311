	//package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main1 extends Application {
	Stage window;
	Scene scn1;
	@Override
	public void start(Stage primaryStage) {
		/*try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		
		// create boarder outline 
				Pane root = new Pane();
				
				//add circles and buttons coordinates x,y,r 
				Circle cir1 =  new Circle (450,300,100);
				Circle cir2 = new Circle (550,300,100);
				Button btn1 = new Button ();
				Button btn2 = new Button ();
				Button btn3 = new Button ();
				Button btn4 = new Button ();
				Button button1 = new Button("Construct Venn-Diagram!");
				
				//add color to objects 
				cir1.setFill(Color.TRANSPARENT);
				cir1.setStroke(Color.GRAY);
				cir2.setFill(Color.TRANSPARENT);
				cir2.setStroke(Color.BLUE);
				btn1.setText("message1");
				btn1.setLayoutX(150); // + 190
				btn1.setLayoutY(20);
				btn1.setTextFill(Color.GREEN);
				btn1.setPrefSize(100, 20);
				
				
				btn2.setText("message2");
				btn2.setLayoutX(340);
				btn2.setLayoutY(20);
				btn2.setTextFill(Color.GREEN);
				btn2.setPrefSize(100, 20);
				
				
				btn3.setText("message3");
				btn3.setLayoutX(530);
				btn3.setLayoutY(20);
				btn3.setTextFill(Color.GREEN);
				btn3.setPrefSize(100, 20);
				
				btn4.setText("message4");
				btn4.setLayoutX(720);
				btn4.setLayoutY(20);
				btn4.setTextFill(Color.GREEN);
				btn4.setPrefSize(100, 20);
				
				button1.setLayoutX(600);
				button1.setLayoutY(200);
				button1.setTextFill(Color.GREEN);
				button1.setPrefSize(1000, 20);

				
				
				
				//Object event 
				
				
				//Add objects to the border layout 
				root.getChildren().add(cir1);
				root.getChildren().add(cir2);
				root.getChildren().add(btn1);
				root.getChildren().add(btn2);
				root.getChildren().add(btn3);
			    root.getChildren().add(btn4);
				
				
				Scene scn = new Scene(root,1000,600);
				scn.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("venn Diagram");
				scn.setFill(Color.WHEAT);
				primaryStage.setScene(scn);
				primaryStage.show();
				
				
				// 
				
	
				
					window = primaryStage;
					
					Label label1 = new Label("Get ready to construct your Venn-Diagram");
					
				     button1.setOnAction(event  -> window.setScene(scn));
					
					
					VBox layout1 = new VBox(170);
					
					layout1.getChildren().addAll(label1, button1);
					scn1 = new Scene(layout1, 400, 400);
				
					window.setScene(scn1);
					window.show();
				}
				

			
				
				
				
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
