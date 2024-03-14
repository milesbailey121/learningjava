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
    public static int Operators(){
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
                




        return 4;

    }
}


