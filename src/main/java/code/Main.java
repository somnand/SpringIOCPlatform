package code;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main(String[] args )
    {
        Vehicle vehicle = new Car();
        vehicle.drive();
        vehicle = new Bike();
        vehicle.drive();
    }
}
