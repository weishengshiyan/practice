package demo01;
//for(��ʼ��; �������ʽ; ����) {
//    //�������
//}
//���� for ѭ�������¼���˵����
//
//����ִ�г�ʼ�����衣��������һ�����ͣ����ɳ�ʼ��һ������ѭ�����Ʊ�����Ҳ�����ǿ���䡣
//Ȼ�󣬼�Ⲽ�����ʽ��ֵ�����Ϊ true��ѭ���屻ִ�С����Ϊfalse��ѭ����ֹ����ʼִ��ѭ����������䡣
//ִ��һ��ѭ���󣬸���ѭ�����Ʊ�����
//�ٴμ�Ⲽ�����ʽ��ѭ��ִ������Ĺ��̡�
//public class For {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		  for(int x = 10; x < 20; x ++) {
//		         System.out.print("value of x : " + x );
//		         System.out.print("\n");
//		      }
//		   }
//	}
//
class A {

    static {
        System.out.print("1");//
    }

    public A() {
        System.out.print("2");//
    }
}

class B extends A{

    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}



