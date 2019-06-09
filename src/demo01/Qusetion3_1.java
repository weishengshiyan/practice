package demo01;

import java.awt.print.Printable;
import java.util.Scanner;

public class Qusetion3_1 {

	public static void main(String  args[]) {
		int max = 0;
		int mid =0;
		int min =0;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a");
		int a=scan.nextInt();
		System.out.print("Enter b");
		int b=scan.nextInt();
		System.out.print("Enter a");
		int c=scan.nextInt();

		
	if(a>b&&a>c) {
		 max=a;}
	else if (b>c&&b>a) {
		max=b;}
	else if (c>a&&c>b) {
		max=c;
	}
	
if(a>b&&a<c  ||  c<a&&a<b) {
	 mid=a;}
else if (b>c&&b<a || c>b&&a<b  ) {
	mid=b;}
else if (c>a&&c<b  ||  a>c&&b<c) {
	mid=c;
}

if(a<b&&a<c) {
 min=a;}
else if (b<c&&b<a ) {
min=b;}
else if (c<a&&c<b) {
min=c;
}
	System.out.println(" max:"+max+"\n mid:"+mid+"\n min:"+min);
	
		
	}
	}
	
	