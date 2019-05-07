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

public class UserCheck implements ActionListener{
	JFrame frame = new JFrame();
	
	
	JButton return1;

	
	public void go() { 
		
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(800, 800);
        String[] columnNames = {"姓名",
                "性别",
                "出生日期",
                "身份证号",                      //table中列的名称，有几列写几个
                "地区",
                "所属团体",
                "参加过的赛事",
                "赛事成绩"};
        Object[][] data = new Object[100000][];
        
        int i=0,j;
        
        //GUI验时可先删去try-catch
        
        try {
           //调用File
        	//打开file
                           
            String sname = null;
            String ssex = null;
            String sbirth = null;
            String sID = null;                     //可根据需要更改列数及列的名称
            String sregion = null;
            String sgroup = null;
            String scomp = null;
            Integer sgrade ;
          
            
         		while(/*rs.next()*/){						//	当文件中还有内容时循环
               // sname = rs.getString("mname");
            										//文件类归到上面定义的变量
                data[i] = new Object[8];			//	8为列数可变
                data[i][0] = sname;
                data[i][1] = ssex;
                data[i][2] = sbirth;				//将变量放入object中
                data[i][3] = sID;
                data[i][4] = sregion;
                data[i][5] = sgroup;
                data[i][6] = scomp;
                data[i][7] = sgrade;
                i++;
            }
            //rs.close();						关闭file，数据库需要，fileope不知道   〒▽〒
            //con.close();
        } catch(ClassNotFoundException e1) {   
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");   
            e1.printStackTrace();   
            } catch(SQLException e1) {
            e1.printStackTrace();  				//catch 的是数据库的问题，file需要改
            }catch (Exception e1) {
            e1.printStackTrace();
            }
        
        
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        
        table.setFillsViewportHeight(true);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
        JScrollPane scrollPane = new JScrollPane();
        
        
        TableColumn firsetColumn0 = table.getColumnModel().getColumn(2);			//设置列宽，列数为（n+1）（从0开始）
        firsetColumn0.setPreferredWidth(150);										
        TableColumn firsetColumn = table.getColumnModel().getColumn(3);				//设置列宽
        firsetColumn.setPreferredWidth(220);
        TableColumn firsetColumn1 = table.getColumnModel().getColumn(5);			//设置列宽
        firsetColumn1.setPreferredWidth(220);
        TableColumn firsetColumn2 = table.getColumnModel().getColumn(6);			//设置列宽
        firsetColumn2.setPreferredWidth(220);
        table.setRowHeight(50);														//设置行宽
        
        
        JTableHeader head = table.getTableHeader();
        
        
        head.setPreferredSize(new Dimension(head.getWidth(), 35));                 // 设置表头大小
        head.setFont(new Font("楷体", Font.PLAIN, 18));								// 设置表头字体
        table.setFont(new Font("楷体", Font.PLAIN, 18));								// 设置表内容字体
        
        
        scrollPane.getViewport().add(table);
        
        
		return1 = new JButton("返回");
		return1.setBounds(1000, 550,150, 40);										//button设置
		return1.setFont(new Font("黑体", Font.BOLD, 30));

		
		scrollPane.setBounds(50, 50,1100, 500);									//table位置设置
		frame.add(return1);
		
		frame.add(scrollPane);
		
		
		frame.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		}
}

	
