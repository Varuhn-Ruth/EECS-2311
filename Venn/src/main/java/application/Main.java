package application;
	
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;


public class Main extends Application {
	
	Stage window;
	Scene scn1;
	Circle cir1 =  new Circle (500,420,200, Color.rgb(255, 255, 255, 0.2));
	Circle cir2 = new Circle (690,420,200, Color.rgb(255,255,255,0.2));
	Scene scn;

	Label Label1 = new Label("Topic 1");
	Label Label2 = new Label("Topic 2");
	Label Label4 = new Label("SET TITLE");
	Label Label5 = new Label();
	Label Label3 = new Label("Similarities");
	
	Font font = new Font("Arial", 16);
	Font font2 = new Font("Arial", 30);
	Font font3 = new Font("Verdana", 16);
	Font font5 = new Font("Calibri", 16);
	Font font6 = new Font("Times New Roman", 16);
	Font font7 = new Font("Verdana", 30);
	Font font8 = new Font("Calibri", 30);
	Font font9 = new Font("Times New Roman", 30);
	
//	GraphicsDevice gdev;
	
	ImageView display = new ImageView();
	
	ColorPicker choose1 = new ColorPicker(); //circle left color
	ColorPicker choose2 = new ColorPicker(); //circle right color
	ColorPicker choose3 = new ColorPicker(); //font colors
	
	Slider slider = new Slider();
	Slider slider2 = new Slider();
	Slider slider3 = new Slider();
	
	Button sz1 = new Button("Set Size");
	Button Tfont = new Button("Set Title Font Size");
	Button Tfont1 = new Button("Set Topic Font Size");

	ChoiceBox<String> choicebox3 = new ChoiceBox<>();
	Button changefont = new Button("Set Topics font");
	Button changefont2 = new Button("Set Title font");	

	Button cc1 = new Button("Set Topic One Colour");	
	Button cc2 = new Button("Set Topic Two Colour");
	Button cc3 = new Button("Set Font Colours");	

	Button text = new Button("Insert TextBox");
	Button delete = new Button("Delete TextField");
	
	Circle cirt;
	TextField textt = new TextField();
	
	private static Scanner x;
	
	public Color NoColour() {
		cirt.setFill(null);
		Color c = (Color) cirt.getFill();
		return c;
	}
	
	public Color SetColour(Color color) {
		cirt.setFill(color);
		return (Color) cirt.getFill();
	}
	
	public double getSizeDefault() {
		cirt.setRadius(200);
		return cirt.getRadius();
	}
	
	public double ChangeSizeDefault(int radius) {
		cirt.setRadius(radius);
		return cirt.getRadius();
	}
	
	public String TestTextEmpty() {
		return textt.getText();
	}
	
	public String addText(String string) {
		textt.setText(string);
		return textt.getText();
	}	
	
