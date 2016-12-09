/*Return the sum of the numbers in the array, 
except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). 
Return 0 for no numbers.*/

public int sum67(int[] nums) {
  int tot=0;
  boolean six=false;
  for(int x=0;x<nums.length;x++){
    if(!six){
      if(nums[x]==6){
        six=true;
      }else{
        tot=tot+nums[x];
      }
    }else{
      if(nums[x]==7){
        six=false;
      }
    }
  }
  return tot;
}
