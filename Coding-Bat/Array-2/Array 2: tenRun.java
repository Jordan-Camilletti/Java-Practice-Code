/*For each multiple of 10 in the given array,
change all the values following it to be that multiple of 10, 
until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.*/

public int[] tenRun(int[] nums) {
  int curr=1;
  for(int x=0;x<nums.length;x++){
    if(nums[x]%10==0){
      curr=nums[x];
    }else if(curr!=1){
      nums[x]=curr;
    }
  }
  return nums;
}
