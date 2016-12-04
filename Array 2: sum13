/*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
so it does not count and numbers that come immediately after a 13 also do not count.*/

public int sum13(int[] nums) {
  int total=0;
  for(int x=0;x<nums.length;x++){
    if(x!=0){
      if(nums[x]!=13){
        if(nums[x-1]!=13){
        total=total+nums[x];
        }
      }
    }else{
      if(nums[0]!=13){
        total=total+nums[0];
      }
    }
  }
  return total;
}
