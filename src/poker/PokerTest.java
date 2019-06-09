package poker;

import poker.Poker.Card;

public class PokerTest {
	public static void main(String[] args) {
	Poker	poker=new Poker();
	poker.shuffle();
	Card c1=poker.deal(0);
	//Card 就是非静态内部类，只能通过外部实体类Poker.Card来创建。
	
	Card c2=new Card("红心", 1);
	System.out.println(c1);
	System.out.println(c2);
	}

}
