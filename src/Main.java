public class Main {
    public static void main(String[] args) {
            double result = Calculator.add(10, 5);
            System.out.println("The result of the addition method is : " + result);
            double resultSub = Calculator.sub(10, 5);
            System.out.println("The result of the subtraction method is : " + resultSub);
            double resultMul = Calculator.mul(10, 5);
            System.out.println("The result of the multiplication method is : " + resultMul);
            double resultDiv = Calculator.div(10, 5);
            System.out.println("The result of the division method is : " + resultDiv);
        }
}