public class SingleInheritence {
    void m1(){
        System.out.println("Inside M1");
    }

    public static void main(String[] args) {
        SingleInheritence s= new SingleInheritence();
        s.m1();
        System.out.println(s.hashCode());
        System.out.println(s.getClass());
    }
}
