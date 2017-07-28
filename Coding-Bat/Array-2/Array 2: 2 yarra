/*Return an array that contains the exact same numbers as the given array,
but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order.*/

public int[] evenOdd(int[] nums) {
  int[] arr=new int[nums.length];
  int a=0;
  int b=nums.length-1;
  for(int x=0;x<nums.length;x++){
    if(nums[x]%2==0){
      arr[a]=nums[x];
      a+=1;
    }else{
      arr[b]=nums[x];
      b-=1;
    }
  }
  return arr;
}
