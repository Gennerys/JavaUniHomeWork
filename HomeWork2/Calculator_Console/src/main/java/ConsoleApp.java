import java.text.ParseException;

public class ConsoleApp {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Usage: <firstNum> <secondNum> <operation>");
            System.exit(-1);
        }
        ICalculator calculator = new CalculatorImplementation();
        double firstOperand = ParseNum(args[0]);
        double secondOperand = ParseNum(args[1]);
        String operation = args[2];
        double result = 0;
        switch (operation) {
            case "+":
                result = calculator.addition(firstOperand, secondOperand);
                break;
            case "-":
                result = calculator.subtraction(firstOperand, secondOperand);
                break;
            case "*":
                result = calculator.multiplication(firstOperand, secondOperand);
                break;
            case "/":
                result = calculator.division(firstOperand, secondOperand);
                break;
            default:
                System.err.println("Unknown/unsupported operation");
        }

        System.out.println(String.format("First operand: %f%nSecond operand: %f%nOperation: %s%nResult: %f", firstOperand, secondOperand, operation, result));


    }

    public static double ParseNum(String number) {

        try {
            return Double.parseDouble(number);
        } catch (NumberFormatException ex) {
            System.err.println(String.format("Value %s is not a number", number));
            return 0;
        }

    }

}
