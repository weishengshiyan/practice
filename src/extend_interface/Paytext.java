package extend_interface;

import java.util.jar.Attributes.Name;

public class Paytext {
	public static void main(String[] args) {
		employee ep= new employee();
		
		//String zhangsan;
		String gongzuo;
	
		//zhangsan="张三";		
		gongzuo="下水道工人";
		ep.setName("zhangsan");
		ep.setNumber(10001);
		ep.setWork(gongzuo);
		ep.setPay(1000);
		System.out.print("输出工人的总共工资："+ep.getPay()+"工人工号："+ep.getNumber()+"姓名"+ep.getName());
		
		
		Invoice iv=new Invoice();
		String Name;
		String partDescrption;
	
		int quantity;
		Name="香肠";
		partDescrption="食品";
	
		quantity=50;
		
		iv.setName(Name);
		
		iv.setPartDescrption(partDescrption);
		
		iv.setPrice(5000);
		
		iv.setQuantity(quantity);
		System.out.print("输出香肠的总价格"+iv.getPrice()*iv.getQuantity());
		
		salar salar=new salar();
		salar.setSalerpay("wode");
		System.out.print(salar.toString());
	
			
			
	
		
	};
	
}

