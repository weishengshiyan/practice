package shape;

/*
 * 
 * Circle��ʾԲ�࣬����1�����ԣ�radius��ʾ�뾶����дgetPer��
 * getArea��showAll����������
 * �����������������췽����Ϊ�뾶����ɫ��ֵ�ģ���
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
		System.out.println("�뾶Ϊ"+this.radius+"��Բ,�ܳ�Ϊ"+this.getPer()+",���Ϊ"+this.getArea()+",��ɫΪ"+this.getColor());

	}
	
	

}
