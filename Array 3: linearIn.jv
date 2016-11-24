/*Given two arrays of ints sorted in increasing order, outer and inner,
return true if all of the numbers in inner appear in outer.*/

public boolean linearIn(int[] outer, int[] inner) {
  int count=0;
  for(int n=0;n<inner.length;n++){
    for(int x=0;x<outer.length;x++){
      if(x==0){
        if(outer[x]==inner[n]){
          count=count+1;
        }
      }else{
        if(outer[x]==inner[n]&&outer[x-1]!=outer[x]){
          count=count+1;
        }
      }
    }
  }
  if(count>=inner.length){
    return true;
  }
  return false;
}
