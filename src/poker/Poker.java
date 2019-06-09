package poker;

public class Poker {
	private static String[] suites= {"黑桃", "红桃", "梅花", "方块"};
	private static int[] faces= {1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private Card[] cards;
	public Poker() {
		cards=new Card[52];
		for (int i = 0; i < suites.length; i++) {
			for (int j = 0; j < faces.length; j++) {
				//i=0输出：
				//cards[0]=(黑桃，1),cards[12]=(黑桃，13)
				//i=1输出：
				//cards[i*13+0]=(红桃，1)
				//cards[14]=(红桃，2)
				cards[i*13+j]=new Card(suites[i], faces[j]);
				
			}
			
		}	
	}
/*
 * 洗牌
 */
	public void shuffle() {
		int len=cards.length;
		for (int i = 0; i < len; i++) {
			int index=(int) (Math.random()*len);
			//生成随机数然后和i进行交换得到不同的顺序。
			Card temp=cards[index];
			cards[index]=cards[i];
			cards[i]=temp;
			
		}
	}
	
	/*
	 * 发牌   index 发牌的位置
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