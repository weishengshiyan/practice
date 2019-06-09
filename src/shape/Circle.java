package shape;

/*
 * 
 * Circle表示圆类，增加1个属性，radius表示半径，重写getPer、
 * getArea和showAll三个方法，
 * 另外又增加两个构造方法（为半径、颜色赋值的）。
 * 
 */
public class Circle extends Shape{
	int radius;
	double pi=Math.PI;
	
	 public Circle() {
		// TODO Auto-generated constructor stub
	}
	 public  Circle(int radius,String color) {
		 super(color);
		 this.radius=radius;
	 }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		this.area=pi*radius*radius;
		return this.area;
	}

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		this.per=pi*radius*2;
		return this.per;
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		System.out.println("半径为"+this.radius+"的圆,周长为"+this.getPer()+",面积为"+this.getArea()+",颜色为"+this.getColor());

	}
	
	

}
