/*Given an array of ints, return true if the array contains two 7's next to each other, 
or there are two 7's separated by one element, such as with {7, 1, 7}.*/

public boolean has77(int[] nums) {
  if(nums.length>=2 && nums[nums.length-2]==7&&nums[nums.length-1]==7) return true;
  for(int x=0;x<nums.length-2;x++){
    if(nums[x]==7&&(nums[x+1]==7||nums[x+2]==7)) return true;
  }return false;
}
