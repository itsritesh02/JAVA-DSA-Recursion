public class Search {

  static boolean search(int[] arr, int n, int target, int idx) {

    //Base Case
    if (idx >= n)
      return false;
//self Work
    if (arr[idx] == target)
      return true;
//recursive work
    // if (search(arr, n, target, idx + 1) == true) {
    //   return true;
    // } else {
    //   return false;
    // }


    //----------------or---------------
return search(arr, n, target, idx + 1);

  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 8, 6 };

    int target = 9;
    // System.out.println(search(arr, arr.length, target, 0));
    if(search(arr, arr.length, target, 0)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }


  }
}
