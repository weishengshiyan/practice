package demo02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GradientPaint;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.util.logging.Handler;

import javax.naming.spi.DirStateFactory.Result;
import javax.sql.CommonDataSource;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;
public class Jisuanqi extends JFrame implements ActionListener{
//	 private final String[] KEYS = { "7", "8", "9", "/", "sqrt", "4", "5", "6",
//	            "*", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };
//	    /** 计算器上的功能键的显示名字 */
//    private final String[] COMMAND = { "Backspace", "CE", "C" };
//	    /** 计算器左边的M的显示名字 */
//	    private final String[] M = { " ", "MC", "MR", "MS", "M+" };
//	    /** 计算器上键的按钮 */
//	    private JButton keys[] = new JButton[KEYS.length];
//	    /** 计算器上的功能键的按钮 */
//	    private JButton commands[] = new JButton[COMMAND.length];
//	    /** 计算器左边的M的按钮 */
//	    private JButton m[] = new JButton[M.length];
//	    /** 计算结果文本框 */
//	    private JTextField resultText = new JTextField("0");
//	 
//	    // 标志用户按的是否是整个表达式的第一个数字,或者是运算符后的第一个数字
	    private boolean firstDigit = true;
//	    // 计算的中间结果。
	    private double resultNum = 0.0;
//	    // 当前运算的运算符
	    private String operator = "=";
//	    // 操作是否合法
	    private boolean operateValidFlag = true;
		
		private JTextField resultset=new JTextField("0");
//		JTextField resultset=new JTextField("0");
		private final String key[]= {"7", "8", "9", "/", "sqrt", "4", "5", "6",
            "*", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };
		private JButton keys[] =new JButton[key.length];
	
	
		private String[]  m= {" ", "MC", "MR", "MS", "M+" };
		private JButton ms[] =new JButton[m.length];
	
		private String[]  common= {"Backspace", "CE", "C"};
		private JButton commons[] =new JButton[common.length];
		
		
	public Jisuanqi() {
			// TODO Auto-generated constructor stub
		super();
		JButton jButton=new JButton("2");
		init();
		
		
		this.setBackground(Color.DARK_GRAY);
		this.setTitle("计算器");
		this.setResizable(false);
		 this.setLocation(500, 300);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);	
		this.pack();

		
	}
		
	
	
	
	
	
	
	private void init() {
			
		//结果文本。
		// TODO Auto-generated method stub
		
		resultset.setHorizontalAlignment(JTextField.RIGHT);
		resultset.setBackground(Color.white);
		resultset.setEditable(false);
		
		
		//数字
		JPanel jp1=new JPanel();
		jp1.setLayout(new GridLayout(4, 5, 3, 3));
		
		for (int i = 0; i < key.length; i++) {
			keys[i] =new JButton(key[i]);
			jp1.add(keys[i]);
			keys[i].setForeground(Color.blue);	
			
        }
			keys[3].setForeground(Color.red);
			keys[8].setForeground(Color.red);
			keys[13].setForeground(Color.red);
			keys[18].setForeground(Color.red);
			keys[19].setForeground(Color.red);	
		
			
			
			//backsspace ce  c 按钮
			JPanel jp2=new JPanel();
			jp2.setLayout(new GridLayout(1,3,3,3));
			jp2.setBackground(Color.black);
			
			
		for (int i = 0; i <common.length; i++) {
			commons[i]=new JButton(common[i]);
			commons[i].setForeground(Color.RED);
			jp2.add(commons[i]);
		}
		
		
		
		
		JPanel jp3=new JPanel();
		jp3.setLayout(new GridLayout(5,1,3,3));
		jp3.setBackground(Color.black);
		
	for (int i = 0; i <m.length; i++) {
		ms[i]=new JButton(m[i]);
		ms[i].setForeground(Color.RED);
		jp3.add(ms[i]);		
}
	//整体布局
	JPanel all=new JPanel();
		all.setLayout(new BorderLayout(3,3));
		all.add("North",jp2);
		all.add("Center",jp1);
		
	JPanel ta= new JPanel();
		ta.setLayout(new BorderLayout());
	 	ta.add("Center",resultset);
	 	
	 	this.getContentPane().setLayout(new BorderLayout(3,5));
	 	this.getContentPane().add("North",ta);
	 	this.getContentPane().add("Center",all);
	 	this.getContentPane().add("West",jp3);
	 	//布局已经做成，剩下的就是写监听。	
	 	//key=KEYS   command=common  m=m
	
	 	
	 	
	 	
	 	
	 	
	 	for( int i=0;i<key.length;i++) {
	 		//被监听者放到前面（通常是实现了接口的类的子类和本身的组件）
	 		//被监听者.addlistenter(监听者)
	 		keys[i].addActionListener(this);
	 	}
	 		for (int i = 0; i < common.length; i++) {
				commons[i].addActionListener(this);
	 		}
				for (int i = 0; i < m.length; i++) {
					ms[i].addActionListener(this);
				}
			}

