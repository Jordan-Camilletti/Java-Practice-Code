/**/

public boolean either24(int[] nums) {
  boolean a=false,b=false;
  for(int n=1;n<nums.length-1;n++){
    if(nums[n]==2 && nums[n-1]==2)
      a=true;
    if(nums[n]==4 && nums[n-1]==4)
      b=true;
  }
  return(a^b);
}
