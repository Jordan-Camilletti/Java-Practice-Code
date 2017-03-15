/*Given two arrays, A and B, of non-negative int scores.
A "special" score is one which is a multiple of 10, such as 40 or 90. 
Return the sum of largest special score in A and the largest special score in B. To practice decomposition,
write a separate helper method which finds the largest special score in an array. 
Write your helper method after your scoresSpecial() method in the JavaBat text area.*/

public int biggest(int[] arr){
  int top=0;
  for(int x=0;x<arr.length;x++){
    if(arr[x]>top&&arr[x]%10==0) top=arr[x];
  }
  return top;
}

public int scoresSpecial(int[] a, int[] b){
  return biggest(a)+biggest(b);
}
