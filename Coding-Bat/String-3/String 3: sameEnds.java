/**/

public String sameEnds(String str){
  for(int x=str.length()/2;x>0;x--){
    if((str.substring(0,x)).equals(str.substring(str.length()-x,str.length()))) return str.substring(0,x);
  }
  return "";
}
