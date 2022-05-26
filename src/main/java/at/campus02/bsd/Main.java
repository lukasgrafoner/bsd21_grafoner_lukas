package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class to test the Calculation implementation on it's methods: add, minus, divide, multiply, faculty
 *
 * @author Lukas Grafoner
 * @version 1.1
 */
public class Main {

    public static Logger logger = LogManager.getLogger();

    /**
     * Main-method to test the methods of Calculator.java
     *
     * @param args
     */
    public static void main(String[] args) {
        try{
            Calculator calc = new Calculator();

            System.out.println("1 + 2 = "+calc.add(1, 2));
            logger.info("Dies ist ein Info-Log!");

            System.out.println("45 - 5 = "+calc.minus(45, 5));

            System.out.println("9 * 4 = "+calc.multiply(9, 4));
            logger.error("Dies ist ein Error-Log!");

            System.out.println("15 / 2 = "+calc.divide(15, 2));

        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
