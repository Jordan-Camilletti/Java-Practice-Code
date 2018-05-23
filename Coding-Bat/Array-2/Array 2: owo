/*Return an array that contains the exact same numbers as the given array,
but rearranged so that all the zeros are grouped at the start of the array. 
The order of the non-zero numbers does not matter.*/

public int[] zeroFront(int[] nums) {
  int[] nums2= new int[nums.length];
  int nZ=0,n=nums.length-1;
  for(int x:nums){
    if(x==0){
      nums2[nZ]=0;
      nZ+=1;
    }else{
      nums2[n]=x;
      n-=1;
    }
  }
  return(nums2);
}
