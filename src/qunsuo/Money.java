package qunsuo;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		int n=7;
		int a[]= {100,50,20,10,5,2,1};
		Scanner ss=new Scanner(System.in);			
		int sum=ss.nextInt();
		int tes=0;
		int num[]=new int[n];
		for (int i = 0,res=sum; i < n; i++) {
			num[i]=res/a[i];
			res-=num[i]*a[i];
			tes+=num[i];
		}
		String s=sum+"=";
		for (int j= 0; j< n; j++) {
			if (num[j]>0) {
				s=s+a[j]+"*"+num[j]+"+";
				
			}	
		}
		s=s.substring(0,s.lastIndexOf("+"));
		System.out.println("纸币组合："+s);
		System.out.println("张数："+tes);
	}

}
