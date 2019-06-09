package suanfa;
public class ThreadClassDemo{
	public static void main(String [] args) {
//    Runnable hello = new DisplayMessage("Hello");
//    Thread thread1 = new Thread(hello);
//    thread1.setDaemon(true);
//    thread1.setName("hello");
//    System.out.println("Starting hello thread...");
//    thread1.start();
//    
//    Runnable bye = new DisplayMessage("Goodbye");
//    Thread thread2 = new Thread(bye);
//    thread2.setPriority(Thread.MIN_PRIORITY);
//    thread2.setDaemon(true);
//    System.out.println("Starting goodbye thread...");
//    thread2.start();
//
//    System.out.println("Starting thread3...");
//    Thread thread3 = new GuessANumber(27);
//    thread3.start();
//    try {
//       thread3.join();
//    }catch(InterruptedException e) {
//       System.out.println("Thread interrupted.");
//    }
//    System.out.println("Starting thread4...");
//    Thread thread4 = new GuessANumber(75);
//    
//    thread4.start();
//    System.out.println("main() is ending...");
// }
//}
//		  自己写一遍理解。
//		第一个message
		Runnable run1=new DisplayMessage("hello");
		Thread thread1=new Thread(run1);
		thread1.setDaemon(true);
//		thread1.setName("hello");
		thread1.start();
		
//		第二个message
		Runnable run2=new DisplayMessage("goodbye");
		Thread thread2=new Thread(run2);
		thread2.setDaemon(true);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.start();
		
		
//		第一个guess
	Thread thread3=new GuessANumber(20);
	try {
		thread3.join();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	thread3.start();
	
	Thread thread4=new GuessANumber(30);
	try {
		thread4.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	thread4.start();
//		第二个guess
		
		
		
	}
	}