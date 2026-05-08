
import java.util.Scanner;



public class Recursion {


static void printInc(int n) {
    if (n==1){
      System.out.println("your numbers are: ");
      System.out.println(n);
      return;
    }
    printInc(n-1);
    System.out.println(n);
}

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
    int n =sc.nextInt();
    printInc(n);
  }
}
