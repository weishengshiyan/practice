package qunsuo;

import java.awt.im.InputContext;
import java.util.Scanner;



public class GetSubString extends InputContext{
	private static String startIndex;
	private static String onOfString;
	private static String sunString;
	private  String s;
	

	public void GetSubString() {
	Scanner s2=new Scanner(System.in);
	
	 System.out.print("���������startIndex��");
	 startIndex=s2.next();
	//System.out.print(startIndex);

	 
	 
	Scanner s3=new Scanner(System.in);	
	System.out.print("���������onofString��");
	onOfString=s3.next();
	// System.out.print(onOfString);
	
	 
		 Scanner s1=new Scanner(System.in);
		 System.out.print("�������sunString��ֵ");
		sunString=startIndex+s1.next()+onOfString;
		 System.out.println("�������sunString��ֵ��"+sunString);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		GetSubString ss=new GetSubString(); 
		ss.GetSubString();
		
		
		 
		
		
	}

}
