package venn;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Venn extends JPanel {
	private JTextField txtLeftSide;
	private JTextField txtSimilarities;
	private JTextField txtRightSide;

	public void paint(Graphics g) {
		
		setSize(800, 500);
		
		g.setColor(Color.green);
		g.drawOval(10, 50, 400, 300);
		
		g.setColor(Color.orange);
		g.drawOval(200, 50, 400, 300);
	}	
	
	/**
	 * Create the panel.
	 */
	
	public static void main(String[] args) {
		JFrame MainFrame = new JFrame();
		
		MainFrame.setSize(750, 500);
		
		Venn CirclePanel1 = new Venn();
		
		MainFrame.getContentPane().add(CirclePanel1);
		
		MainFrame.setVisible(true);
		System.out.println("trying something");
	}
	
	public Venn() {
		setLayout(null);
		
		txtLeftSide = new JTextField();
		txtLeftSide.setText("Left Side");
		txtLeftSide.setBounds(135, 11, 86, 20);
		add(txtLeftSide);
		txtLeftSide.setColumns(10);
		
		txtSimilarities = new JTextField();
		txtSimilarities.setText("Similarities");
		txtSimilarities.setBounds(281, 11, 86, 20);
		add(txtSimilarities);
		txtSimilarities.setColumns(10);
		
		txtRightSide = new JTextField();
		txtRightSide.setText("Right Side");
		txtRightSide.setBounds(440, 11, 86, 20);
		add(txtRightSide);
		txtRightSide.setColumns(10);

	}
}
