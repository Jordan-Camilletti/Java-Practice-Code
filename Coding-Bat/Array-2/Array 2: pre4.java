/*Given a non-empty array of ints, 
return a new array containing the elements from the original array that come before the first 4 in the original array.
The original array will contain at least one 4.*/

public int[] pre4(int[] nums) {
  int c=0;
  for(int n=nums.length-1;n>=0;n--){
    if(nums[n]==4) c=n;
  }
  int newArr[]=new int[c];
  c=0;
  for(int n: nums){
    if(n==4){
      return newArr;
    }else{
      newArr[c]=n;
      c+=1;
    }
  }
  return newArr;
}
