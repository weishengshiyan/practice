package player;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����봴������");
		Scanner sc=new Scanner(System.in);
		int num	=sc.nextInt();
		
		Player p;
		
		
		while (true) {
			  p = Player.create(num);
			if (p!=null) {
				System.out.println("������"+Player.sum+"��Ա��");
			}else {
				System.out.println("һ��������"+num+"��Ա,�����ڴ����ˡ�");
				break;
			}
			
		}
		
		
		

	}

}
