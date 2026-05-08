import java.util.Scanner;

public class Power2 {

static int pow(int p, int q){
  if(q==0) return 1;

  int smallpow = pow(p, q / 2);
 if(q % 2 ==0  ){   //If q is  Even
   return smallpow * smallpow;
 }
        // If q is  Odd
  return p*smallpow*smallpow;
 

}

  public static void main(String[] args) {
    // System.out.println(pow(5,4));
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter values: ");
    int p = sc.nextInt();
    int q = sc.nextInt();
    System.out.print("Powers are: ");
System.out.println(pow(p,q));
  }
}
