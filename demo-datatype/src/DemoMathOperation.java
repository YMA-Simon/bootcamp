public class DemoMathOperation {

  public static void main(String[] args) {
    int a = 1 + 1;
    System.out.println(a);


    // modulus operator
    int x = 5 % 2;
    System.out.println(x);

    int b = 10 % 2;
    System.out.println(b);

    // same as other lang, divide by 0 throw an error
    // System.out.println(10 / 0);

    System.out.println("----------");
    // practice
    int a1 = 1 + 1;
    int a2 = 1 - 1;
    int a3 = 1 * 1;
    int a4 = 11 % 2;
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    System.out.println(a4);


    double b1 = 1 + 1;
    double b2 = 1 - 1;
    double b3 = 1 * 1;
    double b4 = 11 % 2;
    double b5 = 11.1 / 0;
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println(b5);

    System.out.println("----------");
    double b6 = 0.2 + 0.1;
    System.out.println(b6);

    double b7 = 0.2 + 0.2;
    System.out.println(b7);


    System.out.println("----------");
    // increment, same for -, *, /
    double c1 = 1;
    c1 = c1 + 1;
    c1++; // not for */
    ++c1; // not for */
    c1 += 1;
    c1 = c1 + 2;
    c1 += 2;
    System.out.println(c1);

    // dont work
    // double c2 = 1;
    // (c2++);

    System.out.println("----------");
    // prac2
    int A = 3;
    int O = 10;
    double pA = 3.3;
    double pO = 5.5;

    double total = A * pA + O * pO;
    System.out.println(total);


    System.out.println("----------");
    // prac 3
    int m = 90;
    int e = 78;
    int h = 62;

    double avg = (m + e + h) / 3;
    // since int / int will give int, the decimal will be truncated
    // answer should be 76.66666...
    System.out.println(avg);
    System.out.println("since int / int will give int, the decimal is be truncated");
    System.out.println("and the 76.0 is wrong, since it is 76.66666....");

    double avg2 = (m + e + h) / 3.0;
    System.out.println(" ");
    System.out.println(avg2);
    System.out.println("but '(m + e + h) / 3.0' works, and give the correct result");
    System.out.println("also '(m + e + h) / 3d' works too");
    System.out.println("----------");

    System.out.println("----------");
    int cnt = 0;
    int ans;
    ans = cnt++ + 3;
    // '+' operator first, then '=', then '++'
    System.out.println(ans == 3); // true
    System.out.println(cnt == 1); // true

    int cnt2 = 0;
    int ans2 = ++cnt2 + 3;
    // '++' operator first, then '+', then '='
    System.out.println(ans2 == 4); // true
    System.out.println(cnt2 == 1); // true


    int x3;
    int y3;

    x3 = 10;
    y3 = 20;
    int z3 = x3++ * ++y3; // 210
    System.out.println(z3);

    x3 = 10;
    y3 = 20;
    int z4 = x3++ * --y3; // 190
    System.out.println(z4);


  }
}
