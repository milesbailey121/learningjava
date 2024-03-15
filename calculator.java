import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        String[] functions = {"addition","subtraction","multiplication","division","power","factorial"};
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number!: ");
            double x = validateNumberInput(reader);
            System.out.println("Enter a second number!: ");
            double y = validateNumberInput(reader);
            System.out.println("Please enter an operation you would like to perform: ");
            String func = validateFunction(reader, functions);
            switch (func) {
                case "addition":
                    System.out.println(addition(x, y));
                    break;
                case "subtraction":
                    System.out.println(subtraction(x, y));
                    break;
                case "multiplication":
                    System.out.println(multiplication(x, y));
                    break;
                case "division":
                    System.out.println(division(x, y));
                    break;
                case "power":
                    System.out.println(powerOf(x, y));
                    break;
                case "factorial":
                    System.out.println(factorial(x));
                    break;
            }
            System.out.println("Would you like to perform another calculation?");
            while (true) {
                String line = reader.nextLine();
                if (line.toLowerCase().equals("y")) {
                    clearScreen();
                    break;
                } else if (line.toLowerCase().equals("n")) {
                    System.exit(0);
                } else{
                    clearScreen();
                    System.out.println("Please input a valid option: ");
                }
            }
        }
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    

    public static double validateNumberInput(Scanner reader){
        double value;
        while(true){
            try{
                String line = reader.nextLine();
                value = Integer.parseInt(line);
                break;
            }
            catch(Exception e){
                System.out.println("Please Input a valid number input! ");
            }
        }
        return value;
    }

    public static String validateFunction(Scanner reader,String[] functions){
        while (true) {
            String line = reader.nextLine();
            for (String string : functions) {
                if (string.equals(line.toLowerCase())) {
                    return line;
                } 
            }
            System.out.println("Please Input a correct function!");
        }
    }

    public static double addition(double x, double y){
        return x + y;
    }

    public static double subtraction(double x, double y){
        return x - y;
    }

    public static double multiplication(double x, double y){
        return x * y;
    }

    public static double division(double x, double y){
        return x / y;
    }

    public static double powerOf(double x, double power){
        return Math.pow(x, power);
    }

    public static double factorial(double x){
        long fact = 1;
        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
