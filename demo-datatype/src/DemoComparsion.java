public class DemoComparsion {

  public static void main(String[] args) {
    // >, <, >=, <=,
    // ==, !=
    // &&, ||, !

    int x = 10;
    int y = 11;

    System.out.println(x + 3 < y + 2); // false
    // operator precedence, + before <
    System.out.println(x + 3 <= y + 2); // true

    int x2;
    System.out.println(x2 = 3);
    // can assign and function at the same time
    System.out.println(x2); // works

    double rand1 = 10.4;
    float rand2 = 10.4f;
    System.out.println(rand1 == rand2); // false


    System.out.println("-".repeat(32));
    int val1 = 10;
    int val2 = 12;
    int val3 = 14;
    System.out.println(val1 > val2 || val1 < val2); // true
    System.out.println(val1 > val2 && val1 < val2); // false

  System.out.println(true && true);
  System.out.println(true && false);
  System.out.println(true || false); // deadcode, true already
  System.out.println(false || true); // no deadcode

  System.out.println(!true == false);


  }

}
