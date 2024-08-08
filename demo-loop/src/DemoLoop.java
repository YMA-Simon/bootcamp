
public class DemoLoop {
  public static void main(String[] args) {
    int x = 3;
    x *= 3;
    x *= 3;
    x *= 3;
    System.out.println(x);

    // surprisingly ++i is the same as i++
    for (double i = 0; i < 5; ++i) {
      System.out.println(i);
    }
    for (double i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // steps
    for (double i = 0; i < 11; i += 2) {
      System.out.println(i);
    }

    // continue, to skip an iteration
    int totalBreak = 0;
    for (int i = 0; i < 5; i++) {
      if (i == 2) {
        continue;
      }
      totalBreak += i;
    }
    System.out.println(totalBreak); // 0 + 1 + 3 + 4



    // examples
    System.out.println("-".repeat(32));
    int y = 3;
    for (int i = 0; i < 3; i++) {
      y *= 3;
    }
    System.out.println(y);

    // 01: i = 0

    // 02: i < 3 ? true
    // 03: y *= 3, y = 9
    // 04: i++, ie i = 1

    // 05: i < 3 ? true
    // 06: y *= 3, y = 27
    // 07: i++, ie i = 2

    // 08: i < 3 ? true
    // 09: y *= 3, y = 81
    // 10: i++, ie i = 3

    // 11: i < 3 ? false
    // 12: exit

    System.out.println("-".repeat(32));
    for (int i = 0; i < 5; i++) {
      System.out.println("hello world");
    }

    System.out.println("-".repeat(32));
    // odd number from 0 to 10 (including)
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    System.out.println("-".repeat(32));
    for (int i = 10; i > 0; i -= 2) {
      System.out.println(i);
    }


    System.out.println("-".repeat(32));
    // exp5
    String str1 = "abcdefghijk";
    String ret = "";
    for (int i = 0; i < str1.length(); i += 2) {
      ret += str1.charAt(i);
    }
    System.out.println(ret);

    System.out.println("-".repeat(32));
    // exp6
    String s2 = "bbbeaaaecceeee";
    char target = 'e';

    int count = 0;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == target) {
        count++;
      }
    }
    System.out.println(count);


    System.out.println("-".repeat(32));
    // exp7
    count = 0;
    // 1-100, count value dividable by 3 or 4
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 4 == 0) {
        count++;
      }
    }
    System.out.println(count);

    // exp8
    // sum of all odd numbers in 1-50,
    int total = 0;
    for (int i = 1; i < 51; i++) {
      if (i % 2 == 1) {
        total += i;
      } else {
        total -= i;
      }
    }
    System.out.println(total);

    int total2 = 0;
    for (int i = 1; i < 51; i++) {
      total2 = i % 2 == 1 ? total2 + i : total2 - i;
    }
    System.out.println(total2);


    System.out.println("-".repeat(32));
    // exp9
    // find the 1st index of j, if no j, return -1
    String s3 = "abcdxyzijk";
    char target2 = 'j';
    boolean found = false;

    int retIndex = -1;
    for (int i = 0; i < s3.length(); i++) {
      if (s3.charAt(i) == target2) {
        found = true;
        retIndex = i;
        break;
      }
    }
    System.out.println(retIndex);

    // alternative
    System.out.println(s3.indexOf(target2));


    System.out.println("-".repeat(32));
    // exp10
    String s4 = "hello";
    target = 'o';
    found = false;

    found = s4.charAt(s4.length() - 1) == target;
    System.out.println(found);

    found = false;
    found = s4.endsWith(String.valueOf(target));
    System.out.println(found);

    System.out.println("-".repeat(32));
    // exp11
    String s5 = "abcdefghijk";
    s5.contains("def"); // return boolean
    System.out.println(s5.substring(3, 6));

    String targetString = "def";
    System.out.println(s5.substring(s5.indexOf(targetString),
        s5.indexOf(targetString) + targetString.length()));

    System.out.println("-".repeat(32));
    // exp12
    String s6 = "abcdefghijk";
    targetString = "hi";

    boolean isSubStrFound = false;
    int foundAt = 0;
    int iputLength = s6.length();
    int targLength = targetString.length();
    for (int i = 0; i < iputLength - targLength; i++) {
      String trimmed = s6.substring(i, i + targLength);
      if (targetString.equals(trimmed)) {
        isSubStrFound = true;
        foundAt = i;
      }
    }
    System.out.println("Found?: " + isSubStrFound + ", at: " + foundAt);

    System.out.println("-".repeat(32));
    // exp13
    for (int i = 0; i < 5; i++) {
      if (i >= 3) {
        break;
      }
      System.out.println(i);
    }

    System.out.println("-".repeat(32));
    // exp15 + 16
    // System.out.print(), print with no linebreak/ new line

    // using nested loop, print the following:
    // *****
    // ****
    // ***
    // **
    // *

    int lineLeng = 5;
    for (int i = 0; i < lineLeng; i++) {
      for (int j = 0; j < lineLeng - i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

}
