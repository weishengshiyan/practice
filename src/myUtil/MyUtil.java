package myUtil;
//实现对象的克隆

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.sql.rowset.serial.SerialArray;

public class MyUtil {

		private MyUtil() {
			
			throw new AssertionError();//抛出该异常指示某个断言失败。	
		}
//未实现此接口的类将无法使其任何状态序列化或反序列化。
//可序列化类的所有子类型本身都是可序列化的。
//序列化接口没有方法或字段，仅用于标识可序列化的语义
	public static <T extends Serializable> T clone(T obj) throws Exception{
		//ByteArrayOutputStream类实现了一个输出流，其中的数据被写入一个 byte数组。
		//缓冲区会随着数据的不断写入而自动增长。
		//可使用 toByteArray() 和 toString() 获取数据。 		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
	//ObjectOutputStream 将 Java 对象的基本数据类型和图形写入 OutputStream。
	//可以使用 ObjectInputStream 读取（重构）对象	
	//只能将支持 java.io.Serializable 接口的对象写入流中
	//writeObject 方法用于将对象写入流中
		ObjectOutputStream oos=new ObjectOutputStream(bout);
		
		oos.writeObject(obj);
		
	
		ByteArrayInputStream bin=new ByteArrayInputStream(bout.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bin);
		return (T) ois.readObject();
		
	}
		
		
}