	@Override
	public void start(Stage primaryStage) {
		
		// create boarder outline 
		TextField textfield1 = new TextField();
		textfield1.setPromptText("Enter Title of First Topic");
		TextField textfield2 = new TextField();
		textfield2.setPromptText("Enter Title of Second Topic");
		TextField textfield3 = new TextField();
		textfield3.setPromptText("Enter Title");		
				
		//
				Pane root = new Pane();
				VBox vbox = new VBox(10);
				vbox.getChildren().addAll(slider, slider2, slider3, choicebox3);
				vbox.setStyle("-fx-background-color: white");
								
				VBox vbox2 = new VBox(15);
				vbox2.getChildren().addAll(sz1, Tfont, Tfont1, changefont, changefont2);
				vbox2.setStyle("-fx-background-color: white");
				
				VBox vbox3 = new VBox(15);
				vbox3.getChildren().addAll(Label5);
				
//				VBox vbox4 = new VBox(15);
//				vbox4.getChildren().addAll(choose1,choose2,choose3);
//								
//				VBox vbox5 = new VBox(15);
//				vbox5.getChildren().addAll(cc1, cc2, cc3, text, delete);
				
				HBox hbox = new HBox(10);
				hbox.setPadding(new Insets(20));
				hbox.getChildren().addAll(vbox,vbox2,vbox3);
				root.getChildren().addAll(hbox);
				
				//add circles and buttons coordinates x,y,r 

				cir1.setStroke(Color.BLACK);
				cir1.toFront();
				cir2.setStroke(Color.BLACK);
				cir2.toBack();
				
				Blend blend = new Blend();
				blend.setMode(BlendMode.MULTIPLY);
					
				//initialize new colorpicker utility
				choose1.setPrefSize(100, 30);
				choose1.setLayoutX(990);
				choose1.setLayoutY(20);
				
				choose2.setPrefSize(100, 30);
				choose2.setLayoutX(990);
				choose2.setLayoutY(60);		
				
				choose3.setPrefSize(100, 30);
				choose3.setLayoutX(990);
				choose3.setLayoutY(100);		
			    			    
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
				
				sz1.setPrefSize(80, 20);
				sz1.setLayoutX(180);
				sz1.setLayoutY(5);
				
				Tfont.setPrefSize(120, 20);
				Tfont.setLayoutX(180);
				Tfont.setLayoutY(40);
				
				Tfont1.setPrefSize(120, 20);
				Tfont1.setLayoutX(180);
				Tfont1.setLayoutY(80);

//				new line
				
				choicebox3.setPrefSize(100, 55);
				choicebox3.setValue("Arial");
				choicebox3.getItems().add("Arial");
				choicebox3.getItems().add("Calibri");
				choicebox3.getItems().add("Times New Roman");
				choicebox3.getItems().add("Verdana");
				choicebox3.setLayoutX(10);
				choicebox3.setLayoutY(530);
				
				changefont.setPrefSize(120, 20);
				changefont.setLayoutX(120);
				changefont.setLayoutY(530);
				
				changefont2.setPrefSize(120, 20);
				changefont2.setLayoutX(120);
				changefont2.setLayoutY(560);
				
				Button sz3 = new Button("Set Size");
				sz3.setPrefSize(80, 20);
				sz3.setLayoutX(90);
				sz3.setLayoutY(20);
				
				cc2.setPrefSize(150, 30);
				cc2.setLayoutX(1100);
				cc2.setLayoutY(60);
				
				cc3.setPrefSize(150, 30);
				cc3.setLayoutX(1100);
				cc3.setLayoutY(100);
				
				//
				
				Button button1 = new Button("Construct Venn-Diagram!");			
				Button imp = new Button("Import");
				Button button2 = new Button("Change Titles");				
				Button capture1 = new Button("Save as .jpg");
				
				Label1.setLayoutX(340);
				Label1.setLayoutY(140);
				Label1.setFont(font);
				
				Label2.setLayoutX(750);
				Label2.setLayoutY(140);
				Label2.setFont(font);
				
				Label3.setLayoutX(550);
				Label3.setLayoutY(140);
				Label3.setFont(font);
												
				Label4.setLayoutX(460);
				Label4.setPrefSize(650, 50);
				Label4.setLayoutY(60);
				Label4.setFont(font2);
				Label4.setTextFill(Color.DARKGREEN);
				
				Label5.setLayoutX(350);
				Label5.setPrefSize(650, 50);
				Label5.setLayoutY(20);
				Label5.setFont(font2);
				Label5.setTextFill(Color.DARKGREEN);
				
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
								
				//add color to objects 
		
				button1.setLayoutX(600);
				button1.setLayoutY(200);
				button1.setTextFill(Color.GREEN);
				button1.setPrefSize(1000, 20);
				
				imp.setLayoutX(700);
				imp.setLayoutY(200);
				imp.setTextFill(Color.GREEN);
				imp.setPrefSize(1000, 20);
				
				button2.setLayoutX(1100);
				button2.setLayoutY(590);
				button2.setTextFill(Color.BLACK);
				button2.setPrefSize(150, 20);
				
				capture1.setLayoutX(1100);
				capture1.setLayoutY(530);
				capture1.setTextFill(Color.RED);
				capture1.setPrefSize(150, 20);
				
				//implementing the save function
				
				Button txt = new Button("Save as .txt");
				txt.setLayoutX(1100);
				txt.setLayoutY(560);
				txt.setTextFill(Color.GREEN);
				txt.setPrefSize(150, 20);
				
				String filepath = "Venn_Diagram.txt";
				
				txt.setOnAction(e -> {
					
					try {
						
						FileWriter fw = new FileWriter(filepath, true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter pw = new PrintWriter(bw);
						
						pw.println(Label4.getText());
						pw.println(Label1.getText());
						pw.println(Label2.getText());
						
						pw.println(cir1.getFill().toString());
						pw.println(cir1.getRadius());
						
						pw.println(cir2.getFill().toString());
						pw.println(cir2.getRadius());
						
						
						pw.flush();
						pw.close();
						
					}
					catch (Exception ex){
						ex.printStackTrace();
					}
					
				});
				
				text.setLayoutX(1100);
				text.setLayoutY(140);
				text.setPrefSize(150, 30);
				
				delete.setLayoutX(1100);
				delete.setLayoutY(180);
				delete.setPrefSize(150, 30);
				
				text.setOnAction(e -> {
					TextField insert = new TextField();					
					insert.setPrefSize(170, 50);
					insert.setLayoutX(920);
					insert.setLayoutY(140);	
					insert.setPromptText("o Enter what you want to say");					
					insert.setOnMouseDragged(event -> drag(event));
					insert.setOnMouseReleased(event -> released(event));						
					root.getChildren().add(insert);	
					
					delete.setOnAction(ex -> {
						insert.setVisible(false);
					});
					
				});
				
				imp.setOnAction( e-> {
					
					boolean found = false;
					window.setScene(scn);
					
					try {
						x = new Scanner(new File(filepath));
						x.useDelimiter("[\n]");
						
						while(x.hasNext() && !found) {
							Label4.setText(x.next());
							Label1.setText(x.next());
							Label2.setText(x.next());
							
							cir1.setStyle(x.next());
							cir1.setRadius(Double.parseDouble(x.next()));

							cir2.setStyle(x.next());
							cir2.setRadius(Double.parseDouble(x.next()));
							
						}
					}
					
					catch(Exception ex) {
						ex.printStackTrace();
					}
				});
							
				//Object event 				
				
				//Add objects to the border layout 
			    			
				scn = new Scene(root,1280,620);
				scn.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Venn Diagram");
				scn.setFill(Color.WHEAT);
				primaryStage.setScene(scn);
				primaryStage.show();				

				cc1.setPrefSize(150, 30);
				cc1.setLayoutX(1100);
				cc1.setLayoutY(20);
				
				root.getChildren().add(cir1);
				root.getChildren().add(cir2);
			    root.getChildren().addAll(Label1, Label2, Label3, Label4);
			    root.setEffect(blend);
			    root.getChildren().addAll(button2, choose1, choose2, choose3);
			    root.getChildren().addAll(capture1, display, txt, cc1, cc2, cc3, text, delete);
				
				slider.setPrefSize(150, 30);
				slider.setLayoutX(scn.getWidth()-scn.getWidth()+10);
				slider.setLayoutY(scn.getHeight()-scn.getHeight()+5);
				slider.setMax(250);
				slider.setMin(150);
				slider.setShowTickLabels(true);			
				
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
				    		ImageIO.write(image, "jpg", new File("Venn_Diagram_Screenshot.jpg"));
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
										
					layout1.getChildren().addAll(label1, t1, textfield1, t2, textfield2, t3, textfield3, button1, imp);
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
