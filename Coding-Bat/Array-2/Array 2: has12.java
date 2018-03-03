/*We'll say that an element in an array is "alone" if there are values before and after it,
and those values are different from it.
Return a version of the given array where every instance of the given value which is alone is replaced by 
whichever value to its left or right is larger.*/

public boolean has12(int[] nums) {
  for(int i=0;i<nums.length;i++){
    if(nums[i]==1){
      for(int n=i;n<nums.length;n++){
        if(nums[n]==2)
          return(true);
      }
    }
  }
  return(false);
}
