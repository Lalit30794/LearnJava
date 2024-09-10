package DataTypes;
/*
Definition : Data Types in Java Data types in Java are of different sizes and values that can be stored in 
the variable that is made as per convenience and circumstances to cover up all test cases.Java has 
two categories in which data types are segregated
Types of Data

==> Primitive Data Type:such as boolean,char,int,short,byte,long,float,and double 
==> Non-Primitive Data Type or Object Data type:such as String,Array,etc.

*/

public class LearnDataTypes {

    // main method to execute the code
    public static void main(String[] args) {
        // Primitive data
        boolean booleanVar;
        byte byteVar;
        char charVar;
        short shortVar;
        int intVar;
        long longVar;
        float floatVar;
        double doubleVar;

        // Initializing variables
        booleanVar = true;
        charVar = 'G';
        intVar = 89;
        byteVar = 4;
        shortVar = 56;
        doubleVar = 4.355453532;
        floatVar = 4.7333434f;
        longVar = 12121;


        // Printing the values
        System.out.println("char: " + charVar);
        System.out.println("integer: " + intVar);
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("long: " + longVar);
        System.out.println("boolean:" + booleanVar);
        System.out.println("args:" + args);
    }

}
