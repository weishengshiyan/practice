package demo01;

import java.util.Random;
import java.util.Scanner;

public class Question3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int b[];
		int i=0;
		int j[];
		int m=0;
		a=new int[6];
		b=new int[6];
		j=new int[8];
		
		Random  r=new Random();
		Scanner s=new Scanner(System.in);
		  j[m]= s.nextInt();
		  
		  if(j[m]==0) {
		a[i]=r.nextInt(6);
		b[i]=r.nextInt(6);
				
		System.out.print("第一个骰子： "+a[i]+" ");
		System.out.print("   第二个骰子： "+b[i]);	
		int c=a[i]+b[i];
		System.out.print("   两个骰子的和为： "+c+"    判断：");
		
		
		
		if(c==7 || c==11) {
			System.out.print("赢了");
		}
		else if (c==2||c==7||c==12) {
			System.out.print("输了");	
		}
		System.out.print("");
			
		}
		  else {
			  
			
		}
	}
		
		
		
		}
	



