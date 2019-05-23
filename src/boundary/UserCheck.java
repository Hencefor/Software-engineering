package boundary;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import control.FileOpe;
import entity.User;


/**   
* @Title: UserCheck
* @Package: boundary 
* @Description: This class defines the GUI of event handler of clicking "User" button. 
* @author Group 88
* @date 2019.05.18
* @version V1.0   
* @see: control.FileOpe
* @see: entity.User
*/
public class UserCheck implements ActionListener{
	JFrame frame = new JFrame();
	
	
	JButton return1= new JButton("Return");
	JButton send1= new JButton("Send");
	JTextField tf = new JTextField(9);
	
	/** This is the first method, defines the check user's information GUI.
	 *@return void
	 */
	public void go() { 
		
		
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(1500, 1500);
        String[] columnNames = {"Name",
                "ID",
                "Email",
                "AccountState",                      //
                "UsingState"};
        Object[][] data = new Object[100][];
        
        int i=0,j;
        
        //
        
        try {
           
        	
                           
            String sname = null;
            String id = null;
            String email = null;
            String acState = null;                     //
            String usState = null;
            String dayDuration = null;
           // String scomp = null;
          //  Integer sgrade ;
            ArrayList<User> a= new ArrayList<User>();
            a=FileOpe.fetchAllUsers();
          
            for(User b:a)
            {
            	data[i] = new Object[5];			//	
                data[i][0] = b.getName();
                data[i][1] = b.getId();
                data[i][2] = b.getEmail();				//
                data[i][3] = String.valueOf(b.getAcState());
                data[i][4] = String.valueOf(b.getUsState());
                //data[i][5] = b.;
                i++;
            }
            
//         		while(rs.next()){						//	
//               // sname = rs.getString("mname");
//            										//
//                data[i] = new Object[6];			//
//                data[i][0] = sname;
//                data[i][1] = id;
//                data[i][2] = email;				//
//                data[i][3] = acState;
//                data[i][4] = usState;
//                data[i][5] = dayDuration;
//                //data[i][6] = scomp;
//               // data[i][7] = sgrade;
//                i++;
//            }
            //rs.close();						
            //con.close();
        } catch (Exception e1) {
            e1.printStackTrace();
            }
        
        
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        
        table.setFillsViewportHeight(true);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
        JScrollPane scrollPane = new JScrollPane();
        
        
        TableColumn firsetColumn0 = table.getColumnModel().getColumn(0);			//
        firsetColumn0.setPreferredWidth(150);										
        TableColumn firsetColumn = table.getColumnModel().getColumn(1);				//
        firsetColumn.setPreferredWidth(220);
        TableColumn firsetColumn1 = table.getColumnModel().getColumn(2);			//
        firsetColumn1.setPreferredWidth(220);
        TableColumn firsetColumn2 = table.getColumnModel().getColumn(3);			//
        firsetColumn2.setPreferredWidth(220);
        TableColumn firsetColumn3 = table.getColumnModel().getColumn(4);			//
        firsetColumn3.setPreferredWidth(220);
        table.setRowHeight(50);														//
        
        
        JTableHeader head = table.getTableHeader();
        
        
        head.setPreferredSize(new Dimension(head.getWidth(), 35));                 // 
        head.setFont(new Font("楷体", Font.PLAIN, 18));								// 
        table.setFont(new Font("楷体", Font.PLAIN, 18));								// 
        
        
        scrollPane.getViewport().add(table);
        
        //frame.getContentPane().add(return1);
        frame.getContentPane().add(tf);
		tf.setHorizontalAlignment(JTextField.LEADING);
		tf.setBounds(47, 550,150, 40);
//		tf.setBackground(Color.BLACK);
		tf.setFont(new java.awt.Font("serif", 1, 40));//
//		tf.setForeground(Color.WHITE);//
		
		frame.getContentPane().add(send1);
		send1.setBounds(200, 550,150, 40);
		send1.setFont(new Font("黑体", Font.BOLD, 30));
	//	button2.setBackground(Color.BLACK);
	//	send1.setFont(bigFont);
	//	button2.setForeground(Color.WHITE);
		send1.addActionListener(this);
        
        
		return1 = new JButton("return");
		return1.setBounds(1000, 550,150, 40);										//
		return1.setFont(new Font("黑体", Font.BOLD, 30));
		scrollPane.setBounds(50, 50,1100, 500);									//
		frame.add(return1);
		return1.addActionListener(this);
		frame.add(scrollPane);
		
		
		frame.setVisible(true);
		
		
	}
	
	/** This is the second method, aimed to respond to button actions.
	 *@return void
	 *@param e
	 */
	public void actionPerformed(ActionEvent e) {
		User a = FileOpe.fetchOneUser(tf.getText());
		if (e.getSource() == return1) {
			frame.dispose();
			Systemi1 gui = new Systemi1 ();
			gui.go();
			}
		
		else if(e.getSource() == send1)
		{
			if(FileOpe.fetchOneUser(tf.getText())!=null)
			{
				
				JOptionPane.showMessageDialog(null, "Send user information to "+a.getName()+"Content:\n acState:"+
				a.getAcState()+"   usState:"+a.getUsState(), "Successful",JOptionPane.PLAIN_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null, "User not found ","ERROR",JOptionPane.ERROR_MESSAGE);
		tf.setText("");

		}
		
		
		}
}