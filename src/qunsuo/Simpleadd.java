package qunsuo;

import java.util.Scanner;

public class Simpleadd {
	private  int  i;
	private  int  n,n2;
	private  int  sum0=0,sum1=0,sum3=0;
	
	
	public  void Simpleadd() {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if (n>0) {
			
//		if((n+1-i)%2==1) {
//			System.out.print("输出的n+1-i:"+(n+1-i));
			for (int i = 0; i < n; i++) {
				if((n-i)%2==1) {
//		System.out.print(n+1-i+"奇数");
			sum0=sum0+(n-i);
			
			}
				else {
//					System.out.print(n+1-i+"偶数");
				sum1=sum1+(n-i);
					
				}
			}
			
			
		}
		
		
	//	else {			
//				sum1=sum1+(n+1-i);
//				System.out.print("偶数");
				
			
			
//		}
//			}else {
//			System.out.print("请输入大于0的整数");}
		sum3=sum0-sum1;
		System.out.println(sum0);
		System.out.println(sum1);
		System.out.println(sum3);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simpleadd add= new Simpleadd();
		add.Simpleadd();
		

	}

}
