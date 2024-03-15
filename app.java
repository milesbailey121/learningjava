import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.*;

public class app { // Requires to be named after the file so app 
    //Variables and types
    public static void main(String[] args){
        System.out.println("Hello World");
        boolean isTrue = true;
        char letter = 'a';
        double x = 123.112;
        int y = 21;
        System.out.println(x + " added to " + y + " equals " + (x + y));
    }

    public static void wrappers(){ // Wrapper class to upgrade a simple primitive value to a powerful object 
        String hello = new String("Hello");
        Integer value = Integer.valueOf(1);
        Boolean isFalse = Boolean.valueOf(false);
    }

    public static int returner(){ // When returning a value must declare the type required 
        return 4;
    }

//Unary Operators
    public static int incrementer(){
        int gonnaIncrease = 40;
        int gonnaDecrease = 40;
        return ++gonnaIncrease & --gonnaDecrease; // Before is preincrementing and predecrementing while after is postincrementing and postdecremeting
    }

    public static boolean not(){
        boolean notvalue = !true;
        return notvalue;
    }

    public static boolean contains(){
        String javaIsSmart = "Java is smart.";
        boolean isSmartPartOfJava = javaIsSmart.contains("smart");  
        return isSmartPartOfJava;
    }




///////////////////////////////////////// Binary Operators ///////////////////////////////////////////////////////////////////////
// Includes operators that act on two or more values 
    public static void Operators(){
        int x = 1;
        int y = 1;
        // Compound Assignment
        x += y;
        x = x + y;
        // Casting Operator
        int prizes = 10;
        short wonprize = (short)prizes;
        // Relational Operators 
        System.out.println(1==1);
        System.out.println("str"=="str");
        System.out.println("str".equals("str"));
        System.out.println(4 > 5);
        System.out.println("greetings" instanceof String);
        // Logical Operators 
        boolean valueistrue = true;
        boolean valueisfalse = false;
        System.out.println(valueisfalse & valueistrue);//and
        System.out.println(valueisfalse || valueistrue);// OR
        System.out.println(valueisfalse | valueistrue); // 
        // Ternery Operator
        boolean isjavafun = true;
        String shouldilearn = isjavafun ? "yes" : "no";
        System.out.println("Should I learn Java: " + shouldilearn);

        boolean isJavaFun = true;
        String shouldILearnJava = !isJavaFun ? "yes" : "no";
        System.out.println("Should I learn java: " +  shouldILearnJava);

        //Operator Precedence
        boolean isThisCleanCode = !true || false && true; // Shows example of bad code 
        

        int x_1 = 1 + 10 / 2; // Resolves division --> addition --> assignment to variable 
        int x_2 = 1 + (10 / 2); // Does the same but is easier to read and interpret 

    }



    public static void Conditionals(){
        boolean yes = true;
        if (yes == true) {
            System.out.println(yes);
        } else if (yes == false) {
            System.out.println("Not True");
        } else {
            System.out.println("Not True or False!");
        }
    }


    public static void switch_statments(){
        int value11 = 1;
        switch (value11) {
            case 1:
                System.out.println("The Number is 1!");
                break;
            case 2:
                System.out.println("The number is 2!");
                break;
            default:
                System.out.println("Not 1 or 2");
        }
    }

    public static void loops(){
        int x = 3;
        while (x > 0){
            System.out.println("X is" + x--);
        }

        do{
            System.out.println("x is " + x--);
        } while (x < 0);

        for (int x2 = 3; x > 0; x--){
            System.out.println("x is " + x2);
        }

        int[] numbers = {0,1,2};
        for (int x3: numbers){
            System.out.println(x3);
        }
    }



    public static void Arrays(){
        // [] defines an array, new keyword and char means it's a array of size 6 that holds characters
        char[] password = new char[] {'h','e','l','l','o','!'};
        password[0] = 'n';
        for (char c : password) {
            System.out.print(c);
        }

        // Using Array Methods!
        char[] password2 = new char[] {'G','o','o','d','b','y','e'};
        System.out.println(Arrays.equals(password, password2));
        Arrays.sort(password);
        System.out.println(Arrays.binarySearch(password, 'h'));
        password = Arrays.copyOf(password, 10); //Since you can't increase the index of an array you can copy to a larger array
        System.out.println(password.length);
    }


    public static void Lists(){
        List<String> pets = new ArrayList<>();
        pets.add("Dog");
        pets.add(0, "Cat");
        pets.remove("Dog");
        pets.clear();
        pets.contains("Snake");
        pets.indexOf("Dog");
        System.out.println(pets.toString());
        for (String string : pets) {
            System.out.println(string);
        }
    }

    public static void Maps(){
        Map<String, String> captials = new HashMap<>();
        captials.put("France", "Lyon");
        captials.put("France", "Paris");
        captials.put("Germany", "Berlin");
        captials.remove("Germany");
        String removedCapital = captials.remove("France");
        System.out.println(removedCapital);
        captials.clear();
        captials.put("Germany", "Berlin");
        String capitalOfGermany = captials.get("Germany");
        int numberOfCapitals = captials.size();
        String capitalAsString = captials.toString();
        captials.keySet();
        captials.values();
        captials.containsKey("Germany");
        captials.containsValue("Paris");
        captials.getOrDefault("Spain", "Not specified");
    }

    public static void lamda(){
        // (argument(s)) -> {body} // Lamda expression
        //(x) -> System.out.println(x); // example lamda function
        List<String> pets = Arrays.asList("Dog", "Cat");
        pets.forEach((x) -> System.out.println(x));
        pets.forEach(System.out::println);
        pets.forEach(x -> {
            System.out.println("Pet name: " + x);
            System.out.println("Pet number: " + pets.indexOf(x));
        });

        // Using built in lamda functions
        Predicate<String> filterPets = x -> x.startsWith("D");
        pets.stream().filter(t -> filterPets.test(t)).forEach(System.out::println);

        // On the first line you create a predicate type for string values called filterPets. The string type is defined inside the diamond operator <>.
        // With the equals sign the predicate is assigned to a lambda expression which checks whether the passed argument x starts with the letter D.
        // On the second line you start by iterating the pets list using its stream() method.
        // Next on the second line follows the filter method which is used to filter values based on a predicate. The previously defined filterPets is passed to this method for this purpose.
        // Finally, you use the forEach method to iterate over the filtered values and print each one using the method reference System.out::println.
        
        Consumer<String> printPet = x -> System.out.println(x);
        pets.forEach(printPet);
        // A consumer is used to consume a value. It has a method accept which returns void, i.e. doesn’t return anything.

        Function<String, String> toUpperCase = x -> x.toUpperCase();
        pets.stream().map(x -> toUpperCase.apply(x)).forEach(System.out::println);
        // A function is used to transform a value which is passed as an argument. It has a method apply which returns the transformed value
        Supplier<java.time.LocalTime> timeSupplier = () -> java.time.LocalTime.now();
        System.out.println(timeSupplier.get());
        // A supplier is used to provide a value to the caller and does not accept arguments. It has a method get which returns the desired value.
        UnaryOperator<String> toUpperCase2 = x -> x.toUpperCase();
        System.out.println(toUpperCase2.apply("dog"));
        // a unaryOperator is also used to transform a value that is passed as an argument. However, with a unaryOperator the input and output types are always the same. Its method is also called apply and returns the transformed value.
        BinaryOperator<Integer> addition = (x, y) -> x + y;
        System.out.println(addition.apply(2, 3));
        // A binaryOperator is used to combine two values. It also has a method apply which returns the combined value.
    }
}


