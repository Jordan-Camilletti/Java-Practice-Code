/*We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.*/

public boolean dividesSelf(int n){
  String arr[]=(Integer.toString(n)).split("");
  for(int x=0;x<arr.length;x++){
    if(Integer.parseInt(arr[x])==0 || n%Integer.parseInt(arr[x])!=0) return false;
  }return true;
}
