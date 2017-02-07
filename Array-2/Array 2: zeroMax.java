/*Return a version of the given array where each zero value in the array is replaced
by the largest odd value to the right of the zero in the array.
If there is no odd value to the right of the zero, leave the zero as a zero.*/

public int next(int[] arr,int start){
  if(start>=arr.length-1) return 0;
  int top=0;
  for(int x=start;x<arr.length;x++){
    if(arr[x]%2!=0&&arr[x]>=top) top=arr[x];
  }return top;
}

public int[] zeroMax(int[] nums) {
  if(nums.length==0) return nums;
  int[] newArr=new int[nums.length];
  for(int x=0;x<newArr.length;x++){
    if(nums[x]==0){
      newArr[x]=next(nums,x);
    }else{
      newArr[x]=nums[x];
    }
  }
  return newArr;
}
