/*We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, 
the same group appears in reverse order.
For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
Return the size of the largest mirror section found in the given array*/

public boolean isIn(int[] nums, int startPos, int subLen){
  int[] slice=new int[subLen+1];
  boolean inArray=false;
  for(int n=startPos;n<startPos+subLen+1;n++){
    slice[subLen-(n-startPos)]=nums[n];
  }
  for(int n=0;n<=nums.length-slice.length;n++){
    if(nums[n]==slice[0]){
      inArray=true;
      for(int n2=0;n2<slice.length;n2++){
        if(slice[n2]!=nums[n2+n]) inArray=false;
      }
      if(inArray) return(true);
    }
  }
  return(false);
}

public int maxMirror(int[] nums){
  int longest=0;
  for(int startPos=0;startPos<nums.length;startPos++){
    for(int subLen=0;subLen<nums.length-startPos;subLen++){
      if(isIn(nums,startPos,subLen) && subLen+1>longest){
        longest=subLen+1;
      }
    }
  }
  return(longest);
}
