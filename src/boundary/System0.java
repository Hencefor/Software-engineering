package boundary;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**   
* @Title:System0
* @Package: boundary 
* @Description: This class defines the GUI of event handler of clicking "System" button. 
* @author Group 88
* @date 2019.05.18
* @version V1.0   
*/
public class System0 implements ActionListener {
	
	public static Object out;
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Create");
	JButton button2 = new JButton("Pay");
	JButton button3 = new JButton("Information");
	JButton button4 = new JButton("Exit");
	JLabel label1 = new JLabel("SYSTEM",JLabel.CENTER);
	JLabel label2 = new JLabel(" WELCOME ! ",JLabel.CENTER);
	
	
	/** This is the first method, defines the system initial GUI.
	 *@return void
	 */
	public void go() {
		//frame.getContentPane().setBackground(Color.BLACK);
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
		label2.setBounds(0,150,430,200);
//		label2.setBackground(Color.BLACK);
		label2.setOpaque(true);
		label2.setFont(new java.awt.Font("serif", 1, 40));
//		label2.setForeground(Color.WHITE);
		
		
		frame.getContentPane().add(button1);
		button1.setBounds(60,410,320,70);
//		button1.setBackground(Color.BLACK);
		Font bigFont = new Font("serif",Font.BOLD,30);
		button1.setFont(bigFont);
//		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		
		frame.getContentPane().add(button2);
		button2.setBounds(60,512,320,70);
//		button2.setBackground(Color.BLACK);
		button2.setFont(bigFont);
//		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		
		frame.getContentPane().add(button3);
		button3.setBounds(60,620,320,70);
//		button3.setBackground(Color.BLACK);
		button3.setFont(bigFont);
//		button3.setForeground(Color.WHITE);
		button3.addActionListener(this);
		
		frame.getContentPane().add(button4);
		button4.setBounds(60,728,320,70);
//		button4.setBackground(Color.BLACK);
		button4.setFont(bigFont);
//		button4.setForeground(Color.WHITE);
		button4.addActionListener(this);
	
		
		
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
		if (e.getSource() == button1) {
			frame.dispose();
			Systemc1 gui = new Systemc1 ();
			gui.go();
			}
		else if (e.getSource() == button2) {
			frame.dispose();
			Systemp1 gui = new Systemp1();
			gui.go();
			}
		else if (e.getSource() == button3) {
			frame.dispose();
			Systemi1 gui = new Systemi1();
			gui.go();
			}
		else if (e.getSource() == button4) {
			frame.dispose();
			GUI_beginning gui = new GUI_beginning();
			gui.go();
			}
		
	}
	
	
	
}
