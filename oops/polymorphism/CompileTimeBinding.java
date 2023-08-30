package oops.polymorphism;

public class CompileTimeBinding {
    void add(int a ,int b){
        System.out.println("Result is "+(a+b));
    }
    void add(float a, float b){
        System.out.println("Result is "+(a+b));
    }
    void add(int a ,int b,int c){
        System.out.println("Result is "+(a+b+c));
    }
    public static void main(String[] args) {
    CompileTimeBinding c= new CompileTimeBinding();
    c.add(1,2);
    c.add(1.09f,0.998f);
    c.add(123,56,67);
    }
}
