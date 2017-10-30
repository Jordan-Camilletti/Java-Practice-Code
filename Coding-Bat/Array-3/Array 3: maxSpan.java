/*Consider the leftmost and righmost appearances of some value in an array.
We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. 
Returns the largest span found in the given array.
(Efficiency is not a priority.)#me_irl*/

public int maxSpan(int[] nums){
  int tot=0,leftMost=0,rightMost=0;
  for(int n=0;n<nums.length;n++){
    if(nums[n]==nums[0]) rightMost=n+1;
  }
  for(int n=nums.length-1;n>=0;n--){
    if(nums[n]==nums[nums.length-1]) leftMost=nums.length-n;
  }
  return((leftMost>rightMost) ? leftMost:rightMost);
}
