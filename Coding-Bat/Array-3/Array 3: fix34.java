/*Return an array that contains exactly the same numbers as the given array, 
but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's,but every other number may move. 
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3,
and a 3 appears in the array before any 4*/

public int[] fix34(int[] nums) {
  for(int n=0;n<nums.length-1;n++){
    if(nums[n]==3){
      for(int n2=1;n2<nums.length;n2++){
        if(nums[n2]==4 && nums[n2-1]!=3){
          nums[n2]=nums[n+1];
          nums[n+1]=4;
        }
      }
    }
  }
  return(nums);
}
