/*Given a string, consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string? */

public boolean prefixAgain(String str, int n) {
  String pre=str.substring(0,n);
  String current="";
  for(int x=1;x<=str.length()-n;x++){
    current=str.substring(x,n+x);
    if(pre.equals(current)){
      return true;
    }
  }
  return false;
}
