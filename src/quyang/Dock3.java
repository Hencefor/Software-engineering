package quyang;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dock3 implements ActionListener {
 
 
 JFrame frame = new JFrame();
 JButton button1 = new JButton("Exit");
 JLabel label1 = new JLabel("           DOCK    A");
 JLabel label2 = new JLabel(" Successfully ",JLabel.CENTER);
 JLabel label3 = new JLabel();
 

 public void go() {
	frame.setSize(800, 800);//set hight and width	
	frame.setLocationRelativeTo(null);// set in middle
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	
	frame.getContentPane().add(label1);
	label1.setBounds(0,0,430,120);
//	label1.setBackground(Color.BLACK);
	label1.setOpaque(true);
	label1.setFont(new java.awt.Font("serif", 1, 45));
//	label1.setForeground(Color.WHITE);
	
	
	frame.getContentPane().add(label2);
	label2.setBounds(0,190,430,240);
//	label2.setBackground(Color.BLACK);
	label2.setOpaque(true);
	label2.setFont(new java.awt.Font("serif", 1, 40));//
//	label2.setForeground(Color.WHITE);//
	
	frame.getContentPane().add(button1);
	button1.setBounds(60,570,320,70);
//	button1.setBackground(Color.BLACK);
	Font bigFont = new Font("serif",Font.BOLD,30);
	button1.setFont(bigFont);
//	button1.setForeground(Color.WHITE);
	button1.addActionListener(this);
	
	frame.getContentPane().add(label3);
	label3.setBounds(0,780,430,70);
//	label3.setBackground(Color.BLACK);
	label3.setOpaque(true);
	
	frame.setSize(450,900);
	frame.setVisible(true);
	
 }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button1) {
		frame.dispose();
		Dock0 gui = new Dock0();
		gui.go();
	}
}
}