public class ThisKeywordDemo {
    int x;
    ThisKeywordDemo(){
    System.out.println(this);// this refers to object reference; can only be used in non static elemets
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new ThisKeywordDemo();
        new ThisKeywordDemo();
        new ThisKeywordDemo();
    }
}
