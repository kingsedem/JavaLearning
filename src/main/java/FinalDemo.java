public class FinalDemo {

    final int a = 20;

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.m1();
    }

    public void m1(){
        //a++;
        System.out.println(a);
    }
}
