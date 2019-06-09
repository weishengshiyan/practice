package demo01;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Select extends JFrame {
	Object data[][];
	Object colname[] = {"id","name"};
	JTable jTable;
	public Select() {
		 super("链接实例");
		 initView();
			 // TODO 自动生成的构造函数存根
		 }
	private void initView() {
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		data =new Object[10][10];
		this.loadData();
		jTable =new JTable(data,colname);
		c.add(new JScrollPane(jTable),BorderLayout.CENTER);				
	}
	private void loadData() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/ls?useUnicode=true&characterEncoding=utf-8&useSSL=false","root", "123456");
			java.sql.Statement stat=conn.createStatement();
			String sql="select *from name";
			ResultSet rs=stat.executeQuery(sql);
			int i=0;
			while (rs.next()) {
				data[i][0]=rs.getString(1);
				data[i][1]=rs.getString(2);
				i++;
			}
			rs.close();
			conn.close();	
		} catch (Exception e) {		
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Select app=new Select();
		app.setSize(800,800);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);

	}
}
