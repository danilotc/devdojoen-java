package edu.danilotc.javaoneforall.introduction.primitivetypes;

public class PrimitiveTypes01 {
    public static void main(String[] args) {
        // int, long, byte, short, double, float, char, boolean

        // integer primitive types
        int intNumber = (int) 10000000000L; // cast long to int
        long longNumber = (long) 155.82D; // cast double to long
        short shortNumber = 29;
        byte byteNumber = 39;

        // real primitive types with decimal point
        float floatNumber = (float) 2500.0; // cast double to float
        double doubleNumber = 5000.0D;

        // logic primitive type
        boolean booleanValueTrue = true;
        boolean booleanValueFalse = false;

        // character primitive type, accept unicode or ascii table value
        // unicode: '\u0041' for A
        // ascii table value: 87 for W, 65 for A, 95 for _
        char charValueWithUniqueCaracter = '\u0041';

        // this is not primitive type, it is object type
        String name = "John";

        System.out.println("intNumber: "+intNumber);
        System.out.println("longNumber: "+longNumber);
        System.out.println("shortNumber: "+shortNumber);
        System.out.println("byteNumber: "+byteNumber);
        System.out.println("floatNumber: "+floatNumber);
        System.out.println("doubleNumber: "+doubleNumber);
        System.out.println("booleanValueTrue: "+booleanValueTrue);
        System.out.println("booleanValueFalse: "+booleanValueFalse);
        System.out.println("charValueWithUniqueCaractere: "+charValueWithUniqueCaracter);
        System.out.println("valueString: "+name);
    }
}
