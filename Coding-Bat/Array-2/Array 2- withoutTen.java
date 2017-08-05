/*Return a version of the given array where all the 10's have been removed. 
The remaining elements should shift left towards the start of the array as needed,
and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}*/

public int[] withoutTen(int[] nums){
  for(int x=0;x<nums.length;x++){
    while(nums[x]==10){
      for(int c=x;c<nums.length-1;c++){
        nums[c]=nums[c+1];
      }
      nums[nums.length-1]=0;
    }
  }
  return nums;
}
