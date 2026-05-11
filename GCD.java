import java.util.Scanner;

public class GCD {



 

  static int iGCD(int a, int b) {

    while (a % b != 0) {
      int rem = a % b;
      a = b;
      b = rem;
    }
return b;
  }


  static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int b = sc.nextInt();
    System.out.print("Your iGCD is: ");
    System.out.println(iGCD(a, b));
    System.out.print("Your GCD is: ");
    System.out.println(gcd(a, b));
  }
}

