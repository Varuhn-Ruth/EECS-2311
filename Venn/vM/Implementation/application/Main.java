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
//	Scene scn3;
//	Scene scn2;

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
	
	ColorPicker choose1 = new ColorPicker(); //circle left color
	ColorPicker choose2 = new ColorPicker(); //circle right color
	ColorPicker choose3 = new ColorPicker(); //font colors
	
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
			    slider3.setMax(20);
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
				changefont.setPrefSize(120, 20);
				changefont.setLayoutX(120);
				changefont.setLayoutY(530);
				
				Button changefont2 = new Button("Set Title font");
				changefont2.setPrefSize(120, 20);
				changefont2.setLayoutX(120);
				changefont2.setLayoutY(560);
				
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
//				
//				capture2.setLayoutX(840);
//				capture2.setLayoutY(530);
//				capture2.setTextFill(Color.RED);
//				capture2.setPrefSize(150, 20);
//				
//				capture3.setLayoutX(840);
//				capture3.setLayoutY(530);
//				capture3.setTextFill(Color.RED);
//				capture3.setPrefSize(150, 20);
				
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
				    	
				    	});
				    
				    button2.setOnAction(e -> window.setScene(scn1));
				    
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

					cc1.setOnAction(e -> getChoicecc1(choose1));
					cc2.setOnAction(e -> getChoicecc2(choose2));
					cc3.setOnAction(e -> getChoicecc3(choose3));
					changefont.setOnAction(e -> getFont(choicebox3));
					changefont2.setOnAction(e -> getFont1(choicebox3));
				
					sz1.setOnAction(e -> changeSize(slider));			
					Tfont.setOnAction(e -> changeSize2(slider2));
					Tfont1.setOnAction(e -> changeSize3(slider3));
										
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
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}