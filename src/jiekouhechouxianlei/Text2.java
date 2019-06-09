package jiekouhechouxianlei;

abstract class Text2  {
	private int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	private int y;
	
	private  void test2ceshi1() {
			System.out.println("test2ceshi1:"+55);	
		
	}
	public  void test2ceshi2() {
		test2ceshi1();
		System.out.println("test2ceshi2:"+23333);
	}
	protected void Test3ceshi3() {
		System.out.println("test3ceshi3:"+65454);
	}



	
	}

