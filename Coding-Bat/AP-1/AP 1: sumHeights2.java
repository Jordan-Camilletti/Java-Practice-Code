/*We have an array of heights, representing the altitude along a walking trail. 
Given start/end indexes into the array, 
return the sum of the changes for a walk beginning at the start index and ending at the end index, 
however increases in height count double.
For example, with the heights {5, 3, 6, 7, 2} and start=2,end=4 yields a sum of 1*2 + 5 = 7. 
The start end end index will both be valid indexes into the array with start <= end.*/

public int sumHeights2(int[] heights, int start, int end){
  int height=heights[start];
  int alt=0;
  for(int x=start+1;x<=end;x++){
    if(heights[x]>height) alt+=((Math.abs(heights[x]-height))*2);
    else alt+=(Math.abs(heights[x]-height));
    height=heights[x];
  }
  return alt;
}
