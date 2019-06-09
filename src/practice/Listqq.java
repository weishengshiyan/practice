package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;

public class Listqq {

	public static void main(String[] args) {
		List<student> list = new ArrayList<student>();
		list.add(new student(12, 23));
		list.add(new student(14, 26));
		list.add(new student(11, 21));
		list.add(new student(10, 03));
		list.add(new student(14, 6));

		Collections.sort(list, new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {

				return o1.getB() - o2.getB();
			}
		});
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getA()+"  "+list.get(i).getB());
		}
	}

}

class student {
	int a;
	int b;

	public student(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
