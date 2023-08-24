public class StaticVsNonStaticBlocks {
    StaticVsNonStaticBlocks(){
        System.out.println(" In Non-Static constructor");
    }
    {
        System.out.println("In a Non-static block");
    }
    static {
        System.out.println("In a Static block");
    }

    public static void main(String[] args) {
        System.out.println("In main method");
        new StaticVsNonStaticBlocks();
    }
}
