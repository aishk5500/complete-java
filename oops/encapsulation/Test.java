package oops.encapsulation;

public class Test {
    public static void main(String[] args) {
        Customer c= new Customer();
        c.setFirstname("Aishwarya");
        c.setLastname("Kulkarni");
        c.setCreditCard("123456");
        System.out.println("First name "+c.getFirstname()+"\nLast name "+c.getLastname()+"\nCredit card "+ c.getCreditCard());
    }
}
