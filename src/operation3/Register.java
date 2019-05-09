package operation3;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import control.FileOpe;
import entity.User;

public class Register extends JFrame implements ActionListener {
    /**********************定义各控件********************************/
    private JLabel lbAccount=new JLabel("Please enter your ID number:");
    private JTextField tfAccount=new JTextField(10);
    private JLabel lbEmail=new JLabel("Please enter your email address:");
    private JTextField tfEmail=new JTextField(10);
    private JLabel lbName=new JLabel("Please enter your name:");
    private JTextField tfName=new JTextField(10);
    private JButton btRegister=new JButton("Register");
    //private JButton btLogin=new JButton("登录");
    private JButton btExit=new JButton("Exit");
    public Register() {
        /******************界面初始化********************/
        super("Register");
        this.setLayout(new FlowLayout());
        this.add(lbAccount);
        this.add(tfAccount);
        this.add(lbEmail);
        this.add(tfEmail);
        this.add(lbName);
        this.add(tfName);
        this.add(btRegister);
        //this.add(btLogin);
        this.add(btExit);
        this.setSize(540,180);
        GUIUtil.toCenter(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        Font f=new Font("Century Gothic",Font.BOLD,20);
        Font f1=new Font("Century Gothic",0,20);
        btRegister.setFont(f);
        btExit.setFont(f);
        btRegister.setPreferredSize(new Dimension(210, 40));
        btExit.setPreferredSize(new Dimension(200, 40));
        lbAccount.setFont(f1);
        lbEmail.setFont(f1);
        lbName.setFont(f1);
        /****************************增加监听***********************/
        //btLogin.addActionListener(this);
        btRegister.addActionListener(this);
        btExit.addActionListener(this);
    }
    @Override
   public void actionPerformed(ActionEvent e) {
    	
    	
        if(e.getSource()==btRegister) {
           
         
           FileOpe.viewUser();
            String account=tfAccount.getText();
            String mail = tfEmail.getText();
            String name = tfName.getText();
            System.out.println("mail:"+mail);
           if((FileOpe.checkUniqueId(account))==false || FileOpe.checkUniqueEmail(mail)==false )
           {
        	  // System.out.println("exist");
        	   JOptionPane.showMessageDialog(this,"用户已经存在");
           }
        	   
           else if((FileOpe.checkUniqueId(account))==true && FileOpe.checkUniqueEmail(mail)==true)
           {
        	   User aa=new User();
        	   aa.setId(account);
        	   aa.setEmail(mail);
        	   aa.setName(name);
        	   
        	   FileOpe.addUser(aa);
        	   JOptionPane.showMessageDialog(this,"注册成功");
           }
        		   
        	   
       	  
           
            
//            FileOpe.getInfoByAccount(account);
//            if(Conf.account!=null) {
//                JOptionPane.showMessageDialog(this,"用户已经注册");
//                return;
//            }
//            String name=tfName.getText();
//            String dept=(String)cbDept.getSelectedItem();
//            FileOpe.updateCustomer(account,password1,name,dept);
//            JOptionPane.showMessageDialog(this,"注册成功");
        
//        else if(e.getSource()==btLogin) {
//            this.dispose();
//            new LoginFrame();
        }
       if(e.getSource()==btExit) {
            JOptionPane.showMessageDialog(this,"Thanks for using!");
            System.exit(0);
        }
    }
}
	
	


