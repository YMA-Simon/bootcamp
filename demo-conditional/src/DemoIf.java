public class DemoIf {

  public static void main(String[] args) {

    int x = 30;
    String cond;
    boolean pred;

    if (pred = x >= 30) {
      cond = "more than";
    } else {
      cond = "less than";
    }
    System.out.println(pred);
    System.out.println(cond);
    // java can handle assignment within a condition
  }
}
