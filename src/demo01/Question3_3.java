package demo01;

import java.util.Random;


public class Question3_3 {
	final static int maxtime=6000;
	public static  void main(String[] args) {
	Random r=new Random();
		int a[];
	
		
		a=new int[maxtime];
		for (int i = 0; i < maxtime; i++) 
			 a[i] =r.nextInt(6)+1;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		int m=0;
			for (int i = 0; i < a.length; i++) {
				
			if(a[i]==1) {
				b++;
		}
			else if(a[i]==2) {
				c++;		
		}
		
			else if(a[i]==3) {
				d++;
		}
		
			else if(a[i]==4) {
				e++;
		}
		
			else if(a[i]==5) {
				f++;
		}
		
			else if(a[i]==6) {
				m++;
		}	
	}
			System.out.println("1���ֵĴ�����"+b+"\n2���ֵĴ�����"+c+"\n3���ֵĴ�����"+d+"\n4���ֵĴ�����"+e+"\n5���ֵĴ�����"+f+"\n6���ֵĴ�����"+m);
			
			int sum=6000;
			float gb=(float)b/sum;
			float gc=(float)c/sum;
			float gd=(float)c/sum;
			float ge=(float)c/sum;
			float gf=(float)c/sum;
			float gm=(float)c/sum;
			System.out.println(1 + "���ֵĸ����ǣ�" + gb);
			System.out.println(2 + "���ֵĸ����ǣ�" + gc);
			System.out.println(3 + "���ֵĸ����ǣ�" + gd);
			System.out.println(4 + "���ֵĸ����ǣ�" + ge);
			System.out.println(5 + "���ֵĸ����ǣ�" + gf);
			System.out.println(6 + "���ֵĸ����ǣ�" + gm);

	}	
	}
	
	
