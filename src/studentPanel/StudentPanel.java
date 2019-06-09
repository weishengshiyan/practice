package studentPanel;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentPanel extends JLabel {
	

	JLabel noJLabel;
	JLabel nameJLabel;
	JLabel genderJLabel;
	JLabel birthJLabel;
	JLabel addresslLabel;
	JLabel teLabel;
	
	
	JTextField noField;
	JTextField nameField;
	JTextField genderField;
	JTextField birthField;
	JTextField addressField;
	JTextField telField;
	JButton button;
	
	 public StudentPanel() {
		 setGUIComponent(); 
		 button=new JButton();
		 
		 
		 //ceshiyixia 
	 }
	 public void setGUIComponent() {
		 noJLabel=new JLabel("学号");
		 noField=new JTextField(10);
		 
		 nameJLabel=new JLabel("姓名");
		 nameField=new JTextField(10);
		 
		 genderJLabel=new JLabel("性别");
		 genderField=new JTextField(10);
		 
		 birthJLabel=new JLabel("出生日期");
		 birthField=new JTextField("10");
		 
		 addresslLabel=new JLabel("家庭住址");
		 addressField=new JTextField(10);
		 
		 teLabel=new JLabel("电话");
		 telField=new JTextField(10);
		 //设置组件
		 this.setLayout(new GridLayout(3,4));
		 this.add(noField);
		 this.add(noJLabel);
		 this.add(nameField);
		 this.add(nameJLabel);
		 this.add(birthField);
		 this.add(birthJLabel);
		 this.add(genderField);
		 this.add(genderJLabel);
		 this.add(addressField);
		 this.add(addresslLabel);
		 this.add(teLabel);
		 this.add(telField);
		 this.setVisible(true);
		 this.setSize(300,300);
	 }
	 
	 public void clearContent() {    //设置清空
		 noField.setText("");
		 nameField.setText("");
		 genderField.setText("");
		 birthField.setText("");
		 telField.setText("");
		 addressField.setText("");
	 }
	 public void setNo(String no) {
		noField.setText(no);
	}
	 public void setName(String name) {
		 nameField.setText(name);
		
	}
	 public void setGender(String gender) {
		 genderField.setText(gender);
		
	}
	 public void setBirth(String birth) {
		 birthField.setText(birth);
		
	}
	 public void setAddress(String address) {
		 addressField.setText(address);
	 }

	 public void setTel(String tel) {
		 telField.setText(tel);
	}
	 
	public String getNo() {
		return noField.getText();
	}
	 
	 public String getName() {
		return  nameField.getText();

	}
	 public String getGender(){
		 return genderField.getText();
	 }
	 public String getBirth(){
		 return birthField.getText();
	 
 }
	 public String getAddress(){
		 return addressField.getText();
	 
	 
 }
	 public String getTel(){
		 return telField.getText();
	 
 }
	 
	 
	 public static void main(String[] args) {
		 	
	}


}
