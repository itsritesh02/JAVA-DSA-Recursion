public class FindAllIndices {
  
  static void FindAll(int[] arr, int n, int target, int idx) {
    if (idx >= n) {
      return;
    }
    if (arr[idx] == target)

    {
      System.out.println(idx);
    }

    // Recursive call
     FindAll(arr, n, target, idx + 1);

  }

  public static void main(String[] args) {
    int[] arr = { 1, 5, 3, 5, 5 };
    int n = arr.length;
    int target = 5;
    FindAll(arr, n, target, 0);
    
}
}