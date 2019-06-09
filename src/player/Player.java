package player;
/*
 * 
 *  创建一个球员类，并且该类最多只允许创建十一个对象。提示利用 static 和 封装性来完成。 [必做题] 
类图如下： 
 * 
 */
public class Player {
	 int num;
	static int sum;
	private  Player(){
		sum++;
	}
	
	public  static Player create(int num) {
		 Player p=null;
		if (sum<num) {
			p=new Player();	
		}else {
			p=null;
		}
		return p;	
	}
	
	
	
	

}
