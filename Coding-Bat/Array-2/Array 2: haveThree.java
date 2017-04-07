/**/

public boolean haveThree(int[] nums){
  int count=0;
  if(nums.length>=2 && nums[nums.length-1]==3&&nums[nums.length-2]!=3) count=1;
  for(int x=0;x<nums.length-1;x++){
    if(nums[x]==3&&nums[x+1]!=3) count++;
  }return (count==3);
}
