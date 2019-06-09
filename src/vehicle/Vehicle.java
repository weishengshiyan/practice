package vehicle;
/*
 * 定义一个汽车类Vehicle， 
• 2.1.1 属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型）。 
• 2.1.2 至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）。 
• 2.1.3 为属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改。 
• 2.1.4 定义一个一般方法run()，用打印语句描述汽车奔跑的功能 
• 2.1.5 在main方法中创建一个品牌为―benz‖、颜色为―black‖的汽车。
 */
public class Vehicle {
	String brand;
	String color;
	double speed;
	
	public Vehicle() {};
	public Vehicle(String brand,String color) {//上面没写
		this.brand=brand;
		this.color=color;
		this.speed=0;
		
	}
	
	
		public void run(double num) {
			 while(true){
				 

//		          用来显示循环间隔，车辆提速间隔时间
		            try {
		                Thread.sleep(500);
		            } catch (InterruptedException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }
		            if(this.getSpeed()<num){
		                System.out.println("车辆正在提速，当前车速为"+this.getSpeed());
		            }else{
		                break;
		            }
		            this.setSpeed(this.getSpeed()+5);
		        }
		        System.out.println(this.getColor()+"色的"+this.getBrand()+"品牌的的汽车以"+this.getSpeed()+"的速度在行驶。");
		  

			
			
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	


}
