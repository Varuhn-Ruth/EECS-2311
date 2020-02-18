package application;
	
import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ChoiceBox;
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
	Circle cir1 =  new Circle (400,300,200, Color.rgb(255, 255, 255, 0.5));
	Circle cir2 = new Circle (590,300,200, Color.rgb(255,255,255,0.5));
	Circle cirs1 =  new Circle (450,300,150, Color.rgb(255, 255, 255, 0.5));
	Circle cirs2 =  new Circle (625,300,150, Color.rgb(255, 255, 255, 0.5));
	Circle cirb1 =  new Circle (400,300,250, Color.rgb(255, 255, 255, 0.5));
	Circle cirb2 =  new Circle (600,300,250, Color.rgb(255, 255, 255, 0.5));
	Scene scn;
	Scene scn3;
	Scene scn2;
	@Override
	public void start(Stage primaryStage) {
		
		// create boarder outline 
		TextField textfield1 = new TextField();
		
		
				Pane root = new Pane();
				Pane root2 = new Pane();
				Pane root3 = new Pane();
				
				//add circles and buttons coordinates x,y,r 

				cir1.setStroke(Color.BLACK);
				
				cir2.setStroke(Color.BLACK);
				
				Blend blend = new Blend();
				blend.setMode(BlendMode.MULTIPLY);
				
				cirb1.setStroke(Color.BLACK);
			
				cirb2.setStroke(Color.BLACK);
				
				ChoiceBox<String> choicebox1 = new ChoiceBox<>();
				choicebox1.setPrefSize(75, 20);
				choicebox1.setValue("Red");
				choicebox1.getItems().add("Red");
				choicebox1.getItems().add("Orange");
				choicebox1.getItems().add("Yellow");
				choicebox1.getItems().add("Blue");
				choicebox1.getItems().add("Indigo");
				choicebox1.getItems().add("Violet");
				choicebox1.getItems().add("White");
				choicebox1.setLayoutX(760);
				choicebox1.setLayoutY(70);
				
				ChoiceBox<String> size1 = new ChoiceBox<>();
				size1.setPrefSize(75, 20);
				size1.setValue("Medium");
				size1.getItems().add("Small");
				size1.getItems().add("Medium");
				size1.getItems().add("Large");
				size1.setLayoutX(10);
				size1.setLayoutY(20);
				
				Button sz1 = new Button("Set Size");
				sz1.setPrefSize(80, 20);
				sz1.setLayoutX(90);
				sz1.setLayoutY(20);
				
				Button lfclr = new Button("Set Topic Two Colour");
				lfclr.setPrefSize(150, 20);
				lfclr.setLayoutX(840);
				lfclr.setLayoutY(70);
				
				ChoiceBox<String> choicebox2 = new ChoiceBox<>();
				choicebox2.setPrefSize(75, 20);
				choicebox2.setValue("Red");
				choicebox2.getItems().add("Red");
				choicebox2.getItems().add("Orange");
				choicebox2.getItems().add("Yellow");
				choicebox2.getItems().add("Blue");
				choicebox2.getItems().add("Indigo");
				choicebox2.getItems().add("Violet");
				choicebox2.getItems().add("White");
				choicebox2.setLayoutX(760);
				choicebox2.setLayoutY(20);
				
				Button rclr = new Button("Set Topic One Colour");
				rclr.setPrefSize(150, 20);
				rclr.setLayoutX(840);
				rclr.setLayoutY(20);
				
				TextField lm1 = new TextField();
				lm1.setPrefSize(150, 40);
				lm1.setLayoutX(300);
				lm1.setLayoutY(120);
				lm1.setBackground(null); //this is it
				lm1.setText("o First point");
				
				TextField lm2 = new TextField();
				lm2.setPrefSize(170, 40);
				lm2.setLayoutX(250);
				lm2.setLayoutY(160);
				lm2.setBackground(null);
				lm2.setText("o Second point");
				
				TextField lm3 = new TextField();
				lm3.setPrefSize(170, 40);
				lm3.setLayoutX(220);
				lm3.setLayoutY(200);
				lm3.setBackground(null); 
				lm3.setText("o Third point");
				
				TextField lm4 = new TextField();
				lm4.setPrefSize(170, 40);
				lm4.setLayoutX(205);
				lm4.setLayoutY(240);
				lm4.setBackground(null); 
				lm4.setText("o Fourth point");
				
				TextField lm5 = new TextField();
				lm5.setPrefSize(170, 40);
				lm5.setLayoutX(205);
				lm5.setLayoutY(280);
				lm5.setBackground(null); 
				lm5.setText("o Fifth point");
				
				TextField lm6 = new TextField();
				lm6.setPrefSize(170, 40);
				lm6.setLayoutX(205);
				lm6.setLayoutY(320);
				lm6.setBackground(null); 
				lm6.setText("o Sixth point");
				
				TextField lm7 = new TextField();
				lm7.setPrefSize(170, 40);
				lm7.setLayoutX(220);
				lm7.setLayoutY(360);
				lm7.setBackground(null); 
				lm7.setText("o Seventh point");
				
				TextField lm8 = new TextField();
				lm8.setPrefSize(170, 40);
				lm8.setLayoutX(250);
				lm8.setLayoutY(400);
				lm8.setBackground(null); 
				lm8.setText("o Eighth point");
				
				TextField lm9 = new TextField();
				lm9.setPrefSize(170, 40);
				lm9.setLayoutX(300);
				lm9.setLayoutY(440);
				lm9.setBackground(null); 
				lm9.setText("o Ninth point");
				
				//middle
				
				TextField mm1 = new TextField();
				mm1.setPrefSize(170, 40);
				mm1.setLayoutX(410);
				mm1.setLayoutY(200);
				mm1.setBackground(null); 
				mm1.setText("• First point");
				
				TextField mm2 = new TextField();
				mm2.setPrefSize(170, 40);
				mm2.setLayoutX(205);
				mm2.setLayoutY(240);
				mm2.setBackground(null); 
				mm2.setText("o Second point");
				
				TextField mm3 = new TextField();
				mm3.setPrefSize(170, 40);
				mm3.setLayoutX(205);
				mm3.setLayoutY(280);
				mm3.setBackground(null); 
				mm3.setText("o Third point");
				
				TextField mm4 = new TextField();
				mm4.setPrefSize(170, 40);
				mm4.setLayoutX(205);
				mm4.setLayoutY(320);
				mm4.setBackground(null); 
				mm4.setText("o Fourth point");
				
				TextField mm5 = new TextField();
				mm5.setPrefSize(170, 40);
				mm5.setLayoutX(220);
				mm5.setLayoutY(360);
				mm5.setBackground(null); 
				mm5.setText("o Fifth point");
				
//				new line
				
				cirs1.setStroke(Color.BLACK);
				
				cirs2.setStroke(Color.BLACK);
				
				Button rs = new Button("Set Topic One Colour");
				rs.setPrefSize(150, 20);
				rs.setLayoutX(840);
				rs.setLayoutY(20);
				
				ChoiceBox<String> choicebox3 = new ChoiceBox<>();
				choicebox3.setPrefSize(75, 20);
				choicebox3.setValue("Red");
				choicebox3.getItems().add("Red");
				choicebox3.getItems().add("Orange");
				choicebox3.getItems().add("Yellow");
				choicebox3.getItems().add("Blue");
				choicebox3.getItems().add("Indigo");
				choicebox3.getItems().add("Violet");
				choicebox3.getItems().add("White");
				choicebox3.setLayoutX(760);
				choicebox3.setLayoutY(20);
				
				Button ls = new Button("Set Topic Two Colour");
				ls.setPrefSize(150, 20);
				ls.setLayoutX(840);
				ls.setLayoutY(70);
				
				ChoiceBox<String> choicebox4 = new ChoiceBox<>();
				choicebox4.setPrefSize(75, 20);
				choicebox4.setValue("Red");
				choicebox4.getItems().add("Red");
				choicebox4.getItems().add("Orange");
				choicebox4.getItems().add("Yellow");
				choicebox4.getItems().add("Blue");
				choicebox4.getItems().add("Indigo");
				choicebox4.getItems().add("Violet");
				choicebox4.getItems().add("White");
				choicebox4.setLayoutX(760);
				choicebox4.setLayoutY(70);
				
				ChoiceBox<String> size2 = new ChoiceBox<>();
				size2.setPrefSize(75, 20);
				size2.setValue("Small");
				size2.getItems().add("Small");
				size2.getItems().add("Medium");
				size2.getItems().add("Large");
				size2.setLayoutX(10);
				size2.setLayoutY(20);
				
				Button sz2 = new Button("Set Size");
				sz2.setPrefSize(80, 20);
				sz2.setLayoutX(90);
				sz2.setLayoutY(20);
				
				Button rb = new Button("Set Topic One Colour");
				rb.setPrefSize(150, 20);
				rb.setLayoutX(840);
				rb.setLayoutY(20);
				
				ChoiceBox<String> choicebox5 = new ChoiceBox<>();
				choicebox5.setPrefSize(75, 20);
				choicebox5.setValue("Red");
				choicebox5.getItems().add("Red");
				choicebox5.getItems().add("Orange");
				choicebox5.getItems().add("Yellow");
				choicebox5.getItems().add("Blue");
				choicebox5.getItems().add("Indigo");
				choicebox5.getItems().add("Violet");
				choicebox5.getItems().add("White");
				choicebox5.setLayoutX(760);
				choicebox5.setLayoutY(20);
				
				Button lb = new Button("Set Topic Two Colour");
				lb.setPrefSize(150, 20);
				lb.setLayoutX(840);
				lb.setLayoutY(70);
				
				ChoiceBox<String> choicebox6 = new ChoiceBox<>();
				choicebox6.setPrefSize(75, 20);
				choicebox6.setValue("Red");
				choicebox6.getItems().add("Red");
				choicebox6.getItems().add("Orange");
				choicebox6.getItems().add("Yellow");
				choicebox6.getItems().add("Blue");
				choicebox6.getItems().add("Indigo");
				choicebox6.getItems().add("Violet");
				choicebox6.getItems().add("White");
				choicebox6.setLayoutX(760);
				choicebox6.setLayoutY(70);
				
				ChoiceBox<String> size3 = new ChoiceBox<>();
				size3.setPrefSize(75, 20);
				size3.setValue("Large");
				size3.getItems().add("Small");
				size3.getItems().add("Medium");
				size3.getItems().add("Large");
				size3.setLayoutX(10);
				size3.setLayoutY(20);
				
				Button sz3 = new Button("Set Size");
				sz3.setPrefSize(80, 20);
				sz3.setLayoutX(90);
				sz3.setLayoutY(20);
				
				//
				
				Button button1 = new Button("Construct Venn-Diagram!");

				Label Label1 = new Label("Topic 1");
				Label1.setLayoutX(340);
				Label1.setLayoutY(80);
				
				Label Label2 = new Label("Topic 2");
				Label2.setLayoutX(600);
				Label2.setLayoutY(80);
				
				Label Label3 = new Label("Similarities");
				Label3.setLayoutX(470);
				Label3.setLayoutY(80);
				
				AnchorPane backgroundPane;
				
				//add color to objects 
		
				button1.setLayoutX(600);
				button1.setLayoutY(200);
				button1.setTextFill(Color.GREEN);
				button1.setPrefSize(1000, 20);
				
				//Object event 
				
				
				//Add objects to the border layout 
				root.getChildren().add(cir1);
				root.getChildren().add(cir2);

			    root.getChildren().add(choicebox1);
			    root.getChildren().add(lfclr);
			    root.getChildren().add(choicebox2);
			    root.getChildren().add(rclr);
			    root.getChildren().add(sz1);
			    root.getChildren().add(size1);
			    root.getChildren().addAll(lm1, lm2, lm3, lm4, lm5, lm6, lm7, lm8, lm9);
			    root.getChildren().addAll(mm1, mm2, mm3, mm4, mm5);
			    
			    root.getChildren().add(Label1);
			    root.getChildren().add(Label2);
			    root.getChildren().add(Label3);
			    
			    root.setEffect(blend);
				
				scn = new Scene(root,1000,600);
				scn.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("venn Diagram");
				scn.setFill(Color.WHEAT);
				primaryStage.setScene(scn);
				primaryStage.show();
				
				scn2 = new Scene(root2,1000,600);
				scn2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("venn Diagram");
				scn2.setFill(Color.WHEAT);
				primaryStage.setScene(scn2);
				primaryStage.show();
				
				scn3 = new Scene(root3,1000,600);
				scn3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("venn Diagram");
				scn3.setFill(Color.WHEAT);
				primaryStage.setScene(scn3);
				primaryStage.show();
				
				root2.getChildren().add(cirb1);
				root2.getChildren().add(cirb2);
				root2.getChildren().add(rb);
				root2.getChildren().add(lb);
				root2.getChildren().add(choicebox5);
				root2.getChildren().add(choicebox6);
				root2.getChildren().add(size3);
				root2.getChildren().add(sz3);
				
				root3.getChildren().add(cirs1);
				root3.getChildren().add(cirs2);
				root3.getChildren().add(rs);
				root3.getChildren().add(ls);
				root3.getChildren().add(choicebox3);
				root3.getChildren().add(choicebox4);
				root3.getChildren().add(size2);
				root3.getChildren().add(sz2);

					window = primaryStage;
					VBox layout1 = new VBox(15);
					
					
					Label label1 = new Label("Get ready to construct your Venn-Diagram");
					Label t1 = new Label("First topic:");
					Label t2 = new Label("Second topic:");

					TextField textfield2 = new TextField();
					
					button1.setOnAction(event -> Label1.setText(textfield1.getText()));
				    button1.setOnAction(event  -> window.setScene(scn));

					lfclr.setOnAction(e -> getChoice(choicebox1));
					rclr.setOnAction(e -> getChoice2(choicebox2));
					
					rs.setOnAction(e -> getChoice3(choicebox3));
					ls.setOnAction(e -> getChoice4(choicebox4));
					sz1.setOnAction(e -> changeSize(size1));					
					sz2.setOnAction(e -> changeSizeS(size2));
					
					rb.setOnAction(e -> getChoice5(choicebox5));
					lb.setOnAction(e -> getChoice6(choicebox6));
					sz3.setOnAction(e -> changeSizeB(size3));
	
					layout1.getChildren().addAll(label1, t1, textfield1, t2, textfield2, button1);
					scn1 = new Scene(layout1, 400, 400);
				
					window.setScene(scn1);
					window.show();
				}
				

			
				
				

	private void getChoice2(ChoiceBox<String> choicebox1) {
		String color = choicebox1.getValue();
		if(color == "Red") {
			cir1.setFill(Color.rgb(255,0,0, 0.5));
		}
		if(color == "Orange") {
			cir1.setFill(Color.rgb(255,165,0, 0.5));
		}
		if(color == "Yellow") {
			cir1.setFill(Color.rgb(255,255,0, 0.5));
		}
		if(color == "Green") {
			cir1.setFill(Color.rgb(0,255,0, 0.5));
		}
		if(color == "Blue") {
			cir1.setFill(Color.rgb(0,0,255, 0.5));
		}
		if(color == "Indigo") {
			cir1.setFill(Color.rgb(75,0,130, 0.5));
		}
		if(color == "Violet") {
			cir1.setFill(Color.rgb(128,0,128, 0.5));
		}
		if(color == "White") {
			cir1.setFill(Color.rgb(255,255,255, 0.5));
		}
	}		
	
	private void getChoice(ChoiceBox<String> choicebox2) {
		String color = choicebox2.getValue();
		if(color == "Red") {
			cir2.setFill(Color.rgb(255,0,0, 0.5));
		}
		if(color == "Orange") {
			cir2.setFill(Color.rgb(255,165,0, 0.5));
		}
		if(color == "Yellow") {
			cir2.setFill(Color.rgb(255,255,0, 0.5));
		}
		if(color == "Green") {
			cir2.setFill(Color.rgb(0,255,0, 0.5));
		}
		if(color == "Blue") {
			cir2.setFill(Color.rgb(0,0,255, 0.5));
		}
		if(color == "Indigo") {
			cir2.setFill(Color.rgb(75,0,130, 0.5));
		}
		if(color == "Violet") {
			cir2.setFill(Color.rgb(128,0,128, 0.5));
		}
		if(color == "White") {
			cir2.setFill(Color.rgb(255,255,255, 0.5));
		}
	}			
	
	private void getChoice3(ChoiceBox<String> choicebox3) {
		String color = choicebox3.getValue();
		if(color == "Red") {
			cirs1.setFill(Color.rgb(255,0,0, 0.5));
		}
		if(color == "Orange") {
			cirs1.setFill(Color.rgb(255,165,0, 0.5));
		}
		if(color == "Yellow") {
			cirs1.setFill(Color.rgb(255,255,0, 0.5));
		}
		if(color == "Green") {
			cirs1.setFill(Color.rgb(0,255,0, 0.5));
		}
		if(color == "Blue") {
			cirs1.setFill(Color.rgb(0,0,255, 0.5));
		}
		if(color == "Indigo") {
			cirs1.setFill(Color.rgb(75,0,130, 0.5));
		}
		if(color == "Violet") {
			cirs1.setFill(Color.rgb(128,0,128, 0.5));
		}
		if(color == "White") {
			cirs1.setFill(Color.rgb(255,255,255, 0.5));
		}
	}	
	
	private void getChoice4(ChoiceBox<String> choicebox4) {
		String color = choicebox4.getValue();
		if(color == "Red") {
			cirs2.setFill(Color.rgb(255,0,0, 0.5));
		}
		if(color == "Orange") {
			cirs2.setFill(Color.rgb(255,165,0, 0.5));
		}
		if(color == "Yellow") {
			cirs2.setFill(Color.rgb(255,255,0, 0.5));
		}
		if(color == "Green") {
			cirs2.setFill(Color.rgb(0,255,0, 0.5));
		}
		if(color == "Blue") {
			cirs2.setFill(Color.rgb(0,0,255, 0.5));
		}
		if(color == "Indigo") {
			cirs2.setFill(Color.rgb(75,0,130, 0.5));
		}
		if(color == "Violet") {
			cirs2.setFill(Color.rgb(128,0,128, 0.5));
		}
		if(color == "White") {
			cirs2.setFill(Color.rgb(255,255,255, 0.5));
		}
	}			
	
	private void changeSize(ChoiceBox<String> size1) {
		String size = size1.getValue();
		
		if(size == "Small") {
			window.setScene(scn3);
		}
		
		if(size == "Large") {
			window.setScene(scn2);
		}
	}
	
	private void changeSizeS(ChoiceBox<String> size2) {
		String size = size2.getValue();
		
		if(size == "Medium") {
			window.setScene(scn);
		}
		
		if(size == "Large") {
			window.setScene(scn2);
		}
	}
	
	private void getChoice5(ChoiceBox<String> choicebox5) {
		String color = choicebox5.getValue();
		if(color == "Red") {
			cirb1.setFill(Color.rgb(255,0,0, 0.5));
		}
		if(color == "Orange") {
			cirb1.setFill(Color.rgb(255,165,0, 0.5));
		}
		if(color == "Yellow") {
			cirb1.setFill(Color.rgb(255,255,0, 0.5));
		}
		if(color == "Green") {
			cirb1.setFill(Color.rgb(0,255,0, 0.5));
		}
		if(color == "Blue") {
			cirb1.setFill(Color.rgb(0,0,255, 0.5));
		}
		if(color == "Indigo") {
			cirb1.setFill(Color.rgb(75,0,130, 0.5));
		}
		if(color == "Violet") {
			cirb1.setFill(Color.rgb(128,0,128, 0.5));
		}
		if(color == "White") {
			cirb1.setFill(Color.rgb(255,255,255, 0.5));
		}
	}		
	
	private void getChoice6(ChoiceBox<String> choicebox6) {
		String color = choicebox6.getValue();
		if(color == "Red") {
			cirb2.setFill(Color.rgb(255,0,0, 0.5));
		}
		if(color == "Orange") {
			cirb2.setFill(Color.rgb(255,165,0, 0.5));
		}
		if(color == "Yellow") {
			cirb2.setFill(Color.rgb(255,255,0, 0.5));
		}
		if(color == "Green") {
			cirb2.setFill(Color.rgb(0,255,0, 0.5));
		}
		if(color == "Blue") {
			cirb2.setFill(Color.rgb(0,0,255, 0.5));
		}
		if(color == "Indigo") {
			cirb2.setFill(Color.rgb(75,0,130, 0.5));
		}
		if(color == "Violet") {
			cirb2.setFill(Color.rgb(128,0,128, 0.5));
		}
		if(color == "White") {
			cirb2.setFill(Color.rgb(255,255,255, 0.5));
		}
	}		
	
	private void changeSizeB(ChoiceBox<String> size3) {
		String size = size3.getValue();
		
		if(size == "Medium") {
			window.setScene(scn);
		}
		
		if(size == "Small") {
			window.setScene(scn3);
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
public class Main {

}
