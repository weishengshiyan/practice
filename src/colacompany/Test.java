package colacompany;

public class Test {
	
	public static void main(String[] args) {
		ColaEmployee[] c= {new SalariedEmployee("李帅", 1, 5006),
							new HourlyEmployee("张三", 2, 170, 10),
							new SalesEmployee("王二", 3, 8000, 0.3)};
		
		//Company cc=new Company();
		for(int i =0;i<c.length;i++ ){
            new Company().getSalary(c[i], 3);
        }
	}
}
	

