package oops.polymorphism.runtime;

import javax.crypto.Mac;

public class MacBookAir extends MacBook {
    @Override
    void start(){
        System.out.println("Inside MacBook-Air start");
    }

    @Override
    void shutdown(){
        System.out.println("Inside MacBook-Air shutdown");
    }
}
