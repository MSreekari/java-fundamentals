package TypeCasting.narrowing;

public class Program {
    public static void main(String[] args) {
        // Narrowing -> A variable of larger datatype when converted to a smaller datatype, compile error is thrown
        short a = 354;
//        byte b = a; // This throws incompatible types error

        // Hence expicit type conversion has to be done using the TypeCast operator
        short c = 235;
        byte d = (byte) c;
        System.out.println(c==d);

        long e = 100L;
        int f = (int) e;
        System.out.println(f==e);
    }
}
