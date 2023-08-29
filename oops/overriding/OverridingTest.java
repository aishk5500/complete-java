package oops.overriding;

public class OverridingTest {
    public static void main(String[] args) {
        String car = new Car().fuel();
        String bike= new Bike().fuel();
        String bus = new Bus().fuel();
        String vehicle = new Vehicle().fuel();
        System.out.println("Car "+car+"\n"+"Bike "+bike+"\n"+"Bus "+bus+"\n"+"Vehicle "+vehicle);
    }
}
