package qunsuo;

import java.util.Scanner;

public class Juxing {
	public static void main(String[] args) {
		//����a
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		Scanner s4=new Scanner(System.in);
//		Scanner s5=new Scanner(System.in);
//		Scanner s6=new Scanner(System.in);
//		Scanner s7=new Scanner(System.in);
//		Scanner s8=new Scanner(System.in);
		System.out.println("������a�������½�����:");
		int xa1=s1.nextInt();
		int ya1=s1.nextInt();//���Ͻ�����
		System.out.println("������a�������½�����:");
		int xa2=s2.nextInt();
		int ya2=s2.nextInt();//���½�����
	
		
		//����b
		System.out.println("������b�������Ͻ�����:");
		int xb1=s3.nextInt();
		int yb1=s3.nextInt();//���Ͻ�����
		System.out.println("������b�������½�����:");
		int xb2=s4.nextInt();
		int yb2=s4.nextInt();//���½�����
		
	
	
	int weightA=xa2-xa1;//a���εĿ�
	int highA=ya1-ya2;//a���еĸ�
	
	int weightB=xb2-xb1;//b���εĿ�
	int highB=yb1-yb2;//b���εĸ�
	
	int ax=weightA/2;
	int ay=highA/2;//a�����ĵ�����
	
	int bx=weightB/2;
	int by=highB/2;
	
	if (bx-ax<=(weightA+weightB)/2||by-ay<=(highA+highB)/2) {
		System.out.println("�����ཻ��");
		
		
	}else {
		System.out.println("����û���ཻ");
	}
	
		
		
		
	}
	}


