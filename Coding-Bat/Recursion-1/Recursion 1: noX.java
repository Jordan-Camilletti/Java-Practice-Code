/*Given a string, compute recursively a new string where all the 'x' chars have been removed.*/

public String noX(String str) {
  if(str.equals("x")) return "";
  else if(str.length()<=1) return str;
  if((str.substring(0,1)).equals("x")) return noX(str.substring(1,str.length()));
  return str.substring(0,1)+noX(str.substring(1,str.length()));
}
