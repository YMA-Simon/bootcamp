public class JavaQuest6 {
  /**
   * Expected output: 0 1 1 2 3 5 8 13 21 ...
   *
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    int result;
    for (int i = 0; i < 13; i++) {
      if (i == 0) {
        System.out.print(first + " ");
        System.out.print(second + " ");
      }
      result = first + second;
      System.out.print(result + " ");
      first = second;
      second = result;
    }

  }
}
