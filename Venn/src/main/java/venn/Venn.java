import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Panel;

public class Venn extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venn frame = new Venn();
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
	public Venn() {
		setForeground(Color.LIGHT_GRAY);
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 671);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// create 
		TextField textField = new TextField();
		textField.setText("Venn App\r\n");
		textField.setBackground(new Color(250, 250, 210));
		textField.setBounds(404, 33, 80, 31);
		contentPane.add(textField);
		
		Panel panel = new Panel();
		panel.setBounds(69, 113, 764, 399);
		contentPane.add(panel);
		
		
		public  void Venn (Graphics g) {	
		
			setSize(800, 500);
		
		g.setColor(Color.red);
		g.drawOval(10, 50, 400, 300);
		
		g.setColor(Color.red);
		g.drawOval(200, 50, 400, 300);
		int x = 5;
		int y =7;
		
		}
		
	}
}
