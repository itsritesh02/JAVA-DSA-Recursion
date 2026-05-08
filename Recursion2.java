import java.util.Scanner;

public class Recursion2 {


  static void printDec(int n) {
      if(n==1){
        System.out.println("Enter any number");
        System.out.println(n);
        return;
      }
      System.out.println(n);
      printDec(n-1);
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc .nextInt();
    printDec(n);
  }
}
