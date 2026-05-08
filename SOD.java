import java.util.Scanner;

public class SOD {

  static int SumOfDigit(int n) {

    //Base Case
    if (n >= 0 && n <= 9)  return n;
    

    // int smallAns = SumOfDigit(n / 10);

    // int ans = smallAns + n % 10;

    // return ans;


    return SumOfDigit(n/10) + n%10;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter dighits: ");
    int n = sc.nextInt();
    System.out.print("Sum of digits are: ");
    System.out.println(SumOfDigit(n));

  }
}