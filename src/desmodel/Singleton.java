//����д�����̲߳���ȫ��
//package desmodel;
//
//public class Singleton {
//public static Singleton  singleton;
//
//private Singleton() {
//
//		}
//public static  Singleton getInstance() {
//	if (singleton==null) {
//		singleton=new Singleton();
//	
//	}
//	return singleton;
//}
//}

//����д�����̰߳�ȫ

//public class Singleton {  
//   private static Singleton instance;  
//   private Singleton (){}  
//   public static synchronized Singleton getInstance() {  
//   if (instance == null) {  
//       instance = new Singleton();  
//   }  
//   return instance;  
//   }  
//}

//����ʽд��
//
//public class Singleton {  
//   private static Singleton instance = new Singleton();  
//   private Singleton (){}  
//   public static Singleton getInstance() {  
//   return instance;  
//   }  
//}

//��̬�ڲ���

//public class Singleton {  
//   private static class SingletonHolder {  
//   private static final Singleton INSTANCE = new Singleton();  
//   }  
//   private Singleton (){}  
//   public static final Singleton getInstance() {  
//   return SingletonHolder.INSTANCE;  
//   }  
//}








