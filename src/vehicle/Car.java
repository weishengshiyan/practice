package vehicle;

/*
 * 定义一个Vehicle类的子类轿车类Car，要求如下： 
• 2.2.1 轿车有自己的属性载人数loader（int 类型）。 
• 2.2.2 提供该类初始化属性的构造方法。 
• 2.2.3 重新定义run()，用打印语句描述轿车奔跑的功能。 
• 2.2.4 在main方法中创建一个品牌为―Honda‖、颜色为―red‖，载人数为2人的轿车。
 */
public class Car extends Vehicle{
	int loader;
	
	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}

	public Car(int loader,String brand,String color) {
		this.loader=loader;
		this.brand=brand;
		this.color=color;
		
	}
	
	@Override
		public void run(double num) {
			// TODO Auto-generated method stub
		while(true){

//          用来显示循环间隔，车辆提速间隔时间
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
        System.out.println(this.getColor()+"色的,载着"+this.getLoader()+"人的"+this.getBrand()+"品牌的的汽车以"+this.getSpeed()+"的速度在行驶。");
    }

			
			
		}

