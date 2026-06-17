package TypeCasting.widening;

class Program{
    public static void main(String[] args) {
        // Byte -> Int possible because of widening
        // Widening -> A small range data type is converted to a large data type
        // this is called as implicit type conversion
        byte a = 120;
        short b = a;
        System.out.println(a==b);

        short c = 234;
        int d = c;
        System.out.println(c==d);

        int e = 46362;
        long f = e;
        System.out.println(f==e);
    }
}