package quyang;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import operation3.User;

public class UserCheck implements ActionListener{
	JFrame frame = new JFrame();
	
	
	JButton return1;

	
	public void go() { 
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(800, 800);
        String[] columnNames = {"����",
                "�Ա�",
                "��������",
                "���֤��",                      //table���е����ƣ��м���д����
                "����",
                "��������",
                "�μӹ�������",
                "���³ɼ�"};
        Object[][] data = new Object[100000][];
        
        int i=0,j;
        
        //GUI��ʱ����ɾȥtry-catch
        
        try {
           //����File
        	
                           
            String sname = null;
            String ssex = null;
            String sbirth = null;
            String sID = null;                     //�ɸ�����Ҫ�����������е�����
            String sregion = null;
            String sgroup = null;
            String scomp = null;
           Integer sgrade ;
          
                User us;
         		while(us.next()){						//	���ļ��л�������ʱѭ��
               // sname = rs.getString("mname");
            										//�ļ���鵽���涨��ı���
                data[i] = new Object[8];			//	8Ϊ�����ɱ�
                data[i][0] = sname;
                data[i][1] = ssex;
                data[i][2] = sbirth;				//����������object��
                data[i][3] = sID;
                data[i][4] = sregion;
                data[i][5] = sgroup;
                data[i][6] = scomp;
                data[i][7] = sgrade;
                i++;
            }
            //rs.close();						�ر�file�����ݿ���Ҫ��fileope��֪��   ������
            //con.close();
        } catch(ClassNotFoundException e1) {   
            //���ݿ��������쳣����
            System.out.println("Sorry,can`t find the Driver!");   
            e1.printStackTrace();   
            } 
            //catch(SQLException e1) {
            //e1.printStackTrace();  				//catch �������ݿ�����⣬file��Ҫ��
            //}
	        catch (Exception e1) {
            e1.printStackTrace();
            }
        
        
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        
        table.setFillsViewportHeight(true);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
        JScrollPane scrollPane = new JScrollPane();
        
        
        TableColumn firsetColumn0 = table.getColumnModel().getColumn(2);			//�����п�����Ϊ��n+1������0��ʼ��
        firsetColumn0.setPreferredWidth(150);										
        TableColumn firsetColumn = table.getColumnModel().getColumn(3);				//�����п�
        firsetColumn.setPreferredWidth(220);
        TableColumn firsetColumn1 = table.getColumnModel().getColumn(5);			//�����п�
        firsetColumn1.setPreferredWidth(220);
        TableColumn firsetColumn2 = table.getColumnModel().getColumn(6);			//�����п�
        firsetColumn2.setPreferredWidth(220);
        table.setRowHeight(50);														//�����п�
        
        
        JTableHeader head = table.getTableHeader();
        
        
        head.setPreferredSize(new Dimension(head.getWidth(), 35));                 // ���ñ�ͷ��С
        head.setFont(new Font("����", Font.PLAIN, 18));								// ���ñ�ͷ����
        table.setFont(new Font("����", Font.PLAIN, 18));								// ���ñ���������
        
        
        scrollPane.getViewport().add(table);
        
        
		return1 = new JButton("����");
		return1.setBounds(1000, 550,150, 40);										//button����
		return1.setFont(new Font("����", Font.BOLD, 30));

		
		scrollPane.setBounds(50, 50,1100, 500);									//tableλ������
		frame.add(return1);
		
		frame.add(scrollPane);
		
		
		frame.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		}
}

	
