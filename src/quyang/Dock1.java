package quyang;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import operation3.*;

public class Dock1 implements ActionListener  {
	Dock da;
	User us;
	public Dock1(Dock x, User y) {
		da = x;
		us = y;
		
	}
	
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Pick");
	JButton button2 = new JButton("Return");
	JButton button3 = new JButton("Exit");
	JLabel label1 = new JLabel("           DOCK    A");
	JLabel label2 = new JLabel(" WELCOME ! ",JLabel.CENTER);
	JLabel label3 = new JLabel();
	
	//public static void main (String[] args) {
		//Dock1 gui = new Dock1();
		//gui.go();
	//}
	
	public void go() {
		frame.setSize(800, 800);//set hight and width	
		frame.setLocationRelativeTo(null);// set in middle
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		frame.getContentPane().add(label1);
		label1.setBounds(0,0,430,120);
		//label1.setBackground(Color.BLACK);
		label1.setOpaque(true);
		label1.setFont(new java.awt.Font("serif", 1, 45));
		//label1.setForeground(Color.WHITE);
		
		
		
		frame.getContentPane().add(label2);
		label2.setBounds(0,150,430,200);
		//label2.setBackground(Color.BLACK);
		label2.setOpaque(true);
		label2.setFont(new java.awt.Font("serif", 1, 40));
		//label2.setForeground(Color.WHITE);
		
		
		frame.getContentPane().add(button1);
		button1.setBounds(60,410,320,70);
		//button1.setBackground(Color.BLACK);
		Font bigFont = new Font("serif",Font.BOLD,30);
		button1.setFont(bigFont);
		//button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		
		frame.getContentPane().add(button2);
		button2.setBounds(60,512,320,70);
		//button2.setBackground(Color.BLACK);
		button2.setFont(bigFont);
		//button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		
		frame.getContentPane().add(button3);
		button3.setBounds(60,620,320,70);
		//button3.setBackground(Color.BLACK);
		button3.setFont(bigFont);
		//button3.setForeground(Color.WHITE);
		button3.addActionListener(this);
		
		frame.getContentPane().add(label3);
		label3.setBounds(0,780,430,70);
		//label3.setBackground(Color.BLACK);
		label3.setOpaque(true);
	
		
		
		frame.setSize(450,900);
		frame.setVisible(true);
		
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		boolean user_usS,user_acS;
		boolean dock_em,dock_full;
		user_acS = us.getAcState();
		
		
		user_usS = us.getUsState();
		
		dock_em = da.isEmpty();
		dock_full = da.isFull();
		if (e.getSource() == button1) {
			if(user_usS==false && user_acS==false && dock_em==false) {
				frame.dispose();
				Dock2_1 gui = new Dock2_1(da,us);
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
			else if(user_usS==false && user_acS==false && dock_em==true){
				//����
				JOptionPane.showMessageDialog(null,"There is no scooter in this dock!");
			}
			else if(user_usS==true || user_acS==true ) {
				//����
				JOptionPane.showMessageDialog(null,"You need to return the scooter for pay the bill first!");
			}
		
		}
		else if (e.getSource() == button2) {
			if(user_usS==true && dock_full==false) {
				frame.dispose();
				Dock2_2 gui = new Dock2_2(da,us);
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
			else if(dock_full==true && user_usS==true){
				//����
				JOptionPane.showMessageDialog(null,"There is no empty slot in this dock!");
			}
			else if(user_usS==false ) {
				//����
				JOptionPane.showMessageDialog(null,"You didn't pick a scooter!");
			}
		}
		else if (e.getSource() == button3) {
			frame.dispose();
			Dock0 gui = new Dock0();
			gui.go();
		
		}
	}
	

	

}
