/*Given an array of ints,
compute recursively if the array contains somewhere a value followed in the array by that value times 10. 
We'll use the convention of considering only the part of the array that begins at the given index.*/

public boolean array220(int[] nums, int index) {
  if(index>=nums.length) return false;
  if(index>0 && nums[index-1]*10==nums[index]) return true;
  return array220(nums,index+1);
}
