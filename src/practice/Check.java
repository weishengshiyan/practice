package practice;

import java.util.Scanner;

/*
 * ����һ���ַ����ֱ�ͳ�Ƴ���Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
 */
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int zimu=0;
		int kongge=0;
		int qita=0;
		Scanner sc1=new Scanner(System.in);
		System.out.print("������һ���ַ���");
		String str1=sc1.nextLine();
		char[] ch=str1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>=48&&ch[i]<=59) {
				num++;	
			}else if ((ch[i]>=65&&ch[i]<=90)||(ch[i]>=97&&ch[i]<=122)){
				zimu++;
				}
				else if(ch[i]==32) {
					kongge++;	
			}else {
				qita++;
				
			}	
		}
		
			System.out.print("���֣�"+num);
			System.out.print("��ĸ��"+zimu);	
			System.out.print("�ո�"+kongge);
			System.out.print("������"+qita);
	}

}
