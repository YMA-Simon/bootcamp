import java.util.Scanner;

public class DemoScanner {

  public static void main(String[] args) {

    // exp1
    // Scanner s = new Scanner(System.in);

    // System.out.println("Please input a number: ");
    // int input = s.nextInt();

    // s.close();

    // String cond;
    // if (input % 2 == 0) {
    // cond = "even";
    // } else {
    // cond = "odd";
    // }
    // System.out.println(input + " is an " + cond + " number.");

    // exp2
    double totalBalance = 300.0;
    boolean isContOps = true;

    while (isContOps) {
      Scanner s = new Scanner(System.in);

      System.out.println("-".repeat(32));
      System.out.println(
          "Please choose ops (1-Deposit, 2-Withdraw, 3-Check balance, quit): ");
      int ops = s.nextInt();

      switch (ops) {
        case 1:
          System.out.println("Please input deposit amount: ");
          totalBalance += s.nextDouble();
          break;
        case 2:
          System.out.println("Please input withdrawal amount: ");
          totalBalance -= s.nextDouble();
          break;
        case 3:
          System.out.println("Total balance: " + totalBalance);
          break;

        default:
          isContOps = false;
          break;
      }

    }

  }
}
