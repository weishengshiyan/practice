package extend_interface;

import java.util.jar.Attributes.Name;

public class Paytext {
	public static void main(String[] args) {
		employee ep= new employee();
		
		//String zhangsan;
		String gongzuo;
	
		//zhangsan="����";		
		gongzuo="��ˮ������";
		ep.setName("zhangsan");
		ep.setNumber(10001);
		ep.setWork(gongzuo);
		ep.setPay(1000);
		System.out.print("������˵��ܹ����ʣ�"+ep.getPay()+"���˹��ţ�"+ep.getNumber()+"����"+ep.getName());
		
		
		Invoice iv=new Invoice();
		String Name;
		String partDescrption;
	
		int quantity;
		Name="�㳦";
		partDescrption="ʳƷ";
	
		quantity=50;
		
		iv.setName(Name);
		
		iv.setPartDescrption(partDescrption);
		
		iv.setPrice(5000);
		
		iv.setQuantity(quantity);
		System.out.print("����㳦���ܼ۸�"+iv.getPrice()*iv.getQuantity());
		
		salar salar=new salar();
		salar.setSalerpay("wode");
		System.out.print(salar.toString());
	
			
			
	
		
	};
	
}

