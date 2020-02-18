package application;
	
import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorInput;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	
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
		TextField textfield1 = new TextField();
		Blend blend = new Blend();
		blend.setMode(BlendMode.COLOR_BURN);
		
				Pane root = new Pane();
				
				//add circles and buttons coordinates x,y,r 
				Circle cir1 =  new Circle (425,300,200);
				cir1.setFill(Color.TRANSPARENT);
				cir1.setStroke(Color.GRAY);
				
				
				Circle cir2 = new Circle (575,300,200);
				cir2.setFill(Color.TRANSPARENT);
				cir2.setStroke(Color.BLUE);
								
				Button btn_c = new Button ("text1");
				Button btn_b= new Button ("Background");
				Button btn_t= new Button ("Text");
				Button btn4 = new Button ();
				Button btn5 = new Button("Red");
				Button btn6 = new Button("Green");
				Button btn7 = new Button("Pink ");
				Button btn8 = new Button("Blue");
				Button btn9 = new Button("Grey");
				Button btn10 = new Button("Yellow");
				
				
				
				Button button1 = new Button("Construct Venn-Diagram!");
				
				//Label Label1 = new Label(textfield1.getText());
				Label Label1 = new Label("Topic 1");
				Label1.setLayoutX(340);
				Label1.setLayoutY(80);
				
				Label Label2 = new Label("Topic 2");
				Label2.setLayoutX(600);
				Label2.setLayoutY(80);
				
				Label Label3 = new Label("Similarities");
				Label3.setLayoutX(470);
				Label3.setLayoutY(80);
				
				Label Label4 = new Label("Venn Colors");
				Label4.setLayoutX(915);
				Label4.setLayoutY(5);
				
				AnchorPane backgroundPane;
				
				//add color to objects 
				
				
//				Group g = new Group();
//				g.setBlendMode(BlendMode.COLOR_BURN);
//				g.getChildren().add(cir1);
//				g.getChildren().add(cir2);
				
				
				
				btn_c.setLayoutX(150); // + 190
				btn_c.setLayoutY(20);
				btn_c.setTextFill(Color.GREEN);
				btn_c.setPrefSize(100, 20);
				
				
				//btn2.setText("message2");
				btn_b.setLayoutX(340);
				btn_b.setLayoutY(20);
				btn_b.setTextFill(Color.GREEN);
				btn_b.setPrefSize(100, 20);
				
				
				//btn3.setText("message3");
				btn_t.setLayoutX(530);
				btn_t.setLayoutY(20);
				btn_t.setTextFill(Color.GREEN);
				btn_t.setPrefSize(100, 20);
				
				btn4.setText("message4");
				btn4.setLayoutX(720);
				btn4.setLayoutY(20);
				btn4.setTextFill(Color.GREEN);
				btn4.setPrefSize(100, 20);
				
				
				btn5.setLayoutX(910);
				btn5.setLayoutY(20);
				btn5.setTextFill(Color.RED);
				btn5.setPrefSize(80, 20);
				
				btn6.setLayoutX(910);
				btn6.setLayoutY(50);
				btn6.setTextFill(Color.GREEN);
				btn6.setPrefSize(80, 20);
				
				btn7.setLayoutX(910);
				btn7.setLayoutY(80);
				btn7.setTextFill(Color.PINK);
				btn7.setPrefSize(80, 20);
				
				btn8.setLayoutX(910);
				btn8.setLayoutY(110);
				btn8.setTextFill(Color.BLUE);
				btn8.setPrefSize(80, 20);
				
				btn9.setLayoutX(910);
				btn9.setLayoutY(140);
				btn9.setTextFill(Color.GREY);
				btn9.setPrefSize(80, 20);
				
				btn10.setLayoutX(910);
				btn10.setLayoutY(170);
				btn10.setTextFill(Color.YELLOW);
				btn10.setPrefSize(80, 20);
				
				
				
				button1.setLayoutX(600);
				button1.setLayoutY(200);
				button1.setTextFill(Color.GREEN);
				button1.setPrefSize(1000, 20);

				
				
				
				//Object event 
				
				
				//Add objects to the border layout 
				root.getChildren().add(cir1);
				root.getChildren().add(cir2);
//				root.getChildren().add(g);
				//root.getChildren().add(btn_c);
				//root.getChildren().add(btn_b);
				//root.getChildren().add(btn_t);
			   // root.getChildren().add(btn4);
			    root.getChildren().add(btn5);
			    root.getChildren().add(btn6);
			    root.getChildren().add(btn7);
			    root.getChildren().add(btn8);
			    root.getChildren().add(btn9);
			    root.getChildren().add(btn10);
			    
			    root.getChildren().add(Label1);
			    root.getChildren().add(Label2);
			    root.getChildren().add(Label3);
			    root.getChildren().add(Label4);
				
				Scene scn = new Scene(root,1000,600);
				scn.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("venn Diagram");
				scn.setFill(Color.WHEAT);
				primaryStage.setScene(scn);
				primaryStage.show();
				
				
				
				
	
				
					window = primaryStage;
					VBox layout1 = new VBox(15);
					
					
					Label label1 = new Label("Get ready to construct your Venn-Diagram");
					Label t1 = new Label("First topic:");
					Label t2 = new Label("Second topic:");
				//	TextField textfield1 = new TextField();
					TextField textfield2 = new TextField();
					
					button1.setOnAction(event -> Label1.setText(textfield1.getText()));
				    button1.setOnAction(event  -> window.setScene(scn));
					btn5.setOnAction(e -> cir1.setFill(Color.RED));
					btn6.setOnAction(e -> cir2.setFill(Color.LIGHTSEAGREEN) );
					
					btn7.setOnAction(e -> cir1.setFill(Color.PINK));
					btn8.setOnAction(e -> cir2.setFill(Color.BLUE));
					btn9.setOnAction(e -> cir1.setFill(Color.GREY));
					btn10.setOnAction(e -> cir2.setFill(Color.YELLOW));
										
					btn_c.setOnAction(e ->  cir1.setStroke(Color.BLACK));
					btn_t.setOnAction(e ->  cir1.setStroke(Color.BLACK));
					
								
					
					layout1.getChildren().addAll(label1, t1, textfield1, t2, textfield2, button1);
					scn1 = new Scene(layout1, 400, 400);
				
					window.setScene(scn1);
					window.show();
				}
				

			
				
				
				
	
	
	public static void main(String[] args) {
		launch(args);
	}
}