/*We'll say that an element in an array is "alone" if there are values before and after it,and those values are different from it.
Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.*/

public int[] notAlone(int[] nums, int val) {
  if(nums.length<=1) return nums;
  for(int x=1;x<nums.length-1;x++){
    if(nums[x]==val&&nums[x-1]!=val&&nums[x+1]!=val){
      if(nums[x-1]>nums[x+1]) nums[x]=nums[x-1];
      else nums[x]=nums[x+1];
    }
  }
  return(nums);
}
