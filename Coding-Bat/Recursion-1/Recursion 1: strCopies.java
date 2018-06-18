/*Given a string and a non-empty substring sub, 
compute recursively if at least n copies of sub appear in the string somewhere,
possibly with overlapping.
N will be non-negative.*/

public boolean strCopies(String str, String sub, int n) {
  if(str.length()<sub.length()) return(n==0);
  if(str.equals(sub)) return(n==1);
  if(str.substring(0,sub.length()).equals(sub)){
    return(strCopies(str.substring(1),sub,n-1));
  }else{
    return(strCopies(str.substring(1),sub,n));
  }
}
