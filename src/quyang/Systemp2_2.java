package quyang;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Systemp2_2 {
 
 
 JFrame frame = new JFrame();
 JButton button1 = new JButton("Exit");
 JLabel label1 = new JLabel(" PAY ",JLabel.CENTER);
 JLabel label2 = new JLabel(" Wrong ",JLabel.CENTER);
 JLabel label3 = new JLabel();
 
 
 
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
	label2.setBounds(0,190,430,240);
	label2.setBackground(Color.BLACK);
	label2.setOpaque(true);
	label2.setFont(new java.awt.Font("serif", 1, 40));//设置字体样式
	label2.setForeground(Color.WHITE);//设置字体颜色
	
	frame.getContentPane().add(button1);
	button1.setBounds(60,570,320,70);
	button1.setBackground(Color.BLACK);
	Font bigFont = new Font("serif",Font.BOLD,30);
	button1.setFont(bigFont);
	button1.setForeground(Color.WHITE);
	
	frame.getContentPane().add(label3);
	label3.setBounds(0,780,430,70);
	label3.setBackground(Color.BLACK);
	label3.setOpaque(true);
	
	frame.setSize(450,900);
	frame.setVisible(true);
	
 }
}