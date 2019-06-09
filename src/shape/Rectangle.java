package shape;

/*
 *  Rectangle表示矩形类，增加两个属性，
 *  Width表示长度、height表示宽度，
 *  重写getPer、getArea和showAll三个方法，
 *  另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）
 * 
 * 
 */
public class Rectangle extends Shape {
		
		int Width;
		int height;
		
	public Rectangle() {
		
	}
	public Rectangle(int Width,int height,String color ) {
		this.color=color;//super(color);
		this.Width=Width;
		this.height=height;
	
		
	}
	
	
	
	

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		this.area=height*Width;
		
		return this.area;
	}

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		this.per=(height+Width)*2;
		
		return this.per;
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		 System.out.println("该矩形长为"+this.Width+
				 ",宽为"+this.height+",周长为"+this.getPer()+
				 ",面积为"+this.getArea()+",颜色为"
				 +this.getColor());
		
	}
	

}
