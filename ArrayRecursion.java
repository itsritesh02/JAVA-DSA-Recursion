public class ArrayRecursion {

  static void printArr(int[] arr, int idx) { // 5, 6, 7, 8, 9

    // base case

    if (idx == arr.length) {
      return;
    }

    // self work

    System.out.println((arr[idx])); // 5
    // recursive work
    printArr(arr, idx + 1); // 6 7 8 9
  }

  static int ArrayMax(int[] arr, int idx) {
    // base case

    if (idx == arr.length - 1) {
       return arr[idx];
    }

    // small problem --> idx+1, end of the Array --> max --> recursive work
    int smallAns = ArrayMax(arr, idx + 1);

    // self work and final ans
    return Math.max(arr[idx], smallAns);

  }

  public static void main(String[] args) {
    int[] arr = { 5, 6, 17, 8, 9 };
    printArr(arr, 0);
    System.out.print("Array Max: ");
    System.out.println(ArrayMax(arr, 0));
  }
}
