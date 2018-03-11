/*Given an array of ints, return true if every 2 that appears in the array is next to another 2.*/

public boolean twoTwo(int[] nums) {
  if(nums.length==1 && nums[0]==2)
    return(false);
  for(int n=0;n<nums.length;n++){
    if(n==0 && nums[n]==2 && nums[n+1]!=2){
      return(false);
    }else if(n==nums.length-1 && nums[n]==2 && nums[n-1]!=2){
      return(false);
    }else if(n!=0 && n!=nums.length-1 &&nums[n]==2 && (nums[n+1]!=2 && nums[n-1]!=2))
      return(false);
  }
  return(true);
}
