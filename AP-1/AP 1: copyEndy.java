/*We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). 
Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array.
Decompose out a separate isEndy(int n) method to test if a number is endy.
The original array will contain at least "count" endy numbers.*/

public boolean isEndy(int num){
  return((num>=0 && num<=10)||(num>=90 && num<=100));
}

public int[] copyEndy(int[] nums, int count) {
  int arr[] = new int[count];
  int tot=0;
  for(int x=0;x<nums.length;x++){
    if(tot==count){
      break;
    }
    if(isEndy(nums[x])){
      arr[tot]=nums[x];
      tot++;
    }
  }
  return arr;
}
