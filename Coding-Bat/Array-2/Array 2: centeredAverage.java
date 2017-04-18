/*Return the "centered" average of an array of ints,
which we'll say is the mean average of the values, 
except ignoring the largest and smallest values in the array. 
If there are multiple copies of the smallest value, 
ignore just one copy, and likewise for the largest value.*/

public int centeredAverage(int[] nums){
  int biggest=nums[0],smallest=nums[0],tot=0;
  for(int x=0;x<nums.length;x++){
    tot+=nums[x];
    if(biggest<nums[x]) biggest=nums[x];
    if(smallest>nums[x]) smallest=nums[x];
  }
  tot-=(biggest+smallest);
  return tot/(nums.length-2);
}
