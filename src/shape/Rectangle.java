package shape;

/*
 *  Rectangle��ʾ�����࣬�����������ԣ�
 *  Width��ʾ���ȡ�height��ʾ��ȣ�
 *  ��дgetPer��getArea��showAll����������
 *  ����������һ�����췽����һ����Ĭ�ϵġ�һ����Ϊ�߶ȡ���ȡ���ɫ��ֵ�ģ�
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
		 System.out.println("�þ��γ�Ϊ"+this.Width+
				 ",��Ϊ"+this.height+",�ܳ�Ϊ"+this.getPer()+
				 ",���Ϊ"+this.getArea()+",��ɫΪ"
				 +this.getColor());
		
	}
	

}
