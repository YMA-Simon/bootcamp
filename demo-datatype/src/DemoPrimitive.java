public class DemoPrimitive {
  public static void main(String[] args) {
    int x = 100;
    System.out.println(x);

    int y;
    y = -13;
    System.out.println(y);
    y = -100;
    System.out.println(y);

    int age = 30;

    double age2 = 30.5;
    System.out.println(age2);

    char spacer = '-';

    char c = ' ';
    System.out.println(spacer);
    System.out.println(c);
    System.out.println(spacer);

    // char b = ''; does not work
    char b = Character.MIN_VALUE;
    System.out.println(b);
    System.out.println(spacer);


    double d1 = 3.3;
    // by default compiler interprete this as double
    double d2 = 3.3d;
    // float f1 = 3.3d;
    float f2 = 3.3f;
    // double cannot be casted to float, the follow would not work
    // float f1 = 3.3; or float f1 = 3.3d;


    float f3 = (float) (d1 / d2);
    // explicit upcast is needed for mathops on double

    double d3 = f3;
    // downcasting is fine

    int x1 = 4; // default cast is int
    long y1 = 6; // long can downcast to int
    long z1 = 6L; // by convention, use L to rep long (instead of l)


    // ------------------------------------------------------------
    // Data type in more detail
    // ------------------------------------------------------------
    // byte, short, int, long (all are signed)
    // float (32bit), double (64bit)
    // bool (1bit)
    // char (16bit)

    byte b1 = 3; // int8, ie -(2**8)/2, (2**8)/2 - 1
    short s1 = 3; // int16, ie -(2**16)/2, (2**16)/2 - 1
    int i1 = 3; // int32
    long l1 = 3; // int64

    // this is example of strong typing in java
    // 3 as hardcoded could be downcast to byte (at compile time)
    // however "b1 = i1;" would not work, given b1 is byte and i1 is int
    // as compiler see i1 (int) may lead to b1 overflowing during runtime
    // so just forbid it at compile time

    // as always upcasting byte from short/int/long is ok, for compiler
    s1 = b1;
    i1 = b1;

    // this also not work, as explicitly declared as long already
    // i1 = 3L;


    // bool
    boolean bool = true;
    bool = false;
    // ie a data type to store predicate for event, flow control (activate or not)
  

  }
}
