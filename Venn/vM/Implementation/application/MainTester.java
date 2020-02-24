package application;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTester {

	
	private Main colour;
	private Main size;
	
	@BeforeEach
	public void setup() throws Exception {
		colour = new Main();
	}
	
	@Test
	public void testgetChoice() {
		String expectedColor = "Red";
		assertEquals(expectedColor, colour.getChoice1(<choicebox1>, colour));
	}
	
	@Test
	public void testgetChoice2() {
		String expectedColor = "Orange";
		assertEquals(expectedColor, colour.getChoice2(<choicebox2>, colour));
	}
	
	@Test
	public void testgetChoice3() {
		String expectedColor = "Yellow";
		assertEquals(expectedColor, colour.getChoice3(<choicebox3>, colour));
	}
	
	@Test
	public void testgetChoice4() {
		String expectedColor = "Blue";
		assertEquals(expectedColor, colour.getChoice4(<choicebox4>, colour));
	}
	
	@Test
	public void testgetChoice5() {
		String expectedColor = "Indigo";
		assertEquals(expectedColor, colour.getChoice5(<choicebox5>, colour));
	}
	
	@Test
	public void testgetChoice6() {
		String expectedColor = "Violet";
		assertEquals(expectedColor, colour.getChoice6(<choicebox6>, colour));
	}
	
	@Test
	public void changeSize() {
		String expectedColor = "Large";
		assertEquals(expectedColor, size.changeSize(<size1>, size));
	}
	
	@Test
	public void changeSize2() {
		String expectedColor = "Medium";
		assertEquals(expectedColor, size.changeSize2(<size2>, size));
	}
	
	@Test
	public void changeSize3() {
		String expectedColor = "Small";
		assertEquals(expectedColor, size.changeSize3(<size3>, size));
	}
	
	
}
