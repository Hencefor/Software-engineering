package boundary;
/**   
* @Title:GUI_beginning
* @Package: boundary 
* @date 2019.05.18
* @see: FileOpe, ResetDay
*/



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.FileOpe;
import operation3.ResetDay;

/**   
* This class is used to show the beginning GUI of the system. 
* @author Group 88
* @version V1.0 
*/

public class GUI_beginning extends JFrame implements ActionListener {
	//JFrame frame = new JFrame();
	JButton button1 = new JButton("System");
	JButton button2 = new JButton("Dock");
	JButton button3 = new JButton("Exit");
	JLabel label1 = new JLabel("           Group    88");
	JLabel label2 = new JLabel(" WELCOME ! ",JLabel.CENTER);
	JLabel label3 = new JLabel();
 
	/**
	 * This is the main method, which is the entrance of the process
	 * @param args
	 */
	public static void main (String[] args) {
		FileOpe.viewUser();
		//	 ResetDay a = new ResetDay();
		//	 a.start();
		GUI_beginning gui = new GUI_beginning();
		ResetDay test = new ResetDay(); 
		test.start();
		//gui.go();
	
	}
	/**
	 * This is the constructor of the class.
	 */
	public GUI_beginning()
	{
	 
		this.setSize(800, 800);//set hight and width	
		this.setLocationRelativeTo(null);// set in middle
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		this.getContentPane().add(label1);
		label1.setBounds(0,0,430,120);
//		label1.setBackground(Color.BLACK);
		label1.setOpaque(true);
		label1.setFont(new java.awt.Font("serif", 1, 45));
//		label1.setForeground(Color.WHITE);
		
		
		this.getContentPane().add(label2);
		label2.setBounds(0,150,430,200);
//		label2.setBackground(Color.BLACK);
		label2.setOpaque(true);
		label2.setFont(new java.awt.Font("serif", 1, 40));
//		label2.setForeground(Color.WHITE);
		
		
		this.getContentPane().add(button1);
		button1.setBounds(60,410,320,70);
//		button1.setBackground(Color.BLACK);
		Font bigFont = new Font("serif",Font.BOLD,30);
		button1.setFont(bigFont);
//		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		
		this.getContentPane().add(button2);
		button2.setBounds(60,512,320,70);
//		button2.setBackground(Color.BLACK);
		button2.setFont(bigFont);
//		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		
		this.getContentPane().add(button3);
		button3.setBounds(60,620,320,70);
//		button3.setBackground(Color.BLACK);
		button3.setFont(bigFont);
//		button3.setForeground(Color.WHITE);
		button3.addActionListener(this);
		
		this.getContentPane().add(label3);
		label3.setBounds(0,780,430,70);
//		label3.setBackground(Color.BLACK);
		label3.setOpaque(true);
		
		this.setSize(450,900);
		this.setVisible(true);
	}
 
	/**
	 * This is the first method, aimed to create the beginning GUI.
	 */
	public void go() {
	
	
	}
	
	/** This is the second method, aimed to respond to button actions.
	 *@return void
	 *@param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			this.dispose();
			System0 gui = new System0();
			gui.go();
			}
		else if (e.getSource() == button2) {
			this.dispose();
			Dock0 gui = new Dock0();
			gui.go();
			}

		else if (e.getSource() == button3) {
			this.dispose();
			}
	
	}
}