package extend_interface;

public class Invoice implements Payable{
	private  String Name;
	private  String partDescrption;
	private  int price;
	private  int quantity;
		 public Invoice() {
			// TODO Auto-generated constructor stub
		}//无参构造。
	
	

	public String getName() {
			return Name;
		}



		public void setName(String name) {
			Name = name;
		}



		public String getPartDescrption() {
			return partDescrption;
		}



		public void setPartDescrption(String partDescrption) {
			this.partDescrption = partDescrption;
		}



		public int getPrice() {
			return price;
		}



		public void setPrice(int price) {
			this.price = price;
		}



		public int getQuantity() {
			return quantity;
		}



		public void setQuantity(int quantity) {
			this.quantity = quantity;
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
