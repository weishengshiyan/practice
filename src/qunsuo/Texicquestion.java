package qunsuo;

import java.util.Scanner;

public class Texicquestion {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int time=sc.nextInt();
		int ins=sc.nextInt();
		double pay = 0;
		if(0<time&&time<24) {
		if(time>=6&&time<=21) {
			if(ins<2) {
				pay=6+1;
			}else {
				pay= (ins-2)*1.5+6+1;
			
			}
		}
			else  if(time>22&&time<24&0<time&&time<=5) {
				if(ins<2) {
					pay=7+1;
				}else {
					pay=(ins-2)*1.5+7+1;
				}
			}
			
		}
		System.out.println(pay);	
		}
	
	}
	


