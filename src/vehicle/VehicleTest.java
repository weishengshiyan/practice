package vehicle;
import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        System.out.println("������������ʻ���ٶȡ���");
        Scanner in = new Scanner(System.in);
        
        double speed = in.nextDouble();

        Vehicle v = new Vehicle("benz", "��");
        v.run(speed);

        Car car = new  Car(2,"honda","��");
        car.run(speed);
    }
}
