package quyang;

import javax.swing.*;

import operation3.Dock;
import operation3.User;

import java.awt.event.*;
import java.awt.*;
public class MyThread implements Runnable {

	JLabel label, l2;
	Dock da;
	User us;
	public MyThread(JLabel l,JLabel l1,Dock x, User y) {
		l2=l1;
		label=l;
		da = x;
		us = y;
	}
	//public void actionPerformed(ActionEvent e) {
		
	//}
	public void act() {
		new Thread(new MyThread(label,l2,da,us)).start();
	}
	
	public void run() {
		int time = 60;
		int i=0,j;
		
		while (time > 0)
		{
			time--;
			j=i%2;
			label.setText(time + "");
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			if(j==1) {
				l2.setBackground(Color.BLACK);
				l2.setForeground(Color.WHITE);
			}
			else {
				l2.setBackground(Color.YELLOW);
				l2.setForeground(Color.BLACK);
			}	
			i++;
		}
		if(time==0) {
			Dock1 gui = new Dock1(da,us);
			gui.go();
		}
	}
}
