/*Given a string and an int n,
return a string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive.*/

public String repeatEnd(String str, int n) {
  if(n==0){
    return "";
  }
  String wrd="";
  String wrd1="";
  String[] arr=str.split("");
  for(int x=str.length()-(n-1);x<str.length()+1;x++){
    wrd=wrd+arr[x];
  }
  for(int x1=0;x1<n;x1++){
    wrd1=wrd1+wrd;
  }
  return wrd1;
}
