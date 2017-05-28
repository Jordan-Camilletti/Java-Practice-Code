/*Given an array of ints, return true if every element is a 1 or a 4.*/

public boolean only14(int[] nums){
  for(int x=0;x<nums.length;x++){
    if(nums[x]!=1&&nums[x]!=4) return false;
  }
  return true;
}
