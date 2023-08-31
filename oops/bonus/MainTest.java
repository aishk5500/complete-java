package oops.bonus;

public class MainTest {
    //Can we over load a main method??
    public static void main(String[] args) {
        System.out.println("Default main method.");
        main(10);
    }


    public static void main(int args) {
        System.out.println("OverLoaded main method");
    }
}
