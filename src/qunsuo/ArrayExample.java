package qunsuo;


	import java.util.Scanner;
	 
	public class ArrayExample {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a[]=new int[10];
			for(int i =0;i<a.length;i++){
				a[i]=scan.nextInt();			
			}
			for(int i =0;i<a.length;i++){
				System.out.println(a[i]);			
			}
	 
		}
	}
