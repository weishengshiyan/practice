package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listabc {
/*
 * 从控制台输入若干个单词（输入回车结束）放入集合中，将这些单词排序后（忽略大小写）打印出来。 [选做题]
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<String>();
		 System.out.println("请输入单词的数量");
		 Scanner sc1=new Scanner(System.in);
		 int n=sc1.nextInt();
		 
		 System.out.println("请一次性输入单词");
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

			System.out.print("顺序大小位"+list.get(j));
		}	
		}
			 
			 
			 
			 
		}
		
		 
		
	

