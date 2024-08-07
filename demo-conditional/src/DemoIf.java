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

    // predicate shorthand
    // <type> <variable> = <condition> ? <expression if true> :<expression if false>
    String example = "";
    int weeknum = ("SUN".equals(example) || "SAT".equals(example)) ? 111 : 222;
    System.out.println(weeknum);

    // check if vowel for a given string
    String ip2 = "a";
    String vowels = "aeiou";
    boolean isVowel = vowels.contains(ip2);
    System.out.println(isVowel); // true


    System.out.println("---------------------------------");
    // exp1
    int num = -3;

    if (num > 0) {
      cond = "positive";
    } else if (num < 0) {
      cond = "negative";
    } else {
      cond = "zero";
    }
    System.out.println("The number is " + cond + ".");
    // be careful to ensure condition are mutually exclusive, where possible
    // sometime it may worth it to be verbose, readability matters

    // exp2
    int a = 10;
    int b = 20;
    String first = "";
    String second = "";

    if (a > b) {
      first = String.valueOf(a);
      second = String.valueOf(b);
      cond = " is larger than ";
    } else if (a < b) {
      first = String.valueOf(b);
      second = String.valueOf(a);
      cond = " is larger than ";
    } else {
      first = String.valueOf(b);
      second = String.valueOf(a);
      cond = " is the same as ";
    }

    System.out.println(first + cond + second + ".");


    // exp3
    String day = "SAT";
    String result = "weekend";

    if ("SUN".equals(day) || "SAT".equals(day)) {
      // no change
    } else {
      result = "weekday";
    }

    // switch (day) {
    // case "SUN":
    // break;

    // case "SAT":
    // break;

    // default:
    // result = "weekday";
    // break;
    // }

    System.out.println(day + " is " + result + ".");

    // exp4
    int input = 8;

    if (input % 2 == 0) {
      cond = "even";
    } else {
      cond = "odd";
    }
    System.out.println(input + " is an " + cond + " number.");

    System.out.println("---------------------------------");
    // exp6
    String str = "hello";
    // get last char

    if ("".equals(str) || str.length() == 0) {
      System.out.println("this is an empty string");
    } else {
      System.out.println("The last char is " + str.charAt(str.length() - 1));
    }

    System.out.println("---------------------------------");
    // exp7
    // string reversal
    int cnt = 0;
    String ret = "";
    int total = str.length();

    // while loop
    while (cnt < total) {
      ret += str.charAt(total - cnt - 1);
      cnt++;
    }
    System.out.println(ret);

    // for loop
    ret = "";
    for (cnt = total; cnt > 0; cnt--) {
      ret += str.charAt(cnt - 1);
    }
    System.out.println(ret);

    // StringBuilder
    ret = new StringBuilder(str).reverse().toString();
    System.out.println(ret);

    System.out.println("---------------------------------");
    // exp8
    // Divided by 4
    // not divide by 100 OR divide by 400


    int[] years = {1600, 1800, 1900, 2000, 2003, 2004, 2008};
    for (int year : years) {
      cond = " not ";
      if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        cond = " ";
      }
      System.out.println(year + " is" + cond + "a leap year.");
    }

    System.out.println("---------------------------------");
    // exp9
    int age = 19;
    boolean isCitizen = true;

    boolean isAged = age > 18;
    cond = "Not eligible.";
    if (isAged && isCitizen) {
      cond = "Eligible to vote.";
    } else if (!isAged && !isCitizen) {
      cond += " Age <18 and not a cit.";
    } else if (!isAged) {
      cond += " Age <18.";
    } else {
      cond += " Not a citizen.";
    }
    System.out.println(cond);

    System.out.println("---------------------------------");
    // exp10
    double tot = 250.0;
    double dis = 0;
    double pay = tot;

    if (tot >= 500.0) {
      dis = tot * 0.2;
    } else if (tot >= 200.0 && tot < 500.0) {
      dis = tot * 0.1;
    } else {
      // no change
    }
    pay = tot - dis;

    System.out.println("price=" + tot);
    System.out.println("discount=" + dis);
    System.out.println("amount=" + pay);


    System.out.println("---------------------------------");
    // exp11
    char ip = 'x';

    if ("a".equals(ip) || "e".equals(ip) || "i".equals(ip) || "o".equals(ip)
        || "u".equals(ip)) {
      cond = ip + " is vowel.";
    } else {
      cond = ip + " is consonant.";
    }
    System.out.println(cond);

    if ("aeiou".contains(String.valueOf(ip))) {
      cond = ip + " is vowel.";
    } else {
      cond = ip + " is consonant.";
    }
    System.out.println(cond);

    String ans = "aeiou".contains(String.valueOf(ip)) ? "vowel" : "consonant";
    System.out.println(ip + " is " + ans + ".");


    System.out.println("---------------------------------");
    // exp12
    // password
    // no special char, #!@$
    // leng >=12

    String pwd = "asdsaasasdsaasddasdsaasd";

    boolean isSP = pwd.contains("#") || pwd.contains("!") || pwd.contains("@")
        || pwd.contains("$");

    if (!isSP && pwd.length() >= 12) {
      System.out.println("strong");
    } else {
      System.out.println("weak");
    }


    String sps = "#!@$";
    isSP = false;
    for (char sp : sps.toCharArray()) {
      if (pwd.contains(String.valueOf(sp)))
        isSP = true;
    }

    if (!isSP && pwd.length() >= 12) {
      System.out.println("strong");
    } else {
      System.out.println("weak");
    }


  }



}
