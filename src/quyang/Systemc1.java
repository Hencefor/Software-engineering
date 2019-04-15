package quyang;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Systemc1 implements ActionListener  {
	String id="";
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Check");
	JButton button2 = new JButton("Exit");
	JLabel label1 = new JLabel("CREATE",JLabel.CENTER);
	JLabel label2 = new JLabel("<html>    Please enter the<br>Following information</html> ",JLabel.CENTER);
	JLabel label3 = new JLabel("Name:",JLabel.CENTER);
	JLabel label4 = new JLabel("ID:",JLabel.CENTER);
	JLabel label5 = new JLabel("Email:",JLabel.CENTER);
	JTextField tf1 = new JTextField(9);
	JTextField tf2 = new JTextField(9);
	JTextField tf3 = new JTextField(9);
	JLabel label6 = new JLabel();
	
 
	public void go() {
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
	
		frame.getContentPane().add(label1);
		label1.setBounds(0,0,430,120);
		label1.setBackground(Color.BLACK);
		label1.setOpaque(true);
		label1.setFont(new java.awt.Font("serif", 1, 45));
		label1.setForeground(Color.WHITE);
	
		frame.getContentPane().add(label2);
		label2.setBounds(0,150,430,120);
		label2.setBackground(Color.BLACK);
		label2.setOpaque(true);
		label2.setFont(new java.awt.Font("serif", 1, 35));
		label2.setForeground(Color.WHITE);
		
		frame.getContentPane().add(label3);
		label3.setBounds(0,300,100,60);
		label3.setBackground(Color.BLACK);
		label3.setOpaque(true);
		label3.setFont(new java.awt.Font("serif", 1, 30));
		label3.setForeground(Color.WHITE);
		
		frame.getContentPane().add(tf1);
		tf1.setHorizontalAlignment(JTextField.LEADING);
		tf1.setBounds(100,300,430,60);
		tf1.setBackground(Color.BLACK);
		tf1.setFont(new java.awt.Font("serif", 1, 25));
		tf1.setForeground(Color.WHITE);
		
		frame.getContentPane().add(label4);
		label4.setBounds(0,360,100,60);
		label4.setBackground(Color.BLACK);
		label4.setOpaque(true);
		label4.setFont(new java.awt.Font("serif", 1, 30));
		label4.setForeground(Color.WHITE);
		
		frame.getContentPane().add(tf2);
		tf2.setHorizontalAlignment(JTextField.LEADING);
		tf2.setBounds(100,360,430,60);
		tf2.setBackground(Color.BLACK);
		tf2.setFont(new java.awt.Font("serif", 1, 25));
		tf2.setForeground(Color.WHITE);

		frame.getContentPane().add(label5);
		label5.setBounds(0,420,100,60);
		label5.setBackground(Color.BLACK);
		label5.setOpaque(true);
		label5.setFont(new java.awt.Font("serif", 1, 30));
		label5.setForeground(Color.WHITE);
		
		frame.getContentPane().add(tf3);
		tf3.setHorizontalAlignment(JTextField.LEADING);
		tf3.setBounds(100,420,430,60);
		tf3.setBackground(Color.BLACK);
		tf3.setFont(new java.awt.Font("serif", 1, 25));
		tf3.setForeground(Color.WHITE);
		
		frame.getContentPane().add(button1);
		button1.setBounds(60,540,320,70);
		button1.setBackground(Color.BLACK);
		Font bigFont = new Font("serif",Font.BOLD,30);
		button1.setFont(bigFont);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		
	
		frame.getContentPane().add(button2);
		button2.setBounds(60,650,320,70);
		button2.setBackground(Color.BLACK);
		Font bigFont2 = new Font("serif",Font.BOLD,30);
		button2.setFont(bigFont2);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);

	
		frame.getContentPane().add(label6);
		label6.setBounds(0,780,430,70);
		label6.setBackground(Color.BLACK);
		label6.setOpaque(true);
		
		frame.setSize(450,900);
		frame.setVisible(true);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button2) {
			frame.dispose();
			System gui = new System ();
			gui.go();
			}
		
	}
}


