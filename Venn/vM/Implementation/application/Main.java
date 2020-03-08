package application;
	
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;


public class Main extends Application {
	
	Stage window;
	Scene scn1;
	Circle cir1 =  new Circle (400,340,200, Color.rgb(255, 255, 255, 0.2));
	Circle cir2 = new Circle (590,340,200, Color.rgb(255,255,255,0.2));
	Scene scn;
	Scene scn3;
	Scene scn2;

	Label Label1 = new Label("Topic 1");
	Label Label2 = new Label("Topic 2");
	Label Label4 = new Label("SET TITLE");
	Label Label3 = new Label("Similarities");
	
	Font font = new Font("Arial", 16);
	Font font2 = new Font("Arial", 30);
	Font font3 = new Font("Verdana", 16);
	Font font5 = new Font("Calibri", 16);
	Font font6 = new Font("Times New Roman", 16);
	Font font7 = new Font("Verdana", 30);
	Font font8 = new Font("Calibri", 30);
	Font font9 = new Font("Times New Roman", 30);
	
	
	ImageView display = new ImageView();
	ImageView display2 = new ImageView();
	ImageView display3 = new ImageView();
	
	ColorPicker choose1 = new ColorPicker(); //circle left color
	ColorPicker choose2 = new ColorPicker(); //circle right color
	ColorPicker choose3 = new ColorPicker();
	
	Slider slider = new Slider();
	Slider slider2 = new Slider();
	Slider slider3 = new Slider();
	
