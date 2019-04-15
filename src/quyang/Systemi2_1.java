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

public class Systemi2_1 implements ActionListener  {
	String id="";
	JFrame frame = new JFrame();
	JButton button2 = new JButton("Exit");
	JLabel label1 = new JLabel("DOCK",JLabel.CENTER);
	JLabel label2 = new JLabel("<html>A_scooter:---<br>A_empty :---<br>B_scooter:---<br>B_empty :---<br>C_scooter:---<br>C_empty :---</html> ",JLabel.CENTER);
	
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
		label2.setBounds(0,150,430,450);
		label2.setBackground(Color.BLACK);
		label2.setOpaque(true);
		label2.setFont(new java.awt.Font("serif", 1, 40));
		label2.setForeground(Color.WHITE);
		
		
	
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
			Systemi1 gui = new Systemi1 ();
			gui.go();
			}
	}
}


