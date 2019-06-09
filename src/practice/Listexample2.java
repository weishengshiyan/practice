package practice;

import java.util.ArrayList;
import java.util.List;

public class Listexample2 {
/*
  	3、在一个列表中存储以下元素：
	apple,grape,banana,pear
 	3.1 返回集合中的最大的和最小的元素
 	3.2 将集合进行排序，并将排序后的结果打印在控制台上 [必做题
 	
 	如果输出最大的数应该m n s
 	m n 比较输出  最大的m    tem=m；
 	tem s 比较输出最大值      输出
 	输出最小值同上
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("grape");
		list.add("banana");
		list.add("pear");
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j <list.size()-i-1; j++) {
					
				if(list.get(j).compareTo(list.get(j+1))>0) {
						String tmp = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, tmp);	
						
					}
			}
			}
		
		
			System.out.print("排序后的顺序：");
	        for(int i = 0;i<list.size();i++){
	            System.out.print(list.get(i)+" ");
	        }
	        System.out.println();
	        System.out.println("集合中最大的元素是"+list.get(0));
	        System.out.println("集合中最小的元素是"+list.get(3));
	    }
	}

		

