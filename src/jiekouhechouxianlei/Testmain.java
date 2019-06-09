package jiekouhechouxianlei;

public class Testmain extends Text2 implements Test1{
	public static void main(String[] args) {
		
		Test1.Test1ceshi2();
		Testmain tsmain=new Testmain();
		tsmain.Test1ceshi1();
		tsmain.test2ceshi2();
		tsmain.Test3ceshi3();
		tsmain.setX(1);
		tsmain.setY(2);
		System.out.println("tsmain.setX(1);"+tsmain.getX());
		System.out.println("tsmain.setY(2);"+tsmain.getY());
		
	
	
		
		
		
		
	
}

	@Override
	public void Test1ceshi1() {
		// TODO Auto-generated method stub
		System.out.println("Test1ceshi1:"+777);
	}
}