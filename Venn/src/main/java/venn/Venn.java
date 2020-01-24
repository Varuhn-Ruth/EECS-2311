<<<<<<< HEAD
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Panel;
=======
package venn;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Main extends JPanel implements MouseListener, MouseMotionListener{
 public final static int WIDTH = 500, HEIGHT = 500;
 private boolean triggered, pressedCancel;
 private JFrame frame;
 private int xPos, yPos;
 private String strInput;
 private int numClicks;
 private int f4;
 
 public Main() {
  frame = new JFrame("Customizable Venn Diagram");
  frame.setSize(WIDTH, HEIGHT);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setLocationRelativeTo(null);
  frame.setResizable(false);
  frame.setLayout(null);
  frame.add(this);
  frame.setVisible(true);
  this.setSize(WIDTH,HEIGHT);
  this.addMouseListener(this);
  this.addMouseMotionListener(this);
  triggered = false;
  pressedCancel = false;
  xPos = WIDTH/2;
  yPos = HEIGHT/2;
  strInput = "Test";
  numClicks = 0;
 // circles = new ArrayList<Circle>();
  
//  circles.add(new Circle(WIDTH - (WIDTH/4), HEIGHT/2, 100, 100));
//  circles.add(new Circle(WIDTH/4, HEIGHT/2, 100, 100));
  
  
  
 }
 
 @Override
 public void paintComponent(Graphics g) {
 
  if(numClicks == 0) {
   g.drawOval((WIDTH/4)-50, HEIGHT/2-100, 200, 200);
   g.drawOval((WIDTH/4)+70, HEIGHT/2-100, 200, 200);
  }
  
  if(triggered) {
   g.drawString(strInput, xPos, yPos);
   triggered = false;
   strInput = "Test";
  }
 }
 @Override
 public void mouseClicked(MouseEvent arg0) {
  // TODO Auto-generated method stub
  if(75 <= arg0.getX() && arg0.getX() <= 395) {
  numClicks++;
  xPos = arg0.getX();
  yPos = arg0.getY();
  try {
   do {
    strInput = JOptionPane.showInputDialog("Enter Text: ", "0");
   }while(strInput.equals(null) || strInput.equals("Test"));
  }catch(Exception e) {
   strInput = "Test";
   pressedCancel = true; //when they press cancel on JOptionPane
  }
  if(!pressedCancel) {
   triggered = true;
   paintComponent(this.getGraphics());
  }
  pressedCancel = false;
  }
 }
 @Override
 public void mouseEntered(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
 }
 @Override
 public void mouseExited(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
 }
 @Override
 public void mousePressed(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
 }
 @Override
 public void mouseReleased(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
 }
 @Override
 public void mouseDragged(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
 }
 @Override
 public void mouseMoved(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
 }
}
//>>>>>>> refs/remotes/origin/abdi
//
//<<<<<<< HEAD
//public class Venn extends JFrame {
//
//	private JPanel contentPane;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Venn frame = new Venn();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public Venn() {
//		setForeground(Color.LIGHT_GRAY);
//		setBackground(Color.GRAY);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 926, 671);
//		contentPane = new JPanel();
//		contentPane.setBackground(new Color(255, 250, 205));
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		TextField textField = new TextField();
//		textField.setText("Venn App\r\n");
//		textField.setBackground(new Color(250, 250, 210));
//		textField.setBounds(404, 33, 80, 31);
//		contentPane.add(textField);
//		int x = 9;
//		Panel panel = new Panel();
//		panel.setBounds(69, 113, 764, 399);
//		contentPane.add(panel);
//		
//		
//		public  void Venn (Graphics g) {	
//		
//			setSize(800, 500);
//		
//		g.setColor(Color.red);
//		g.drawOval(10, 50, 400, 300);
//		
//		g.setColor(Color.red);
//		g.drawOval(200, 50, 400, 300);
//		
//		}
//		
//	}
//=======
//>>>>>>> refs/remotes/origin/abdi
//}

