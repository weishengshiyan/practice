package practice;

import java.util.ArrayList;
import java.util.List;

public class Listexample2 {
/*
  	3����һ���б��д洢����Ԫ�أ�
	apple,grape,banana,pear
 	3.1 ���ؼ����е����ĺ���С��Ԫ��
 	3.2 �����Ͻ������򣬲��������Ľ����ӡ�ڿ���̨�� [������
 	
 	������������Ӧ��m n s
 	m n �Ƚ����  ����m    tem=m��
 	tem s �Ƚ�������ֵ      ���
 	�����Сֵͬ��
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
		
		
			System.out.print("������˳��");
	        for(int i = 0;i<list.size();i++){
	            System.out.print(list.get(i)+" ");
	        }
	        System.out.println();
	        System.out.println("����������Ԫ����"+list.get(0));
	        System.out.println("��������С��Ԫ����"+list.get(3));
	    }
	}

		

