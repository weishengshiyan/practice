package studentPanel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;



public class StudentManager extends JFrame implements ActionListener {
		JTabbedPane  dbTabPane;
			// TODO Auto-generated method stub
			StudentPanel inputInnePanel;
			JButton inputButton;
			Connection conn;
		   
			Statement stmt;
		    String[][] data;
			public StudentManager(){
				super("学生基本信息管理系统");
				this.setGUIComponent();
		}
			public void  setGUIComponent() {
				// TODO Auto-generated method stub
				Container c=getContentPane();
				c.setLayout(new BorderLayout());
				
				dbTabPane=new JTabbedPane();//选项卡
				inputButton =new JButton("录入");
				inputButton.addActionListener(this);
				dbTabPane.add("记录记录",inputButton);//将记录结果添->选项卡窗格 dbtabpane的“录入记录”中
				c.add(BorderLayout.CENTER,dbTabPane);
				c.add(BorderLayout.SOUTH,inputButton);
			}
			public void Connection() {
				try {
					 Class.forName("com.mysql.jdbc.Driver");
			            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ls?useUnicode=true&characterEncoding=utf-8&useSSL=false","root", "123456");
			            stmt=conn.createStatement();
			          
	
			            
				}
			            
			            catch (ClassNotFoundException e) {
							// TODO: handle exception
			            System.err.println("驱动错误");	
						}
			      		
					catch (SQLException e2) {
					// TODO: handle exception
						e2.getSQLState();
						e2.getMessage();
					}
				}
					public void close() {
						try {
							if(stmt!=null)
								stmt.close();
							if (conn!=null) {
								conn.close();
							}
						} catch (SQLException e2) {
							System.out.println("不能正常关闭");
							// TODO: handle exception
						}
					}
					public void inputRecords() {
						String no=inputInnePanel.getNo();
						String name=inputInnePanel.getName();
						String gender=inputInnePanel.getGender();
						String birth=inputInnePanel.getBirth();
						String address=inputInnePanel.getAddress();
						String tel=inputInnePanel.getTel();
					
					try {
						Connection();
						String insSQlString;
						insSQlString="insert into student(学号，姓名，性别，出生年月，家庭住址，联系电话)values('"+no+"','"+name+"','"+gender+"','birth','"+address+"','"+tel+"')";
						stmt.execute(insSQlString);
					
					
					} catch (SQLException e) {
						// TODO: handle exception
						System.err.println(e.getSQLState());
					}
					finally {
						close();
						
					}
					}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==inputButton) {
			inputRecords();
		}
	}
	public static void main(String[] args) {
		StudentManager appManager=new StudentManager();
		appManager.setSize(550,260);
		appManager.setDefaultCloseOperation(3);
		appManager.setVisible(true);
	}

}
