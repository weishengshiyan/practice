package qunsuo;
/*50����վ��һȦ,Ȼ������3�ı����ĳ�ȥ 
 * ,��������ʣ����Ǹ���.
 * 
 */
import java.util.Scanner;

public class Outthree {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("�������ų�һȦ��������");//����
        int n = s.nextInt();
        
        boolean[] arr = new boolean[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        } // ���鸳ֵ����true

        int leftCount = n;//����ֵ
        int countNum = 0;//�ڼ�λ
        int index = 0;//�����λ��.
        while (leftCount > 1) {
        
            if (arr[index] == true) {
            	
                				countNum++;//λ��������
                			if (countNum == 3) {
                					countNum = 0;
                					arr[index] = false;
                					leftCount--;//�����ڼ���
                								}
            						}
            				index++;
            				
            				if (index == n) {
            					index = 0;
            				}
        						}
        for (int i = 0; i < n; i++) {
            if (arr[i] == true) {
                System.out.println("ԭ���ڵ�" + (i + 1) + "λ���������ˡ�");
            }
        }
    }
}

