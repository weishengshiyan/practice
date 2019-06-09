package suanfa;
public  class TesThread {
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo r1=new RunnableDemo("thread-1" );
		Thread th1=new Thread(r1);
//		r1.run();
		th1.start();
		RunnableDemo r2=new RunnableDemo("thread-2");
//		r2.run();
		Thread th2=new Thread(r2);
		th2.start();
	}
	}
