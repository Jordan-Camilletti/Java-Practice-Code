/*We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, 
at least one of the pair is that value. Return true if the given value is everywhere in the array./*

public boolean isEverywhere(int[] nums, int val) {
  boolean t1=true;
  boolean t2=true;
  for(int x=0;x<nums.length;x+=2){
    if(nums[x]!=val) t1=false;
  }
  for(int x=1;x<nums.length;x+=2){
    if(nums[x]!=val) t2=false;
  }
  return t1||t2;
}

