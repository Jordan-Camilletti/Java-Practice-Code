/*Given a non-empty array of ints,
return a new array containing the elements from the original array that come after the last 4 in the original array.
The original array will contain at least one 4. 
Note that it is valid in java to create an array of length 0.*/

public int[] post4(int[] nums) {
  for(int n=nums.length;n>0;n--){
    if(nums[n-1]==4){
      int[] nums2=new int[nums.length-n];
      return(Arrays.copyOfRange(nums,n,nums.length));
    }
  }
  return(nums);
}
