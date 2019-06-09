package qunsuo;

public class Fanxiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int s=a.length;//0123"4"
		int i=0;
		while(i<s) {	
			System.out.print(a[s-1-i]);//0 1 2 3 四个长度到3
		i++;
			if (i==s) {
				break ;
			}
		}
		
}
}