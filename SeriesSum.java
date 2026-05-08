
import java.util.Scanner;

public class SeriesSum{

static  int SeriesSumOne(int n){
  if(n==0)
    return 0;
  
int smallAns = SeriesSumOne(n-1);
   return smallAns +n;

}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any digit");
    int n =  sc.nextInt();
    System.out.println(SeriesSumOne(n));
  }
  
}