package demo03;



import demo03.Memory.Zone;

public class Test {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Memory memory=new Memory();
			
			memory.showZones();
			memory.allocation(30);
			memory.showZones();
			memory.collection(0);
			memory.showZones();			
			
		
			
	}

}
