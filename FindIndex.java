public class FindIndex {

  static int Find(int[] arr, int n, int target, int idx) {
    if (idx >= n) {
      return -1;
    }
    if (arr[idx] == target)

    {
      return idx;
    }
    return Find(arr, n, target, idx+1);

  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int n = arr.length;
    int target = 8;
    int x= Find(arr, n, target, 0);
    System.out.println("Index:" +  x);
//  if(x!=-1){
//   System.out.println("Yes");
//  }
//  else{
//   System.out.println("False");
//  }
//   }
}}
