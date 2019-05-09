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
import javax.swing.JOptionPane;

import operation3.*;

public class DockA implements ActionListener {
	String id="";
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Check");
	JButton button2 = new JButton("Exit");
	JLabel label1 = new JLabel("           DOCK    A");
	JLabel label2 = new JLabel("ID:",JLabel.CENTER);
	JTextField tf = new JTextField(9);
	
	JLabel label3 = new JLabel();
	Dock da;
	User us;
	
	
	public DockA(Dock x) {
		da = x;
	}
 
	public void go() {
		frame.setSize(800, 800);//set hight and width	
		frame.setLocationRelativeTo(null);// set in middle
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		frame.getContentPane().add(label1);
		label1.setBounds(0,0,430,120);
//		label1.setBackground(Color.BLACK);
		label1.setOpaque(true);
		label1.setFont(new java.awt.Font("serif", 1, 45));
//		label1.setForeground(Color.WHITE);
	
		frame.getContentPane().add(label2);
		label2.setBounds(0,190,150,240);
//		label2.setBackground(Color.BLACK);
		label2.setOpaque(true);
		label2.setFont(new java.awt.Font("serif", 1, 45));
//		label2.setForeground(Color.WHITE);
	
		frame.getContentPane().add(tf);
		tf.setHorizontalAlignment(JTextField.LEADING);
		tf.setBounds(150,190,430,240);
//		tf.setBackground(Color.BLACK);
		tf.setFont(new java.awt.Font("serif", 1, 40));//
//		tf.setForeground(Color.WHITE);//
	
		frame.getContentPane().add(button1);
		button1.setBounds(60,500,320,70);
//		button1.setBackground(Color.BLACK);
		Font bigFont = new Font("serif",Font.BOLD,30);
		button1.setFont(bigFont);
//		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
	
		frame.getContentPane().add(button2);
		button2.setBounds(60,650,320,70);
//		button2.setBackground(Color.BLACK);
		Font bigFont2 = new Font("serif",Font.BOLD,30);
		button2.setFont(bigFont2);
//		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);

	
		frame.getContentPane().add(label3);
		label3.setBounds(0,780,430,70);
//		label3.setBackground(Color.BLACK);
		label3.setOpaque(true);
		
		frame.setSize(450,900);
		frame.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button2) {
			frame.dispose();
			Dock0 gui = new Dock0();
			gui.go();
		
		}
		else if (e.getSource() == button1) {
			String num = tf.getText();
			us = FileOpe.fetchOneUser(num);
			if(us!=null) {
				frame.dispose();
				Dock1 gui = new Dock1(da,us);
				String a = label1.getText();
				if (a == "           DOCK    A") {
					gui.go();
				}
				if (a == "           DOCK    B") {
					gui.go();
					gui.label1.setText("           DOCK    B");
				}
				if (a == "           DOCK    C") {
					gui.go();
					gui.label1.setText("           DOCK    C");
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"you should try again");
				tf.setText("");
				
			}
			
		
		}
		
	}
}


