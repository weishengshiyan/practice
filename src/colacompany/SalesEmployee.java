package colacompany;
/*
 *  SalesEmployee ��ColaEmployee �����࣬������Ա�������������۶������ʾ��������ԣ������۶�����/
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

