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
}
