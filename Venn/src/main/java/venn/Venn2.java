package venn;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

public class Venn2 extends JPanel implements ActionListener{
	private JTextField txtLeftSide;
	private JTextField txtSimilarities;
	private JTextField txtRightSide;

	public void paint(Graphics g) {
		
		setSize(800, 500);
		
		g.setColor(Color.red);
		g.drawOval(50, 50, 400, 300);
		
//		g.setColor(Color.white);
//		g.fillOval(10, 50, 400, 300);
		
		g.setColor(Color.orange);
		g.drawOval(250, 50, 400, 300);
		
//		g.setColor(Color.yellow);
//		g.fillOval(200, 50, 400, 300);
	}	
	
	/**
	 * Create the panel.
	 */
	
	public static void main(String[] args) {
		JFrame MainFrame = new JFrame();
		
		MainFrame.setSize(750, 500);		
		
		Venn2 CirclePanel1 = new Venn2();
		
		MainFrame.getContentPane().add(CirclePanel1);
		
		MainFrame.setVisible(true);
	}
	
	public Venn2() {
		setLayout(null);
		// 878 x 333
		txtRightSide = new JTextField();
		txtRightSide.setText("Right Side");
		txtRightSide.setBounds(440, 11, 86, 20);
		add(txtRightSide);
		txtRightSide.setColumns(10);
		
		txtSimilarities = new JTextField();
		txtSimilarities.setText("Similarities");
		txtSimilarities.setBounds(309, 11, 86, 20);
		add(txtSimilarities);
		txtSimilarities.setColumns(10);
		
		txtLeftSide = new JTextField();
		txtLeftSide.setText("Left Side");
		txtLeftSide.setBounds(192, 11, 86, 20);
		add(txtLeftSide);
		txtLeftSide.setColumns(10);
		
		
		JButton btnHide = new JButton("Hide");
		btnHide.setBounds(10, 59, 89, 23);
		add(btnHide);
		btnHide.addActionListener(this);
		
		JButton btnShow = new JButton("Show");
		btnShow.setBounds(10, 25, 89, 23);
		add(btnShow);
		btnShow.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/* (e.getSource() == btnShow) */ {
			
		}
		
	}
}

