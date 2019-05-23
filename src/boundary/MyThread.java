package boundary;

import javax.swing.*;

import entity.Dock;
import entity.User;
import operation3.*;

import java.awt.event.*;
import java.awt.*;

/**   
* @Title:MyThread
* @Package: boundary 
* @Description: This class defines the countdown function. 
* @author Group 88
* @date 2019.05.18
* @version V1.0   
* @see: entity.Dock
* @see: entity.User
* @see: operation3
*/
public class MyThread extends Thread implements Runnable {
	int time = 10;
	public volatile boolean exit = false;
	JLabel label, l2,lx;
	JFrame frame;
	Dock da;
	User use;
	Thread threads;
	/**
	 * This is the constructor of the class.
	 * @param: <JLabel> ll
	 * @param: <JLabel> l
	 * @param: <JLabel> l1
	 * @param: <Jframe> f
	 * @param: <Dock> x
	 * @param: <User> y
	 */
	public MyThread(JLabel ll,JLabel l,JLabel l1,JFrame f,Dock x, User y) {
		lx=ll;
		l2=l1;
		label=l;
		frame = f;
		da = x;
		use = y;
	}
	
	/** This is the first method, defines the beginning of the thread.
	 *@return void
	 */
	public void act() {
		threads=new MyThread(lx,label,l2,frame,da,use);
		threads.start();
	}
	
	/** This is the second method, defines running of the thread.
	 *@return void
	 */
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
			JOptionPane.showMessageDialog(null, "Time's up, the latch is locked, if you need to pick or return scooter, please choose again", "ERROR",JOptionPane.ERROR_MESSAGE);
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
	
	/** This is the third method, defines the thread can be canceled when needed.
	 *@return void
	 */
	public void cancel(){
        try {
        	threads.interrupt(); 
			threads.join();
		} catch (InterruptedException e) {
			//e.printStackTrace();
		} 
	}
}
	


	    