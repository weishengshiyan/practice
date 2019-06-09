package extend_interface;

public class employee implements Payable{
	
	private  int  pay;
	private  String  work;
	private  String  Name;
	private  int  Number;
	
	 public employee() {
		// TODO Auto-generated constructor stub
	}
	

	public int getPay() {
		return pay;
	}


	public void setPay(int pay) {
		this.pay = pay;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public int getNumber() {
		return Number;
	}


	public void setNumber(int Number) {
		this.Number = Number;
	}


	@Override
	public void getPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getdfpay() {
		// TODO Auto-generated method stub
		
	}
	

}
