package TypeCasting;

public class SpecialCase {
    public static void main(String[] args) {

        // short is signed -> can include negative values as well whereas
        // char is unsigned -> can store only positive values
        short shortNum = -5;
        // char myChar = shortNum; // Compiler Error: possible loss of precision

        char myChar = (char) shortNum;
        System.out.println((int) myChar); // Prints 65531 (Negative wraps around to a massive unsigned value!)

        // Hence explicit type conversion is required even though they have the same data range
        char letter = 'A'; // Unicode value: 24133
        // short shortVal = letter; // Compiler Error: possible loss of precision

        short shortVal = (short) letter;
        System.out.println(shortVal); // Prints 24133 (It fits, so the value is preserved!)

        // int -> float - Implicit conversion
        // float -> int - Explicit conversion
        // long -> double - Implicit conversion
        // double -> long - Explicit conversion
        // char <-> short - Explicit conversion
    }
}
