/*Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.*/

public String[] wordsFront(String[] words, int n) {
  String[] arr= new String[n];
  for(int x=0;x<n;x++){
    arr[x]=words[x];
  }
  return arr;
}
