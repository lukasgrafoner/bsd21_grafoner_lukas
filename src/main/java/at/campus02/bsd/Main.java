package at.campus02.bsd;

public class Main {

    public static void main(String[] args) {
        try{
            Calculator calc = new Calculator();

            System.out.println("1 + 2 = "+calc.add(1, 2));
            System.out.println("45 - 5 = "+calc.minus(45, 5));
            System.out.println("9 * 4 = "+calc.multiply(9, 4));
            System.out.println("15 / 2 = "+calc.divide(15, 2));

        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
