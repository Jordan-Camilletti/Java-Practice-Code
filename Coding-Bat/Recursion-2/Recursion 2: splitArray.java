/*Given an array of ints, is it possible to divide the ints into two groups, 
so that the sums of the two groups are the same. Every int must be in one group or the other. 
Write a recursive helper method that takes whatever arguments you like, 
and make the initial call to your recursive helper from splitArray().*/

public boolean meth(int[] nums, int g1, int g2, int c){
  if(c>=nums.length) return (g1==g2);
  return(meth(nums,g1+nums[c],g2,c+1)||meth(nums,g1,g2+nums[c],c+1));
}

public boolean splitArray(int[] nums) {
  return(meth(nums,0,0,0));
}
