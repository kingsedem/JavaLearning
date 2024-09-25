public class MethodDemo {

    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        methodDemo.findSquare(20, 30);
        methodDemo.findSquare(19, 3);
        methodDemo.findSquare2(11, 2);
    }

    public void findSquare(int n, int m){
        int squareOfTwoNumbers = (n*n)+(m*m)+(2*n*m);
        System.out.println("Output is: "+squareOfTwoNumbers);
    }

    public int findSquare2(int n, int m){
        int squareOfTwoNumbers = (n*n)+(m*m)+(2*n*m);
        return squareOfTwoNumbers;
    }
}
