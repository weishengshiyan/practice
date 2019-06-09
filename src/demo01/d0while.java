package demo01;
//do{
//		语句
//	}while(boolean)
//	
//布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行了。
//如果布尔表达式的值为 true，则语句块一直执行，直到布尔表达式的值为 false。
//
public class d0while {
	public static void main(String[] args) {
		int i=10;
		int sum=0;
		do {
			System.out.println(i);
			i++;
			sum+=i;
		
			
		}while(i<=20);
		System.out.println(sum);
	}

}
