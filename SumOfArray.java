public class SumOfArray{

static int SOA(int [] arr, int idx){

  //base case
  if(idx==arr.length){   //For Empty Array 
    return 0;  
  }

  //Recursive Work
  int smallAns = SOA(arr, idx+1);
  
  return smallAns + arr[idx];
  
  
}

  public static void main(String[] args) {
    int [] arr = {1, 2,3};
    System.out.print("Sum Of Array is: ");
    System.out.println(SOA(arr,0));
    
    
  }
} 