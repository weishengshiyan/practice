package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listabc {
/*
 * �ӿ���̨�������ɸ����ʣ�����س����������뼯���У�����Щ��������󣨺��Դ�Сд����ӡ������ [ѡ����]
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<String>();
		 System.out.println("�����뵥�ʵ�����");
		 Scanner sc1=new Scanner(System.in);
		 int n=sc1.nextInt();
		 
		 System.out.println("��һ�������뵥��");
		 Scanner sc2=new Scanner(System.in);
		
		 for (int i = 0; i <n; i++) { 
			 list.add(sc2.next()); 
		 }
		 for (int j = 0; j <list.size(); j++) {
			for (int i = 0; i < list.size()-1-i; i++) {
			if(list.get(i).compareTo(list.get(i+1))>=0){		
			String tmp=list.get(i);
			list.set(i, list.get(i+1));
			list.set(i+1,tmp);}
			}
			
		 }
		for (int j = 0; j < list.size(); j++) {

			System.out.print("˳���Сλ"+list.get(j));
		}	
		}
			 
			 
			 
			 
		}
		
		 
		
	

