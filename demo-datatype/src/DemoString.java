public class DemoString {
  public static void main(String[] args) {
    String abc;
    abc = "hello world";

    // double quote is reserved for string, so following would not work
    // abc = 'hello world';

    String empty = "";

    // string concat
    // string + string
    String a1 = abc + abc;
    System.out.println(a1);

    // += also work
    String a11 = abc;
    a11 += "sadasdsadas";
    System.out.println(a11);


    // string + int, int casted to string
    String a2 = abc + 1;

    // string + bool, bool casted to string
    String a3 = abc + true;

    // string + char, char casted to string
    String a4 = abc + '!';


    System.out.println("-----------");
    // exp1
    int age = 10;
    System.out.println("yo, " + age + " years old kid");

    System.out.println("-----------");
    String str1 = "example";
    String str2 = "example";
    boolean ans = str1 == str2;
    System.out.println(ans);

    // since string is a complex type/ object, there is method associated with it
    System.out.println(str1.equals(str2));

    // length return int only
    int l = "asdasdasd".length();
    // short l = "asdasdasd".length();

    // charAt take int, and return char
    char get = str1.charAt(2); // 'a'
    // char get = str1.charAt(-1); runtime error
    // char get = str1.charAt(100); runtime error


  }
}
