package player;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入创建数量");
		Scanner sc=new Scanner(System.in);
		int num	=sc.nextInt();
		
		Player p;
		
		
		while (true) {
			  p = Player.create(num);
			if (p!=null) {
				System.out.println("创建了"+Player.sum+"球员。");
			}else {
				System.out.println("一共创建了"+num+"球员,不能在创建了。");
				break;
			}
			
		}
		
		
		

	}

}
