package qunsuo;

import java.util.Scanner;

public class Juxing {
	public static void main(String[] args) {
		//矩形a
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		Scanner s4=new Scanner(System.in);
//		Scanner s5=new Scanner(System.in);
//		Scanner s6=new Scanner(System.in);
//		Scanner s7=new Scanner(System.in);
//		Scanner s8=new Scanner(System.in);
		System.out.println("请输入a矩形左下角坐标:");
		int xa1=s1.nextInt();
		int ya1=s1.nextInt();//左上角坐标
		System.out.println("请输入a矩形右下角坐标:");
		int xa2=s2.nextInt();
		int ya2=s2.nextInt();//右下角坐标
	
		
		//矩形b
		System.out.println("请输入b矩形左上角坐标:");
		int xb1=s3.nextInt();
		int yb1=s3.nextInt();//左上角坐标
		System.out.println("请输入b矩形右下角坐标:");
		int xb2=s4.nextInt();
		int yb2=s4.nextInt();//右下角坐标
		
	
	
	int weightA=xa2-xa1;//a矩形的宽
	int highA=ya1-ya2;//a举行的高
	
	int weightB=xb2-xb1;//b矩形的宽
	int highB=yb1-yb2;//b矩形的高
	
	int ax=weightA/2;
	int ay=highA/2;//a的中心点坐标
	
	int bx=weightB/2;
	int by=highB/2;
	
	if (bx-ax<=(weightA+weightB)/2||by-ay<=(highA+highB)/2) {
		System.out.println("矩形相交了");
		
		
	}else {
		System.out.println("矩形没有相交");
	}
	
		
		
		
	}
	}


