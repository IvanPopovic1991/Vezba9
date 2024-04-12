public class Calculator {
    double operand1;
    double operand2;

    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public static double add(double operand1, double operand2) {
        double res = operand1 + operand2;
        return res;
    }

    public static double sub(double operand1, double operand2) {
        double res = operand1 - operand2;
        return res;
    }

    public static double mul(double operand1, double operand2) {
        double res = operand1 * operand2;
        return res;
    }

    public static double div(double operand1, double operand2) {
        double res = operand1 / operand2;
        return res;
    }

    public static void main(String[] args) {
        double result = add(10, 5);
        System.out.println("The result of the addition method is : " + result);
        double resultSub = sub(10, 5);
        System.out.println("The result of the subtraction method is : " + resultSub);
        double resultMul = mul(10, 5);
        System.out.println("The result of the multiplication method is : " + resultMul);
        double resultDiv = div(10, 5);
        System.out.println("The result of the division method is : " + resultDiv);
    }
}
