/*For every element in nums1, consider the corresponding element in nums2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
Both num1 and num2 will be of equal length.*/

public int matchUp(int[] num1, int[] num2) {
  int tot=0;
  for(int x=0;x<num1.length;x++){
    if(num1[x]!=num2[x] && Math.abs(num1[x]-num2[x])<=2){
      tot++;
    }
  }
  return tot;
}