//command 中的组件
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String label=e.getActionCommand();
		if(label.equals(common[0])) {
			handleBackspace();
		}
		else if (label.equals(common[1])) {
			resultset.setText("0");
			
		}
		else if (label.equals(common[2])) {
			HandlerC();
			
		}
		else if ("0123456789.".indexOf(label) >= 0) {
            // 用户按了数字键或者小数点键
            handleNumber(label);
            // handlezero(zero);
        } else {
            // 用户按了运算符键
            config(label);
        }
		}
	
	
	
	 private void handleNumber(String key) {
	        if (firstDigit) {
	            // 输入的第一个数字
	            resultset.setText(key);
	        } else if ((key.equals(".")) && (resultset.getText().indexOf(".") < 0)) {
	            // 输入的是小数点，并且之前没有小数点，则将小数点附在结果文本框的后面
	            resultset.setText(resultset.getText() + ".");
	        } else if (!key.equals(".")) {
	            // 如果输入的不是小数点，则将数字附在结果文本框的后面
	            resultset.setText(resultset.getText() + key);
	        }
	        // 以后输入的肯定不是第一个数字了
	        firstDigit = false;
	    }
	
	
	//处理backspace被按下
	private  void  handleBackspace() {
		
		String text = resultset.getText();
		int i=text.length();
		if(i>0) {
			text=text.substring(0,i-1);
			if(text.length()==0) {
				resultset .setText("0");
				 firstDigit = true;
				 operator="=";
			}
			else {
				resultset.setText(text);
			}
		}
	}
	//按下c
	private void HandlerC() {
		// TODO Auto-generated method stub
		resultset.setText("0");
		firstDigit=true;
		operator="=";
		
	}
	
	
	private void config(String key) {
		// TODO Auto-generated method stub
		if(operator.equals("+")) {
			
			resultNum +=getNumberFromText();
		}
		else if(operator.equals("-")) {
			resultNum -=getNumberFromText();
		}
		else if (operator.equals("*")) {
				resultNum *=getNumberFromText();
			}
		else if(operator.equals("+/-")){
			resultNum=resultNum*-1;
		}
		else if (operator.equals("sqrt")) {
//			resultNum=resultNum*resultNum;
			resultNum=Math.sqrt(resultNum);
			
		}
		else if (operator.equals("%")) {
			resultNum=resultNum/100;
		}
		else if(operator.equals("=")) {
			resultNum=getNumberFromText();
		}
		else if (operator.equals("/")) {
			if(getNumberFromText() ==0) {
			operateValidFlag=false;
			resultset.setText("除数不能为0");}
			else {
				resultNum /=getNumberFromText();	
			}
		}
			else if (operator.equals("1/x")) {
	            // 倒数运算
	            if (resultNum == 0.0) {
	                // 操作不合法
	                operateValidFlag = false;
	                resultset.setText("零没有倒数");
	            } else {
	                resultNum = 1 / resultNum;
	            }
			}
	            if (operateValidFlag) {
	                // 双精度浮点数的运算
	                long t1;
	                double t2;
	                t1 = (long) resultNum;
	                t2 = resultNum - t1;
	                if (t2 == 0) {
	                    resultset.setText(String.valueOf(t1));
	                } else {
	                    resultset.setText(String.valueOf(resultNum));
	                }
	            }
	            // 运算符等于用户按的按钮
	            operator = key;
	            firstDigit = true;
	            operateValidFlag = true;
	        }
		
	
	
	
	private double getNumberFromText(){
		double result=0;
		try {
			result=Double.valueOf(resultset.getText()).doubleValue();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
		
		
	}
	
	
	public static void main(String[] args) {
		Jisuanqi js= new Jisuanqi();
		
        js.setVisible(true);
        js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
