package qunsuo;
/*50个人站成一圈,然后数到3的倍数的出去 
 * ,输出到最后剩余的那个人.
 * 
 */
import java.util.Scanner;

public class Outthree {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入排成一圈的人数：");//输入
        int n = s.nextInt();
        
        boolean[] arr = new boolean[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        } // 数组赋值都是true

        int leftCount = n;//数量值
        int countNum = 0;//第几位
        int index = 0;//不变的位置.
        while (leftCount > 1) {
        
            if (arr[index] == true) {
            	
                				countNum++;//位数在自增
                			if (countNum == 3) {
                					countNum = 0;
                					arr[index] = false;
                					leftCount--;//数量在减少
                								}
            						}
            				index++;
            				
            				if (index == n) {
            					index = 0;
            				}
        						}
        for (int i = 0; i < n; i++) {
            if (arr[i] == true) {
                System.out.println("原排在第" + (i + 1) + "位的人留下了。");
            }
        }
    }
}

