public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(3, 9);


        float division1 = calculator.division(3,  9);
        System.out.println(division1);

        int  subtraction1 =   calculator.subtraction(3, 9);
        System.out.println(subtraction1);

        int multiplication1 =  calculator.multiplication(3, 9);
        System.out.println(multiplication1);

    }
    public  void addition(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public float division(int a, int b){
        float divisionResult = a/b;
        return divisionResult;
    }

    public int subtraction(int a, int b){
        int subtractionResult = a - b;
        return subtractionResult;
    }

    public int multiplication(int a, int b){
        int multiplicationResult = a * b;
        return multiplicationResult;
    }
}
