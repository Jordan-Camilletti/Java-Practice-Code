/*We have an array of heights, representing the altitude along a walking trail. 
Given start/end indexes into the array, 
return the number of "big" steps for a walk starting at the start index and ending at the end index. 
We'll say that step is big if it is 5 or more up or down. 
The start end end index will both be valid indexes into the array with start <= end.*/

public int bigHeights(int[] heights, int start, int end) {
  int steps=0;
  for(int x=start;x<end;x++){
    if(Math.abs(heights[x+1]-heights[x])>=5) steps++;
  }return steps;
}
