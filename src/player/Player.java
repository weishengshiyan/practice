package player;
/*
 * 
 *  ����һ����Ա�࣬���Ҹ������ֻ������ʮһ��������ʾ���� static �� ��װ������ɡ� [������] 
��ͼ���£� 
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
