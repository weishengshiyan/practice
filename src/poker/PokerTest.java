package poker;

import poker.Poker.Card;

public class PokerTest {
	public static void main(String[] args) {
	Poker	poker=new Poker();
	poker.shuffle();
	Card c1=poker.deal(0);
	//Card ���ǷǾ�̬�ڲ��ֻ࣬��ͨ���ⲿʵ����Poker.Card��������
	
	Card c2=new Card("����", 1);
	System.out.println(c1);
	System.out.println(c2);
	}

}
