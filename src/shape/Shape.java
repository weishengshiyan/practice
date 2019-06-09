package shape;
/*
 *  ���Shape��ʾͼ���࣬
 *  ���������area���ܳ�����per����ɫ����color��
 *  ���������췽����һ����Ĭ�ϵġ�һ����Ϊ��ɫ��ֵ�ģ���
 *  ����3�����󷽷���
 *  �ֱ��ǣ�getArea���������getPer�����ܳ���
 *  showAll���������Ϣ��
 *  ����һ������ɫ�ķ���getColor��
 * 
 */
		public abstract class Shape {
			//������������
		     double area;
		     double per;
		     String color;


		     //�������췽��
		     public Shape(){

		     }

		     public Shape(String color){
		         this.color = color;
		     }

		     //�������󷽷�
		     public abstract double getArea();
		     public abstract double getPer();
		     public abstract void showAll();
		     //��������ɫ
		     public String getColor(){
		         return this.color;
		     }


		}

