package myUtil;
//ʵ�ֶ���Ŀ�¡

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.sql.rowset.serial.SerialArray;

public class MyUtil {

		private MyUtil() {
			
			throw new AssertionError();//�׳����쳣ָʾĳ������ʧ�ܡ�	
		}
//δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
//�����л�������������ͱ����ǿ����л��ġ�
//���л��ӿ�û�з������ֶΣ������ڱ�ʶ�����л�������
	public static <T extends Serializable> T clone(T obj) throws Exception{
		//ByteArrayOutputStream��ʵ����һ������������е����ݱ�д��һ�� byte���顣
		//���������������ݵĲ���д����Զ�������
		//��ʹ�� toByteArray() �� toString() ��ȡ���ݡ� 		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
	//ObjectOutputStream �� Java ����Ļ����������ͺ�ͼ��д�� OutputStream��
	//����ʹ�� ObjectInputStream ��ȡ���ع�������	
	//ֻ�ܽ�֧�� java.io.Serializable �ӿڵĶ���д������
	//writeObject �������ڽ�����д������
		ObjectOutputStream oos=new ObjectOutputStream(bout);
		
		oos.writeObject(obj);
		
	
		ByteArrayInputStream bin=new ByteArrayInputStream(bout.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bin);
		return (T) ois.readObject();
		
	}
		
		
}
