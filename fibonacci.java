public class fibonacci {
  static int fib(int n) {

    // Base Case

    // if(n==0){
    // return n;
    // }

    // if(n==1){
    // return n;
    // }

    if (n == 0 || n == 1) {
      return n;
    }
    // subproblem/smallAns-recursive work

    int prev = fib(n - 1);
    int prevprev = fib(n - 2);

    // self work

    int ans = prev + prevprev;
    return ans;

  }

  public static void main(String[] args) {
System.out.println(fib(6));
  }

}