	@Override
	public void start(Stage primaryStage) {
		
		// create boarder outline 
		TextField textfield1 = new TextField();
		textfield1.setPromptText("Enter Title of First Topic");
		TextField textfield2 = new TextField();
		textfield2.setPromptText("Enter Title of Second Topic");
		TextField textfield3 = new TextField();
		textfield3.setPromptText("Enter Title");
		
		
		
				Pane root = new Pane();
				Pane root2 = new Pane();
				Pane root3 = new Pane();
				
				//add circles and buttons coordinates x,y,r 

				cir1.setStroke(Color.BLACK);
				cir1.toFront();
				cir2.setStroke(Color.BLACK);
				cir2.toBack();
				
				Blend blend = new Blend();
				blend.setMode(BlendMode.MULTIPLY);
					
				//initialize new colorpicker utility
				choose1.setPrefSize(100, 30);
				choose1.setLayoutX(735);
				choose1.setLayoutY(20);
				
				choose2.setPrefSize(100, 30);
				choose2.setLayoutX(735);
				choose2.setLayoutY(60);		
				
				choose3.setPrefSize(100, 30);
				choose3.setLayoutX(735);
				choose3.setLayoutY(100);		
				 
			    for(int i = 0; i < 50; i++) {
					TextField insert = new TextField();
					insert.setPrefSize(170, 50);
					insert.setLayoutX(820);
					insert.setLayoutY(140);	
//					insert.setText("o ");
					insert.setPromptText("o Enter what you want to say");					
					insert.setOnMouseDragged(event -> drag(event));
					insert.setOnMouseReleased(event -> released(event));
					
					
					root.getChildren().add(i, insert);
					
				}
			    
			    slider.setPrefSize(150, 30);
			    slider.setLayoutX(10);
			    slider.setLayoutY(5);
			    slider.setMax(250);
			    slider.setMin(150);
			    slider.setShowTickLabels(true);
			    
			    slider2.setPrefSize(150, 30);
			    slider2.setLayoutX(10);
			    slider2.setLayoutY(45);
			    slider2.setMax(40);
			    slider2.setMin(15);
			    slider2.setShowTickLabels(true);
			    
			    slider3.setPrefSize(150, 30);
			    slider3.setLayoutX(10);
			    slider3.setLayoutY(85);
			    slider3.setMax(30);
			    slider3.setMin(15);
			    slider3.setShowTickLabels(true);
			    
			    //
				
				
				Button sz1 = new Button("Set Size");
				sz1.setPrefSize(80, 20);
				sz1.setLayoutX(180);
				sz1.setLayoutY(5);
				
				Button Tfont = new Button("Set Title Font Size");
				Tfont.setPrefSize(120, 20);
				Tfont.setLayoutX(180);
				Tfont.setLayoutY(40);
				
				Button Tfont1 = new Button("Set Topic Font Size");
				Tfont1.setPrefSize(120, 20);
				Tfont1.setLayoutX(180);
				Tfont1.setLayoutY(80);

//				new line
				
				TextField ls1 = new TextField();
				ls1.setPrefSize(150, 40);
				ls1.setLayoutX(290);
				ls1.setLayoutY(190);
				ls1.setBackground(null);
				ls1.setText("o First point");
				
				TextField ls2 = new TextField();
				ls2.setPrefSize(150, 40);
				ls2.setLayoutX(265);
				ls2.setLayoutY(230);
				ls2.setBackground(null);
				ls2.setText("o Second point");
				
				TextField ls3 = new TextField();
				ls3.setPrefSize(150, 40);
				ls3.setLayoutX(260);
				ls3.setLayoutY(270);
				ls3.setBackground(null);
				ls3.setText("o Third point");
				
				TextField ls4 = new TextField();
				ls4.setPrefSize(150, 40);
				ls4.setLayoutX(265);
				ls4.setLayoutY(310);
				ls4.setBackground(null);
				ls4.setText("o Fourth point");
				
				TextField ls5 = new TextField();
				ls5.setPrefSize(150, 40);
				ls5.setLayoutX(285);
				ls5.setLayoutY(350);
				ls5.setBackground(null);
				ls5.setText("o Fifth point");
				
				TextField rs1 = new TextField();
				rs1.setPrefSize(150, 40);
				rs1.setLayoutX(530);
				rs1.setLayoutY(190);
				rs1.setBackground(null);
				rs1.setText("o First point");
				
				TextField rs2 = new TextField();
				rs2.setPrefSize(150, 40);
				rs2.setLayoutX(550);
				rs2.setLayoutY(230);
				rs2.setBackground(null);
				rs2.setText("o Second point");
				
				TextField rs3 = new TextField();
				rs3.setPrefSize(150, 40);
				rs3.setLayoutX(555);
				rs3.setLayoutY(270);
				rs3.setBackground(null);
				rs3.setText("o Third point");
				
				TextField rs4 = new TextField();
				rs4.setPrefSize(150, 40);
				rs4.setLayoutX(553);
				rs4.setLayoutY(310);
				rs4.setBackground(null);
				rs4.setText("o Fourth point");
				
				TextField rs5 = new TextField();
				rs5.setPrefSize(150, 40);
				rs5.setLayoutX(540);
				rs5.setLayoutY(350);
				rs5.setBackground(null);
				rs5.setText("o Fifth point");
				
				TextField ms1 = new TextField();
				ms1.setPrefSize(150, 40);
				ms1.setLayoutX(412);
				ms1.setLayoutY(230);
				ms1.setBackground(null);
				ms1.setText("• First similarity");
				
				TextField ms2 = new TextField();
				ms2.setPrefSize(150, 40);
				ms2.setLayoutX(405);
				ms2.setLayoutY(270);
				ms2.setBackground(null);
				ms2.setText("• Second similarity");
				
				TextField ms3 = new TextField();
				ms3.setPrefSize(150, 40);
				ms3.setLayoutX(410);
				ms3.setLayoutY(310);
				ms3.setBackground(null);
				ms3.setText("• Third similarity");
				
				// new line (large grid)
				
				TextField rl1 = new TextField();
				rl1.setPrefSize(220, 40);
				rl1.setLayoutX(215);
				rl1.setLayoutY(120);
				rl1.setBackground(null);
				rl1.setText("o First point");
				
				TextField rl2 = new TextField();
				rl2.setPrefSize(220, 40);
				rl2.setLayoutX(170);
				rl2.setLayoutY(160);
				rl2.setBackground(null);
				rl2.setText("o Second point");
				
				TextField rl3 = new TextField();
				rl3.setPrefSize(220, 40);
				rl3.setLayoutX(145);
				rl3.setLayoutY(200);
				rl3.setBackground(null);
				rl3.setText("o Third point");
				
				TextField rl4 = new TextField();
				rl4.setPrefSize(220, 40);
				rl4.setLayoutX(130);
				rl4.setLayoutY(240);
				rl4.setBackground(null);
				rl4.setText("o Fourth point");
				
				TextField rl5 = new TextField();
				rl5.setPrefSize(220, 40);
				rl5.setLayoutX(120);
				rl5.setLayoutY(280);
				rl5.setBackground(null);
				rl5.setText("o Fifth point");
				
				TextField rl6 = new TextField();
				rl6.setPrefSize(220, 40);
				rl6.setLayoutX(115);
				rl6.setLayoutY(320);
				rl6.setBackground(null);
				rl6.setText("o Sixth point");
				
				TextField rl7 = new TextField();
				rl7.setPrefSize(220, 40);
				rl7.setLayoutX(120);
				rl7.setLayoutY(360);
				rl7.setBackground(null);
				rl7.setText("o Seventh point");
				
				TextField rl8 = new TextField();
				rl8.setPrefSize(220, 40);
				rl8.setLayoutX(130);
				rl8.setLayoutY(400);
				rl8.setBackground(null);
				rl8.setText("o Eighth point");
				
				TextField rl9 = new TextField();
				rl9.setPrefSize(220, 40);
				rl9.setLayoutX(145);
				rl9.setLayoutY(440);
				rl9.setBackground(null);
				rl9.setText("o Ninth point");
				
				TextField rl10 = new TextField();
				rl10.setPrefSize(220, 40);
				rl10.setLayoutX(170);
				rl10.setLayoutY(480);
				rl10.setBackground(null);
				rl10.setText("o Tenth point");
				
				TextField rl11 = new TextField();
				rl11.setPrefSize(220, 40);
				rl11.setLayoutX(215);
				rl11.setLayoutY(520);
				rl11.setBackground(null);
				rl11.setText("o Eleventh point");
				
				TextField ml1 = new TextField();
				ml1.setPrefSize(220, 40);
				ml1.setLayoutX(375);
				ml1.setLayoutY(200);
				ml1.setBackground(null);
				ml1.setText("• First Similarity");
				
				TextField ml2 = new TextField();
				ml2.setPrefSize(220, 40);
				ml2.setLayoutX(360);
				ml2.setLayoutY(240);
				ml2.setBackground(null);
				ml2.setText("• Second Similarity");
				
				TextField ml3 = new TextField();
				ml3.setPrefSize(220, 40);
				ml3.setLayoutX(350);
				ml3.setLayoutY(280);
				ml3.setBackground(null);
				ml3.setText("• Third Similarity");
				
				TextField ml4 = new TextField();
				ml4.setPrefSize(220, 40);
				ml4.setLayoutX(345);
				ml4.setLayoutY(320);
				ml4.setBackground(null);
				ml4.setText("• Fourth Similarity");
				
				TextField ml5 = new TextField();
				ml5.setPrefSize(220, 40);
				ml5.setLayoutX(350);
				ml5.setLayoutY(360);
				ml5.setBackground(null);
				ml5.setText("• Fifth Similarity");
				
				TextField ml6 = new TextField();
				ml6.setPrefSize(220, 40);
				ml6.setLayoutX(360);
				ml6.setLayoutY(400);
				ml6.setBackground(null);
				ml6.setText("• Sixth Similarity");
				
				TextField ml7 = new TextField();
				ml7.setPrefSize(220, 40);
				ml7.setLayoutX(375);
				ml7.setLayoutY(440);
				ml7.setBackground(null);
				ml7.setText("• Seventh Similarity");
				
				TextField ll1 = new TextField();
				ll1.setPrefSize(220, 40);
				ll1.setLayoutX(520);
				ll1.setLayoutY(120);
				ll1.setBackground(null);
				ll1.setText("o First point");
				
				TextField ll2 = new TextField();
				ll2.setPrefSize(220, 40);
				ll2.setLayoutX(550);
				ll2.setLayoutY(160);
				ll2.setBackground(null);
				ll2.setText("o Second point");
				
				TextField ll3 = new TextField();
				ll3.setPrefSize(220, 40);
				ll3.setLayoutX(575);
				ll3.setLayoutY(200);
				ll3.setBackground(null);
				ll3.setText("o Third point");
				
				TextField ll4 = new TextField();
				ll4.setPrefSize(220, 40);
				ll4.setLayoutX(592);
				ll4.setLayoutY(240);
				ll4.setBackground(null);
				ll4.setText("o Fourth point");
				
				TextField ll5 = new TextField();
				ll5.setPrefSize(220, 40);
				ll5.setLayoutX(602);
				ll5.setLayoutY(280);
				ll5.setBackground(null);
				ll5.setText("o Fifth point");
				
				TextField ll6 = new TextField();
				ll6.setPrefSize(220, 40);
				ll6.setLayoutX(605);
				ll6.setLayoutY(320);
				ll6.setBackground(null);
				ll6.setText("o Sixth point");
			
				TextField ll7 = new TextField();
				ll7.setPrefSize(220, 40);
				ll7.setLayoutX(602);
				ll7.setLayoutY(360);
				ll7.setBackground(null);
				ll7.setText("o Seventh point");
				
				TextField ll8 = new TextField();
				ll8.setPrefSize(220, 40);
				ll8.setLayoutX(592);
				ll8.setLayoutY(400);
				ll8.setBackground(null);
				ll8.setText("o Eighth point");
			
				TextField ll9 = new TextField();
				ll9.setPrefSize(220, 40);
				ll9.setLayoutX(575);
				ll9.setLayoutY(440);
				ll9.setBackground(null);
				ll9.setText("o Ninth point");
				
				TextField ll10 = new TextField();
				ll10.setPrefSize(220, 40);
				ll10.setLayoutX(550);
				ll10.setLayoutY(480);
				ll10.setBackground(null);
				ll10.setText("o Tenth point");
				
				TextField ll11 = new TextField();
				ll11.setPrefSize(220, 40);
				ll11.setLayoutX(520);
				ll11.setLayoutY(520);
				ll11.setBackground(null);
				ll11.setText("o Eleventh point");
				
				// draw small size points
				
//				cirs1.setStroke(Color.BLACK);
//				
//				cirs2.setStroke(Color.BLACK);
//				
				Button rs = new Button("Set Topic One Colour");
				rs.setPrefSize(150, 20);
				rs.setLayoutX(840);
				rs.setLayoutY(20);
				
				ChoiceBox<String> choicebox3 = new ChoiceBox<>();
				choicebox3.setPrefSize(100, 55);
				choicebox3.setValue("Arial");
				choicebox3.getItems().add("Arial");
				choicebox3.getItems().add("Calibri");
				choicebox3.getItems().add("Times New Roman");
				choicebox3.getItems().add("Verdana");
				choicebox3.setLayoutX(10);
				choicebox3.setLayoutY(530);
				
				Button changefont = new Button("Set Topics font");
				changefont.setPrefSize(140, 20);
				changefont.setLayoutX(120);
				changefont.setLayoutY(530);
				
				Button changefont2 = new Button("Set Title font");
				changefont2.setPrefSize(140, 20);
				changefont2.setLayoutX(120);
				changefont2.setLayoutY(560);
				
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
				choicebox4.getItems().add("Green");
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
				choicebox5.getItems().add("Green");
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
				choicebox6.getItems().add("Green");
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
				
				Button cc1 = new Button("Set Topic One Colour");
				cc1.setPrefSize(150, 30);
				cc1.setLayoutX(840);
				cc1.setLayoutY(20);
				
				Button cc2 = new Button("Set Topic Two Colour");
				cc2.setPrefSize(150, 30);
				cc2.setLayoutX(840);
				cc2.setLayoutY(60);
				
				Button cc3 = new Button("Set Font Colours");
				cc3.setPrefSize(150, 30);
				cc3.setLayoutX(840);
				cc3.setLayoutY(100);
				
				//
				
				Button button1 = new Button("Construct Venn-Diagram!");				
				Button button2 = new Button("Change Titles");
				Button button3 = new Button("Change Titles");
				Button button4 = new Button("Change Titles");
				
				Button capture1 = new Button("Export");
				Button capture2 = new Button("Save Screen");
				Button capture3 = new Button("Save Screen");
				
				Label1.setLayoutX(340);
				Label1.setLayoutY(65);
				Label1.setFont(font);
				
				Label2.setLayoutX(600);
				Label2.setLayoutY(65);
				Label2.setFont(font);
				
				Label3.setLayoutX(450);
				Label3.setLayoutY(70);
				Label3.setFont(font);
				
				Label Labels1 = new Label("Topic 1");
				Labels1.setLayoutX(320);
				Labels1.setLayoutY(120);
				Labels1.setFont(font);
				
//				Labels2.setLayoutX(580);
//				Labels2.setLayoutY(120);
//				Labels2.setFont(font);
				
				Label Labels3 = new Label("Similarities");
				Labels3.setLayoutX(440);
				Labels3.setLayoutY(130);
				Labels3.setFont(font);
				
				Label Labelb3 = new Label("Similarities");
				Labelb3.setLayoutX(440);
				Labelb3.setLayoutY(80);
				Labelb3.setFont(font);
								
				Label4.setLayoutX(350);
				Label4.setLayoutY(20);
				Label4.setFont(font2);
				Label4.setTextFill(Color.DARKGREEN);
				
				Label Labels = new Label("SET TITLE");
				Labels.setLayoutX(350);
				Labels.setLayoutY(20);
				Labels.setFont(font2);
				Labels.setTextFill(Color.DARKGREEN);
				
				Label Labelb = new Label("SET TITLE");
				Labelb.setLayoutX(350);
				Labelb.setLayoutY(10);
				Labelb.setFont(font2);
				Labelb.setTextFill(Color.DARKGREEN);
				
				AnchorPane backgroundPane;
				
				//add color to objects 
		
				button1.setLayoutX(600);
				button1.setLayoutY(200);
				button1.setTextFill(Color.GREEN);
				button1.setPrefSize(1000, 20);
				
				button2.setLayoutX(840);
				button2.setLayoutY(560);
				button2.setTextFill(Color.GREEN);
				button2.setPrefSize(150, 20);
				
				button3.setLayoutX(840);
				button3.setLayoutY(560);
				button3.setTextFill(Color.GREEN);
				button3.setPrefSize(150, 20);
				
				button4.setLayoutX(840);
				button4.setLayoutY(560);
				button4.setTextFill(Color.GREEN);
				button4.setPrefSize(150, 20);
				
				capture1.setLayoutX(840);
				capture1.setLayoutY(530);
				capture1.setTextFill(Color.RED);
				capture1.setPrefSize(150, 20);
				
				capture2.setLayoutX(840);
				capture2.setLayoutY(530);
				capture2.setTextFill(Color.RED);
				capture2.setPrefSize(150, 20);
				
				capture3.setLayoutX(840);
				capture3.setLayoutY(530);
				capture3.setTextFill(Color.RED);
				capture3.setPrefSize(150, 20);
				
				//Object event 
				
				
				//Add objects to the border layout 
				root.getChildren().add(cir1);
				root.getChildren().add(cir2);

			    root.getChildren().add(sz1);
			    root.getChildren().addAll(Label1, Label2, Label3, Label4, choicebox3, changefont, changefont2);
			    root.setEffect(blend);
			    root.getChildren().addAll(button2, choose1, choose2, choose3, cc1, cc2, cc3, slider, slider2, Tfont, slider3, Tfont1);
			    root.getChildren().addAll(capture1, display);
			    			
				scn = new Scene(root,1000,600);
				scn.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Venn Diagram");
				scn.setFill(Color.WHEAT);
				primaryStage.setScene(scn);
				primaryStage.show();
				
				scn2 = new Scene(root2,1000,600);
				scn2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Venn Diagram");
				scn2.setFill(Color.WHEAT);
				primaryStage.setScene(scn2);
				primaryStage.show();
				
				scn3 = new Scene(root3,1000,600);
				scn3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Venn Diagram");
				scn3.setFill(Color.WHEAT);
				primaryStage.setScene(scn3);
				primaryStage.show();
				
				root2.getChildren().add(rb);
				root2.getChildren().add(lb);
				root2.getChildren().add(choicebox5);
				root2.getChildren().add(choicebox6);
				root2.getChildren().add(size3);
				root2.getChildren().add(sz3);
				root2.getChildren().add(Labelb);
				root2.getChildren().add(button3);
				root2.getChildren().addAll(Labelb3);
				root2.getChildren().addAll(rl1, rl2, rl3, rl4, rl5, rl6, rl7, rl8, rl9, rl10, rl11, ml1, ml2, ml3, ml4, ml5, ml6, ml7);
				root2.getChildren().addAll(ll1, ll2, ll3, ll4, ll5, ll6, ll7, ll8, ll9, ll10, ll11);
				root2.getChildren().addAll(capture2, display2);
				
				root3.getChildren().add(rs);
				root3.getChildren().add(ls);
//				root3.getChildren().add(choicebox3);
				root3.getChildren().add(choicebox4);
				root3.getChildren().add(size2);
				root3.getChildren().add(sz2);
				root3.getChildren().add(Labels);
				root3.getChildren().add(button4);
//				root3.getChildren().addAll(Labels3, Labels1, Labels2);
				root3.getChildren().addAll(ls1, ls2, ls3, ls4, ls5, rs1, rs2, rs3, rs4, rs5, ms1, ms2, ms3);
				root3.getChildren().addAll(capture3, display3);

					window = primaryStage;
					VBox layout1 = new VBox(15);
					
					
					Label label1 = new Label("Get ready to construct your Venn-Diagram");
					Label t1 = new Label("First Topic:");
					Label t2 = new Label("Second Topic:");
					Label t3 = new Label("Set Title:");

				    button1.setOnAction(e -> {
				    	
				    	window.setScene(scn);
				    	String r1 = String.valueOf(textfield1.getText());
				    	Label1.setText(r1);
				    	
				    	String r2 = String.valueOf(textfield2.getText());
				    	Label2.setText(r2);
				    	
				    	String r3 = String.valueOf(textfield3.getText()); // from title
				    	Label4.setText(r3);
				    	
				    	String r4 = String.valueOf(textfield3.getText());
				    	Labels.setText(r4);
				    	
				    	String r5 = String.valueOf(textfield3.getText());
				    	Labelb.setText(r5);
				    	
				    	String s1 = String.valueOf(textfield1.getText());
				    	Labels1.setText(s1);
				    	
				    	String s2 = String.valueOf(textfield2.getText());
//				    	Labels2.setText(s2);
				    	});
				    
				    button2.setOnAction(e -> window.setScene(scn1));
				    button3.setOnAction(e -> window.setScene(scn1));
				    button4.setOnAction(e -> window.setScene(scn1));
				    
				    capture1.setOnAction(event -> {
				    	try {
				    		Robot robot = new Robot();
				    		Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
				    		BufferedImage image = robot.createScreenCapture(rect);
				    		Image myimage = SwingFXUtils.toFXImage(image, null);
				    		ImageIO.write(image, "jpg", new File("output1.jpg"));
				    		display.setImage(myimage);
				    	}
				    	catch (Exception e) {
				    		e.printStackTrace();
				    	}
				    });
				    
				    capture2.setOnAction(event -> {
				    	try {
				    		Robot robot = new Robot();
				    		Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
				    		BufferedImage image = robot.createScreenCapture(rect);
				    		Image myimage = SwingFXUtils.toFXImage(image, null);
				    		ImageIO.write(image, "jpg", new File("output2.jpg"));
				    		display2.setImage(myimage);
				    	}
				    	catch (Exception e) {
				    		e.printStackTrace();
				    	}
				    });
				    
				    capture3.setOnAction(event -> {
				    	try {
				    		Robot robot = new Robot();
				    		Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
				    		BufferedImage image = robot.createScreenCapture(rect);
				    		Image myimage = SwingFXUtils.toFXImage(image, null);
				    		ImageIO.write(image, "jpg", new File("output3.jpg"));
				    		display3.setImage(myimage);
				    	}
				    	catch (Exception e) {
				    		e.printStackTrace();
				    	}
				    });

					cc1.setOnAction(e -> getChoicecc1(choose1));
					cc2.setOnAction(e -> getChoicecc2(choose2));
					cc3.setOnAction(e -> getChoicecc3(choose3));
					changefont.setOnAction(e -> getFont(choicebox3));
					changefont2.setOnAction(e -> getFont1(choicebox3));
				
					sz1.setOnAction(e -> changeSize(slider));			
					Tfont.setOnAction(e -> changeSize2(slider2));
					Tfont1.setOnAction(e -> changeSize3(slider3));
					
					sz2.setOnAction(e -> changeSizeS(size2));
					
					sz3.setOnAction(e -> changeSizeB(size3));
					
					layout1.getChildren().addAll(label1, t1, textfield1, t2, textfield2, t3, textfield3, button1);
					scn1 = new Scene(layout1, 400, 400);
				
					window.setScene(scn1);
					window.show();
				}

