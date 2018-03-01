/*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.*/

public boolean either24(int[] nums) {
  boolean a=false,b=false;
  for(int n=1;n<nums.length;n++){
    if(nums[n]==2 && nums[n-1]==2)
      a=true;
    if(nums[n]==4 && nums[n-1]==4)
      b=true;
  }
  return(a^b);
}
