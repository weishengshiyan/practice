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
			System.out.println("1出现的次数："+b+"\n2出现的次数："+c+"\n3出现的次数："+d+"\n4出现的次数："+e+"\n5出现的次数："+f+"\n6出现的次数："+m);
			
			int sum=6000;
			float gb=(float)b/sum;
			float gc=(float)c/sum;
			float gd=(float)c/sum;
			float ge=(float)c/sum;
			float gf=(float)c/sum;
			float gm=(float)c/sum;
			System.out.println(1 + "出现的概率是：" + gb);
			System.out.println(2 + "出现的概率是：" + gc);
			System.out.println(3 + "出现的概率是：" + gd);
			System.out.println(4 + "出现的概率是：" + ge);
			System.out.println(5 + "出现的概率是：" + gf);
			System.out.println(6 + "出现的概率是：" + gm);

	}	
	}
	
	
