/*Given a non-empty array,
return true if there is a place to split the array 
so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.*/

public boolean canBalance(int[] nums) {
  int tot1=0,tot2=0;
  for(int x=0;x<nums.length;x++){
    tot1=0;
    tot2=0;
    for(int y=0;y<x;y++){
      tot1+=nums[y];
    }
    for(int z=x;z<nums.length;z++){
      tot2+=nums[z];
    }
    if(tot1==tot2) return true;
  }
  return false;
}
