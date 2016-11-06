/*Given n>=0, create an array with the pattern {1,   1, 2,   1, 2, 3,  ... 1, 2, 3 .. n} (spaces added to show the grouping). 
Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.*/

public int[] seriesUp(int n){
  int i=0;
  int tot=0;
  for(int x1=0;x1<=n;x1++){
    i=i+x1;
  }
  int[] arr=new int[i];
  for(int x=1;x<n+2;x++){
    for(int x2=1;x2<x;x2++){
      arr[tot]=x2;
      tot=tot+1;
    }
  }
  return arr;
}
