package operation3;
/**   
* @Title:Select
* @Package:  operation3
* @date 2019.05.18 
*/
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
//import java.awt.Component;
//import javax.swing.JPasswordField;
import javax.swing.JButton;
//import javax.swing.JTextField;
/**   
* This class defines the method to validate the input format. 
* @author Group 88
* @version V1.0   
*/
public class Select extends JFrame implements ActionListener {
    /****************************������ؼ�**************************/
    //private Icon welcomeIcon=new ImageIcon("welcome.png");
    //private JLabel lbWelcome=new JLabel(welcomeIcon);
    private JLabel lbWelcome=new JLabel("Please choose the system.");
    //private JTextField tfAccount=new JTextField(10);
    //private JLabel lbPassword=new JLabel("������������");
    //private JPasswordField pfPassword=new JPasswordField(10);
    private JButton btRegister=new JButton("Register");
    private JButton btPaySys=new JButton("Pay fine");
    private JButton btManageSys=new JButton("Management");
    public Select() {
        /**********************�����ʼ��*****************************/
    	super("system");
        this.setLayout(new FlowLayout());
        //this.add(lbWelcome);
        this.add(lbWelcome);
        //this.add(tfAccount);
        //this.add(lbPassword);
        //this.add(pfPassword);
        this.add(btRegister);
        this.add(btPaySys);
        this.add(btManageSys);
        this.setSize(500,300);    
        GUIUtil.toCenter(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        Font f=new Font("Kokonor",0,25);
        Font f1=new Font("Century Gothic",Font.BOLD,25);
        btRegister.setFont(f);
        btPaySys.setFont(f);
        btManageSys.setFont(f);
        lbWelcome.setFont(f1);
        btRegister.setPreferredSize(new Dimension(420, 70));
        btPaySys.setPreferredSize(new Dimension(420, 70));
        btManageSys.setPreferredSize(new Dimension(420, 70));
        //btRegister.setFont(new Font("����", Font.PLAIN, 16));
        //lbWelcome.setFont(new java.awt.Font("Dialog", 0, 14));
        /*****************************���Ӽ���************************/
       btRegister.addActionListener(this);
       btPaySys.addActionListener(this);
       btManageSys.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btRegister) {
        	this.dispose();
            new Register();
            
        }
        /*else if(e.getSource()==btLogin) {
            this.dispose();
            new LoginFrame();
        }
        else {
            JOptionPane.showMessageDialog(this,"лл����");
            System.exit(0);
        }*/
    }
}