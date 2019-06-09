package poker;

public class Poker {
	private static String[] suites= {"����", "����", "÷��", "����"};
	private static int[] faces= {1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private Card[] cards;
	public Poker() {
		cards=new Card[52];
		for (int i = 0; i < suites.length; i++) {
			for (int j = 0; j < faces.length; j++) {
				//i=0�����
				//cards[0]=(���ң�1),cards[12]=(���ң�13)
				//i=1�����
				//cards[i*13+0]=(���ң�1)
				//cards[14]=(���ң�2)
				cards[i*13+j]=new Card(suites[i], faces[j]);
				
			}
			
		}	
	}
/*
 * ϴ��
 */
	public void shuffle() {
		int len=cards.length;
		for (int i = 0; i < len; i++) {
			int index=(int) (Math.random()*len);
			//���������Ȼ���i���н����õ���ͬ��˳��
			Card temp=cards[index];
			cards[index]=cards[i];
			cards[i]=temp;
			
		}
	}
	
	/*
	 * ����   index ���Ƶ�λ��
	 */
	public Card deal(int index) {
		return cards[index];
	}
	
 public static   class  Card{
	 private   String suite ;
	 private int face;
	 
	 public Card(String suite,int face) {
		 this.suite=suite;
		 this.face=face;
		  
	 }
	 public String toString() {
		 String faceStr="";
		 switch (face) {
		case 1:
			faceStr="A";
			break;
		case 11:
			faceStr="J";
			break;
		case 12:
			faceStr="Q";
			break;
		case 13:
			faceStr="K";
			break;
		default:faceStr=String.valueOf(face);
			
		}
		 return suite+faceStr;
		 
		 
	 }
	 
	 
 }
}