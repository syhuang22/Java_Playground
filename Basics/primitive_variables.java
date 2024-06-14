package Basics;

public class primitive_variables {
    public static void main(String[] args) {
        // declare an int type variable 
        int intVar = 10;
        System.out.println("inVar is " + intVar);

        // declare a double variable 
        double doubleVar = 20.5;
        System.out.println("doubleVar is " + doubleVar);

        // declare a char var
        char charVar = 'A';
        System.out.println("charVar is " + charVar);

        // declar a boolean var
        boolean booleanVar = true;
        System.out.println("booleaVar is " + booleanVar);

        // var calculation on int and double 
        int sum = intVar + 5;
        double product = doubleVar * 2;
        System.out.println("doublVar time 2 is "+ product);
        System.out.println("intVar + 5 is " + sum);

        // calculate logic withn boolean
        booleanVar = !booleanVar;
        System.out.println("booleaVar's logic to opposite is " + booleanVar); 

    }
}
