/*Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : 
{0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).*/

public int[] squareUp(int n) {
  int num=0;
  int[] arr=new int[n*n];
  for(int curr=1;curr<=n;curr++){
    for(int zeros=0;zeros<n-curr;zeros++){
      arr[num]=0;
      num++;
    }
    for(int nums=curr;nums>0;nums--){
      arr[num]=nums;
      num++;
    }
  }
  return arr;
}
