package boundary;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import control.FileOpe;
import entity.User;

/**   
* @Title:Systemp2_1_100
* @Package: boundary 
* @Description: This class defines the GUI after the identity authentication. 
* @author Group 88
* @date 2019.05.18
* @version V1.0   
* @see: control.FileOpe
* @see: entity.User
*/
public class Systemp2_1_100 implements ActionListener {
	User a;
	/**
	 * This is the constructor of the class.
	 */
	public Systemp2_1_100()
	{
		
	}
	
	/**
	 * This is the constructor of the class.
	 * @param: <User> a
	 */
	 public Systemp2_1_100(User a)
	 {
		 this.a=a;
	 }
	 
	 
 JFrame frame = new JFrame();
 JButton button1 = new JButton("User");
 JButton button2 = new JButton("Pay");
 JButton button3 = new JButton("Exit");
 JLabel label1 = new JLabel(" PAY ",JLabel.CENTER);
 JLabel label2 = new JLabel(" WELCOME ! ",JLabel.CENTER);
 JLabel label3 = new JLabel("",JLabel.CENTER);
 JLabel label4 = new JLabel();
 
 
 	/** This is the first method, defines the user paying GUI.
	 *@return void
	 */
 public void go() {
	int amount = -1;
	if(a.getAcState()==true) {
		amount=100;
	}
	else if(a.getAcState()==false)
	{
		amount=0;
	}
		
	 
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
	
	frame.getContentPane().add(label3);
	label3.setText("You should pay"+amount+"");
	label3.setBounds(0,390,430,100);
	//label3.setBackground(Color.BLACK);
	label3.setOpaque(true);
	label3.setFont(new java.awt.Font("serif", 1, 40));
	//label3.setForeground(Color.WHITE);	
	
	frame.getContentPane().add(button2);
	button2.setBounds(60,552,320,70);
	//button2.setBackground(Color.BLACK);
	Font bigFont = new Font("serif",Font.BOLD,30);
	button2.setFont(bigFont);
	//button2.setForeground(Color.WHITE);
	button2.addActionListener(this);
	
	frame.getContentPane().add(button3);
	button3.setBounds(60,655,320,70);
	//button3.setBackground(Color.BLACK);
	button3.setFont(bigFont);
	//button3.setForeground(Color.WHITE);
	button3.addActionListener(this);
	
	frame.getContentPane().add(label4);
	label4.setBounds(0,780,430,70);
	//label4.setBackground(Color.BLACK);
	label4.setOpaque(true);
	
	frame.setSize(450,900);
	frame.setVisible(true);
	
 }

 	/** This is the second method, aimed to respond to button actions.
	 *@return void
	 *@param e
	 */
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button3) {
		frame.dispose();
		System0 gui = new System0 ();
		gui.go();
		}
	else if (e.getSource() == button2) {
		if(a.getAcState()==true) {
			a.pay();
			FileOpe.updateUser(a);
			JOptionPane.showMessageDialog(null, "Fine paied", "Successful",JOptionPane.PLAIN_MESSAGE); 
			label3.setText("You should pay 0");
		}
		else if(a.getAcState()==false)
		{
			JOptionPane.showMessageDialog(null, "Unless you are Mine owner, you don't need to pay anything", "ERROR",JOptionPane.ERROR_MESSAGE); 
		}
		
		}
}
}