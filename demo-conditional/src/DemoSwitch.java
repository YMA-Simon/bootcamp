public class DemoSwitch {

  public static void main(String[] args) {

    int age = 18;
    boolean isAdult = false;
    if (age >= 18) {
      isAdult = true;
    }

    // 1. if no break, it will go through all cases
    // 2. no logic operator for each case, only compare
    // 3. this is only useful for finite scenarios

    String dayInput = "TUE";
    boolean isWeekDay = true;
    switch (dayInput) {
      case "MON":
        break;
      case "TUE":
        break;
      case "WED":
        break;
      case "THU":
        break;
      case "FRI":
        break;
      case "SAT":
        isWeekDay = false;
        break;
      case "SUN":
        isWeekDay = false;
        break;
      default:
        break;
    }

    // if no break, it will run the rest statements
    // for noBreak = 10, print at case 10, case 9, case 1, and case def
    // for noBreak = 9, print at case 9, case 1, and case def
    int noBreak = 9;
    switch (noBreak) {
      case 11:
        System.out.println(noBreak);
      case 10:
        System.out.println(noBreak);
      case 9:
        System.out.println(noBreak);
      case 1:
        System.out.println(noBreak);
        // break;
      default:
        System.out.println("def");
        break;
    }

  }

}
