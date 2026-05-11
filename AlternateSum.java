
import java.util.Scanner;

public class AlternateSum {

  static int Alternate(int n) {
    if (n == 0)
      return n;
    if (n % 2 == 0) {
      return Alternate(n - 1) - n; // Even number
    } else {
      return Alternate(n - 1) + n; //Odd Number
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no:  ");
    int n = sc.nextInt();
    System.out.println(Alternate(n));
  }
}
