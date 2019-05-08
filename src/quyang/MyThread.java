package quyang;

import javax.swing.*;
import operation3.*;

import java.awt.event.*;
import java.awt.*;
public class MyThread extends Thread implements Runnable {
	int time = 10;
	public volatile boolean exit = false;
	JLabel label, l2,lx;
	JFrame frame;
	Dock da;
	User use;
	Thread threads;
	public MyThread(JLabel ll,JLabel l,JLabel l1,JFrame f,Dock x, User y) {
		lx=ll;
		l2=l1;
		label=l;
		frame = f;
		da = x;
		use = y;
	}
	public void act() {
		threads=new MyThread(lx,label,l2,frame,da,use);
		threads.start();
	}
	
	public void run() {
		
		int i=0,j;
		
		while (time > 0 && !exit)
		{
			time--;
			j=i%2;
			
			label.setText(time + "");
			try
			{
				threads.sleep(1000);
			}
			catch (Exception e)
			{
				//e.printStackTrace();
				break;
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
			frame.dispose();
			Dock1 gui = new Dock1(da,use);
			String a = lx.getText();
			if (a == "           DOCK    A") {
				gui.go();
			}
			else if (a == "           DOCK    B") {
				gui.go();
				gui.label1.setText("           DOCK    B");
			}
			else if (a == "           DOCK    C") {
				gui.go();
				gui.label1.setText("           DOCK    C");
			}
			
		}
	}
	public void cancel(){
        try {
        	threads.interrupt(); 
			threads.join();
		} catch (InterruptedException e) {
			//e.printStackTrace();
		} 
	}
}
	


	    