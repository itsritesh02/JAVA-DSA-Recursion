
import java.util.Scanner;

public class power {

  static int pow(int p, int q) {
    if (q == 0)
      return 1; // Base Case
    int smallAns = pow(p, q - 1); // smaller problem
    return smallAns * p;// p^q-1 * p  = p^q self work
  }

  public static void main(String[] args) {
    // System.out.println(pow(5,4));
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter values");
    int p = sc.nextInt();
    int q = sc.nextInt();
    System.out.println("power is: ");
    System.out.println(pow(p, q));
  }

}
