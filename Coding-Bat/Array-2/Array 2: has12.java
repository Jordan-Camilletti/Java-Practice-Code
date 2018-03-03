/*Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.*/

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
