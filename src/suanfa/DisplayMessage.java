package suanfa;

public class DisplayMessage implements Runnable {
	   private String message;
	   
	   public DisplayMessage(String message) {
	      this.message = message;
	   }
	   
	   public void run() {
		   while(true) {
	         System.out.println(message);
		   }
	   }
	   public static void main(String[] args) {
		   DisplayMessage dis1=new DisplayMessage("Ïß³Ì");
		   dis1.run();
		   
	}
	}