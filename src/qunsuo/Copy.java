package qunsuo;

import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Array;

public class Copy {
//	private int countName=0;
//	private int index=0;
//	private int n;
//	private int leftcount=n;
	int n;
	
	
	//���������Ϊ�����false.�������еĶ���true.
	public  void  Copy() {
		
		
		Scanner s1=new Scanner(System.in);
		System.out.print("����������:");
		 n =s1.nextInt();
		 boolean arr[]=new boolean[n] ;
//		 boolean[] arr = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=true;
		}
		int leftcount = n;//����ֵ
        int countName = 0;//�ڼ�λ
        int index = 0;//�����λ��.
		while(leftcount>1) {
					
				if(arr[index]==true) {
					countName++;
					if(countName==3) {
						arr[index]=false;
						countName=0;
						leftcount--;
					}	
					}
		
					index++;
					
					if (index==n) {
						index=0;
					
				}	
		}
				
			for(int i=0;i<n;i++) {
				if(arr[i]==true) {
				System.out.print("���һλ��:"+(i+1));}
				
			}
			
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy c1=new Copy();
		c1.Copy();
	}

}
