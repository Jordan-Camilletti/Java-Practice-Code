/*Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.*/

public boolean tripleUp(int[] nums) {
  if(nums.length<3) return false;
  for(int x=0;x<nums.length-2;x++){
    if(nums[x]+1==nums[x+1]&&nums[x]+2==nums[x+2]) return true;
  }return false;
}
