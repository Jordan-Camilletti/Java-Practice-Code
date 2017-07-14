/*Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
Return the number of clumps in the given array.*/

public int countClumps(int[] nums) {
  int clumps=0;
  boolean in=false;
  for(int n=0;n<nums.length-1;n++){
    if(nums[n]==nums[n+1]&&!in){
      in=true;
      clumps++;
    }else if(nums[n]!=nums[n+1]){
      in=false;
    }
  }
  return clumps;
}
