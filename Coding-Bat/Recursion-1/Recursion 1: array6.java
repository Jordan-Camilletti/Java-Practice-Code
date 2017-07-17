/*Given an array of ints, compute recursively if the array contains a 6.
We'll use the convention of considering only the part of the array that begins at the given index*/

public boolean array6(int[] nums, int index) {
  if(index>=nums.length) return false;
  if(nums[index]==6) return true;
  return(array6(nums,index+1));
}
