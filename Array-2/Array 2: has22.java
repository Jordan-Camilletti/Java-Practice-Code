/*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.*/

public boolean has22(int[] nums) {
  for(int x=0;x<nums.length-1;x++){
    if(nums[x]==2&&nums[x+1]==2){
      return true;
    }
  }
  return false;
}
