/*Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.*/

public boolean endOther(String a1, String b1) {
  String a=a1.toLowerCase();
  String b=b1.toLowerCase();
  if(a.length()>b.length()){
    return(a.substring(a.length()-b.length()).equals(b));
  }else{
    return(b.substring(b.length()-a.length()).equals(a));
  }
}
