package myUtil;

public class CloneTest {
	public static void main(String[] args) {
		 try {
	            Person p1 = new Person("Hao LUO", 33, new Car("Benz", 300));
	            Person p2 = MyUtil.clone(p1);   // ��ȿ�¡
	            p2.getCar().setBrand("BYD");
	            // �޸Ŀ�¡��Person����p2���������������Ʒ������
	            // ԭ����Person����p1���������������ܵ��κ�Ӱ��
	            // ��Ϊ�ڿ�¡Person����ʱ���������������Ҳ����¡��
	            System.out.println(p1);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}

