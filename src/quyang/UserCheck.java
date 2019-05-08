package quyang;

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

import operation3.FileOpe;
import operation3.User;

public class UserCheck implements ActionListener{
	JFrame frame = new JFrame();
	
	
	JButton return1= new JButton("Return");

	
	public void go() { 
		
		
		frame.setLocationRelativeTo(null);
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
        
        //GUI验时可先删去try-catch
        
        try {
           //调用File
        	
                           
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
		
		return1 = new JButton("return");
		return1.setBounds(1000, 550,150, 40);										//
		return1.setFont(new Font("黑体", Font.BOLD, 30));
		scrollPane.setBounds(50, 50,1100, 500);									//
		frame.add(return1);
		return1.addActionListener(this);
		frame.add(scrollPane);
		
		
		frame.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == return1) {
			frame.dispose();
			Systemi1 gui = new Systemi1 ();
			gui.go();
			}
		}
}