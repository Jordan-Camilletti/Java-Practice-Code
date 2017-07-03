/*Given an array of ints, is it possible to divide the ints into two groups,
so that the sum of one group is a multiple of 10, 
and the sum of the other group is odd. Every int must be in one group or the other.
Write a recursive helper method that takes whatever arguments you like,
and make the initial call to your recursive helper from splitOdd10().*/

public boolean stuff(int[] nums, int g1, int g2, int c){
  if(c>=nums.length) return((g1%10==0&&g2%2!=0)||(g1%2!=0&&g2%10==0));
  return(stuff(nums,g1,g2+nums[c],c+1)||stuff(nums,g1+nums[c],g2,c+1));
}

public boolean splitOdd10(int[] nums){
  return(stuff(nums,0,0,0));
}
