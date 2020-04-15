package application;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class MainTester {
	
//	private FXMLController controller;
	private TextField textt;
	private Circle circle;
	
	@BeforeEach
	public void setUp() throws Exception {
		circle = new Circle();
		
	}
	
	@Test
	public void TestColour() {
		Color c = (Color) circle.getFill();
		assertEquals(null, c.NoColor());
	}
	
	@Test
	public void TestColourFill() {
		circle.setFill(Color.BLUE);
		Color c = (Color) circle.getFill();
		asserEquals(Color.BLUE, c.SetColor());
	}
	
	@Test
	public void CircleDefaultSize() {
		assertEquals(200, circle.getSizeDefault());
	}
	
	@Test
	public void ChangeCircleSize() {
		circle.setRadius(250);
		assertEquals(250, circle.ChangeSizeDefault());
	}
	
	@Test
	public void TestText() {
		assertEquals(null, textt.TestTextEmpty());
	}
	
	@Test
	public void TestTextFill() {
		textt.setText("New Text");
		assertEquals("New Text", textt.addText());
	}	
	
}
