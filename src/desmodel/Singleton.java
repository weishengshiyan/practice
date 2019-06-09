//基础写法：线程不安全：
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

//懒汉写法：线程安全

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

//饿汉式写法
//
//public class Singleton {  
//   private static Singleton instance = new Singleton();  
//   private Singleton (){}  
//   public static Singleton getInstance() {  
//   return instance;  
//   }  
//}

//静态内部类

//public class Singleton {  
//   private static class SingletonHolder {  
//   private static final Singleton INSTANCE = new Singleton();  
//   }  
//   private Singleton (){}  
//   public static final Singleton getInstance() {  
//   return SingletonHolder.INSTANCE;  
//   }  
//}








