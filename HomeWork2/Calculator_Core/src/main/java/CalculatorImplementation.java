public class CalculatorImplementation implements ICalculator {

    @Override
    public double addition(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    @Override
    public double subtraction(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    @Override
    public double multiplication(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    @Override
    public double division(double firstOperand, double secondOperand) {
        return firstOperand/secondOperand;
    }
}
