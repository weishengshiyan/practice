package practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
/*
 * 5个数list数组便利输出。
 */
public class Listexample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> interator =list.iterator();
//		Iterator<Integer> it = list.iterator();
		while(interator.hasNext()) {
			System.out.println(interator.next());
	
		}
//		for (int i = 0; i < list.size(); i++) {
//			if (i==2) {
//				list.remove(i);		
//			}
//			System.out.println(list.get(i));
//		
//		}
		for(Integer i:list) {//增强for循环。  for(元素类型+ i : 数组或集合对象) {
//            									System.out.println(i);
//      											 }
			System.out.println(i);
			
		}
		
		
	}

}