	private void released(MouseEvent event) {
		TextField t = (TextField)event.getSource();
		t.setBackground(null);
	}


	private void drag(MouseEvent event) {
		Node n = (Node)event.getSource();
		n.setTranslateX(n.getTranslateX() + event.getX());
		n.setTranslateY(n.getTranslateY() + event.getY());		
		
	}


	private void getChoicecc1(ColorPicker choose1) {
		Color color = choose1.getValue();
		if(color != null) {
			cir1.setFill(color.deriveColor(1, 1, 1, 0.3));
		}
		
	}
	
	private void getChoicecc2(ColorPicker choose2) {
		Color color = choose2.getValue();
		if(color != null) {
			cir2.setFill(color.deriveColor(1, 1, 1, 0.3));
		}
		
	}
	
	private void getChoicecc3(ColorPicker choose3) {
		Color color = choose3.getValue();
		if(color != null) {
			Label4.setTextFill(color);
			Label1.setTextFill(color);
			Label2.setTextFill(color);
			Label3.setTextFill(color);
		}		
	}
	
	private void getFont(ChoiceBox<String> choicebox3) {
		String font = choicebox3.getValue();
		
		if(font == "Arial") {
			Label1.setFont(this.font);
			Label2.setFont(this.font);
		}
		
		if(font == "Times New Roman") {
			Label1.setFont(this.font6);
			Label2.setFont(this.font6);
		}
		
		if(font == "Verdana") {
			Label1.setFont(this.font3);
			Label2.setFont(this.font3);
		}
		
		if(font == "Calibri") {
			Label1.setFont(this.font5);
			Label2.setFont(this.font5);
		}
	}
	
	private void getFont1(ChoiceBox<String> choicebox3) {
		String font = choicebox3.getValue();
		
		if(font == "Arial") {
			Label4.setFont(this.font2);
		}
		
		if(font == "Times New Roman") {
			Label4.setFont(this.font9);
		}
		
		if(font == "Verdana") {
			Label4.setFont(this.font7);
		}
		
		if(font == "Calibri") {
			Label4.setFont(this.font8);
		}
	}
				
	
	private void changeSize(Slider slider) {
		double size = slider.getValue();
		
		if(size != 0) {
			cir1.setRadius(size);
			cir2.setRadius(size);
		}
	}
	
	private void changeSize2(Slider slider) {
		Font font = new Font(slider2.getValue());
		
		if(font != null) {
			Label4.setFont(font);
		}
	}
	
	private void changeSize3(Slider slider) {
		Font font = new Font(slider3.getValue());
		
		if(font != null) {
			Label2.setFont(font);
			Label1.setFont(font);
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