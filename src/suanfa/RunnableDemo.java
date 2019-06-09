package suanfa;

//import extend_interface.salar;

class RunnableDemo implements Runnable{
	private Thread t;
	private String ThreadName;
//	private	String name;//本来是写在了要返回的
	
	public RunnableDemo(String name) {
		
		ThreadName=name;
		System.out.print("create"+ThreadName);
		
	}
	
	

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running"+ThreadName);
	try {
		for (int i = 4; i >0; i--) {
			System.out.println("Thread: "+ThreadName+","+i);
			Thread.sleep(50);
			
			
		}
		
	} catch (InterruptedException e) {
		System.out.println("Thread"+ThreadName+"interrupted");
		
		// TODO: handle exception
	}
	System.out.println("Thread"+ThreadName+"exiting");
		
	}
	public void start() {
		System.out.println("Starting:"+ThreadName);
		if (t==null) {
			t=new Thread(this.ThreadName);
			t.start();
		}
		}
}
	



