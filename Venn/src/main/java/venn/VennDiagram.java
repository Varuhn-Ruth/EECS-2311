package venn;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Canvas;

public class VennDiagram extends JFrame {

	
	
	private JPanel contentPane;
	private JTextField txtLeftSide;
	private JTextField txtSimilarities;
	private JTextField txtRightSide;

	
	
	
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawOval(480, 480, 200, 200);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		VennDiagram t = new VennDiagram();
		t.paint(t.getGraphics());
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VennDiagram frame = new VennDiagram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VennDiagram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtLeftSide = new JTextField();
		txtLeftSide.setText("Left Side");
		txtLeftSide.setBounds(10, 11, 86, 20);
		contentPane.add(txtLeftSide);
		txtLeftSide.setColumns(10);
		
		txtSimilarities = new JTextField();
		txtSimilarities.setText("Similarities");
		txtSimilarities.setBounds(223, 11, 86, 20);
		contentPane.add(txtSimilarities);
		txtSimilarities.setColumns(10);
		
		txtRightSide = new JTextField();
		txtRightSide.setText("Right Side");
		txtRightSide.setBounds(459, 11, 86, 20);
		contentPane.add(txtRightSide);
		txtRightSide.setColumns(10);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 86, 106, 20);
		contentPane.add(editorPane);
	}
}
