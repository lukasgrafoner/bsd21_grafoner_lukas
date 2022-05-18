package at.campus02.bsd;

public class Calculator {

    public double add(double number1, double number2){
        Main.logger.debug(number1 + " + "+ number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2){
        Main.logger.debug(number1 + " - "+ number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) throws ArithmeticException{
        Main.logger.debug(number1 + " / "+ number2);
        if(number2 == 0){
            Main.logger.error(number1 + " / "+ number2 + " --> Division by zero!");
            throw new ArithmeticException("Division by zero.");
        }
        return number1 / number2;
    }

    public double multiply(double number1, double number2){
        Main.logger.debug(number1 + " * "+ number2);
        return number1 * number2;
    }

    public int calcFaculty(int n){
        Main.logger.debug(n +"!");
        if(n <= 0){
            return 0;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
