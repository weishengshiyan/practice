package qunsuo;

import java.util.Scanner;

public class Joshu {
	public static void main(String[] args) {
		
		System.out.print("数组元素个数:");
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		int [] a=new int[n];
		System.out.print("数组元素:");
		Scanner sc2=new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i]=sc2.nextInt();	
		}
		
//		int[]  a= {1,2,3,45,78,6,22,45,12};
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				System.out.print(a[i]+" ");		
		}	
			
		}
//		System.out.println(" ");
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.print(a[i]+" ");		
		}	
		}
	}
}
