package colacompany;
/*
 *  SalesEmployee ：ColaEmployee 的子类，销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率/
 */
public class SalesEmployee extends ColaEmployee{
		double sales;
		double rate;
		
	public SalesEmployee(String name, int month,double sales,double rate) {
		super(name, month);
		// TODO Auto-generated constructor stub
		this.sales=sales;
		this.rate=rate;
		
	}
	
	@Override
	public double getSalary(int mouth) {
	
	if (super.month==mouth) {
		return sales*rate+100;
		}else {
			return sales*rate;
		}
		
		
	}

	
	}

