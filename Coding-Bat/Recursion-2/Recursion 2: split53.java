/*Given an array of ints, is it possible to divide the ints into two groups,
so that the sum of the two groups is the same, with these constraints: 
all the values that are multiple of 5 must be in one group,
and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other.*/

public boolean stuff(int[] nums, int g1, int g2, int c){
  if(c>=nums.length) return(g1==g2);
  if(nums[c]%5==0) return(stuff(nums,g1+nums[c],g2,c+1));
  if(nums[c]%3==0) return(stuff(nums,g1,g2+nums[c],c+1));
  return(stuff(nums,g1+nums[c],g2,c+1)||stuff(nums,g1,g2+nums[c],c+1));
}

public boolean split53(int[] nums) {
  return(stuff(nums,0,0,0));
}
