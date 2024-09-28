public class LoopingDemo {
    public static void main(String[] args) {
        LoopingDemo.forDemo();
        LoopingDemo loopingDemo = new LoopingDemo();
        loopingDemo.whileDemo();
    }

    public static void forDemo(){
        for (int i=0; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void  whileDemo(){
        int i=0;

        while (i<10){
            System.out.println("New me");
            i++;
        }
    }
}

