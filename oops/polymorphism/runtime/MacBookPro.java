package oops.polymorphism.runtime;

public class MacBookPro extends MacBook{
    @Override
    void start(){
        System.out.println("Inside MacBook-Pro start");
    }

    @Override
    void shutdown(){
        System.out.println("Inside MacBook-Pro shutdown");
    }
}
