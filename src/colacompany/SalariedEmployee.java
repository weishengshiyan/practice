package colacompany;
/*
 * ColaEmployee �����࣬�ù̶����ʵ�Ա�������ԣ���н
 */
public class SalariedEmployee extends ColaEmployee {
	double salar;
	
	public double getSalar() {
		return salar;
	}

	public void setSalar(double salar) {
		this.salar = salar;
	}

	public SalariedEmployee(String name, int month,double salar) {
		super(name, month);
		// TODO Auto-generated constructor stub
		this.salar=salar;
	}

@Override
public double getSalary(int mouth) {
	// TODO Auto-generated method stub
	if (this.month==month) {
		return salar+100;
	}else {
		return  salar;
	}

}
	

}
