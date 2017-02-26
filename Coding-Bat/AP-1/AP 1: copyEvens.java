/*Given an array of positive ints, 
return a new array of length "count" containing the first even numbers from the original array.
The original array will contain at least "count" even numbers.*/

public int[] copyEvens(int[] nums, int count) {
  int[] arr=new int[count];
  int n=0;
  for(int x=0;x<nums.length;x++){
    if(nums[x]%2==0){
      arr[n]=nums[x];
      n++;
    }
    if(n==count) break;
  }
  return arr;
}
