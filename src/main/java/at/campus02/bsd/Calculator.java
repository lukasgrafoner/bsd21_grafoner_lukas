package at.campus02.bsd;

/**
 * Represents a calculator for basic calculations: add, minus, divide, multiply and additionally for faculty
 * @author Lukas Grafoner
 * @version 1.0
 */
public class Calculator {

    /**
     * Calculates the result of an addition
     * Writes a debug-log message of the calculation
     * @param number1 first double-value for addition
     * @param number2 second double-value for addition
     * @return result of number1 + number2
     */
    public double add(double number1, double number2){
        Main.logger.debug(number1 + " + "+ number2);
        return number1 + number2;
    }

    /**
     * Calculates the result of a subtraction
     * Writes a debug-log message of the calculation
     * @param number1 first double-value for subtraction
     * @param number2 second double-value for subtraction
     * @return result of number1 - number2
     */
    public double minus(double number1, double number2){
        Main.logger.debug(number1 + " - "+ number2);
        return number1 - number2;
    }

    /**
     * Calculates the result of a division
     * Writes a debug-log message of the calculation
     * @param number1 first double-value for division
     * @param number2 second double-value for division
     * @return result of number1 / number2
     * @throws ArithmeticException in case of an division by zero (when number2 is zero)
     */
    public double divide(double number1, double number2) throws ArithmeticException{
        Main.logger.debug(number1 + " / "+ number2);
        if(number2 == 0){
            Main.logger.error(number1 + " / "+ number2 + " --> Division by zero!");
            throw new ArithmeticException("Division by zero.");
        }
        return number1 / number2;
    }

    /**
     * Calculates the result of a multiplication
     * Writes a debug-log message of the calculation
     * @param number1 first double-value for multiplication
     * @param number2 second double-value for multiplication
     * @return result of number1 * number2
     */
    public double multiply(double number1, double number2){
        Main.logger.debug(number1 + " * "+ number2);
        return number1 * number2;
    }

    /**
     * Calculates the faculty using iteration
     * e.g.: faculty(5) = 5! = 1*2*3*4*5
     * @param n integer for which the faculty is to be determined
     * @return result of n!
     */
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
