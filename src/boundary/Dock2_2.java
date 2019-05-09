package boundary;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import control.FileOpe;
import control.FileOpeDock;
import entity.Dock;
import entity.User;
import operation3.*;

public class Dock2_2  implements ActionListener {
	Dock da;
	User us;
	long c,r;
	String useTime;
	public Dock2_2(Dock x, User y)  {
		da = x;
		us = y;
		Date use;
		Date time= new Date();
		c = time.getTime();
		r = us.timeuse(c);
		try {
		
		SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");
		long diff = r-8*60*60*1000;
	
		
	
		Date date = new Date(diff);
	
		
		useTime = sd.format(date);
		}catch (Exception e){
			
		}
		
	}
				

	
	JFrame frame = new JFrame();
		
	 JButton button1 = new JButton("Check");
	 JButton button2 = new JButton("Exit");
	 JLabel label1 = new JLabel("           DOCK    A");
	 JLabel label2 = new JLabel("<html>Waiting for Return"
	 		+ "<br>......</html>",JLabel.CENTER);
	 JLabel label3 = new JLabel("",JLabel.CENTER);
	 JLabel label4 = new JLabel("59",JLabel.CENTER);
	 MyThread  mt;
	// MyThread  mt= new MyThread(label1,label4,label3,frame,da,us);
	 public void go() {
		// MyThread  mt = new MyThread(label1,label4,label3,frame,da,us);
		JLabel label5 = new JLabel("Use Time: "+useTime,JLabel.CENTER);
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
		label2.setBounds(0,150,430,200);
	//	label2.setBackground(Color.BLACK);
		label2.setOpaque(true);
		label2.setFont(new java.awt.Font("serif", 1, 40));
	//	label2.setForeground(Color.WHITE);
		
		
		frame.getContentPane().add(button1);
		button1.setBounds(60,520,320,70);
	//	button1.setBackground(Color.BLACK);
		Font bigFont = new Font("serif",Font.BOLD,30);
		button1.setFont(bigFont);
	//	button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		
		frame.getContentPane().add(button2);
		button2.setBounds(60,630,320,70);
	//	button2.setBackground(Color.BLACK);
		button2.setFont(bigFont);
	//	button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		
		
		label3.setText(da.returnPositionReturn()+"");
			frame.getContentPane().add(label3);
			
			label3.setBounds(0,780,70,70);
	//		label3.setBackground(Color.BLACK);
			label3.setOpaque(true);
			label3.setFont(new java.awt.Font("serif", 1, 25));
	//		label3.setForeground(Color.WHITE);
			frame.getContentPane().add(label4);
			
			label4.setBounds(360,780,70,70);
	//		label4.setBackground(Color.BLACK);
			label4.setOpaque(true);
			label4.setFont(new java.awt.Font("serif", 1, 25));
	//		label4.setForeground(Color.WHITE);
			
			frame.getContentPane().add(label5);
			label5.setBounds(0,400,450,70);
	//		label5.setBackground(Color.BLACK);
			label5.setOpaque(true);
			label5.setFont(new java.awt.Font("serif", 1, 25));
	//		label5.setForeground(Color.WHITE);
			  mt = new MyThread(label1,label4,label3,frame,da,us);
			mt.act();
			//button1.addActionListener(t);
			
			frame.setSize(450,900);
			frame.setVisible(true);
			
		 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button2) {
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
			mt.cancel();
		}
		else if (e.getSource() == button1) {
			frame.dispose();
			Dock0 gui = new Dock0();
			String a = label1.getText();
			
			us.setAcState(false);
			us.notUsingSc();
			
			if(r>60000) {
				us.setAcState(true);
			}
			us.addDuration(r);
			da.retrieveScooter();
			
			FileOpe.updateUser(us);
			FileOpeDock.updateDock(da);
			
			JOptionPane.showMessageDialog(null,"You have returned the scooter successfully!");
			
			gui.go();
			mt.cancel();
		}
	}

}
