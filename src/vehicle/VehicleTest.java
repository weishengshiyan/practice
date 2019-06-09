package vehicle;
import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        System.out.println("请输入汽车行驶的速度……");
        Scanner in = new Scanner(System.in);
        
        double speed = in.nextDouble();

        Vehicle v = new Vehicle("benz", "红");
        v.run(speed);

        Car car = new  Car(2,"honda","红");
        car.run(speed);
    }
}
