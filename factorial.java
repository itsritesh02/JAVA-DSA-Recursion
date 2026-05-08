public class factorial {

  static int fact(int n) {
    // base case
    if (n == 0)
      return 1;
    // smaller problem-recursive work

    int smallAns = fact(n - 1);
    // big problem -self work
    int ans = n * smallAns;

    return ans;

  }

  public static void main(String[] args) {
    System.out.println(fact(4));
  }
}
