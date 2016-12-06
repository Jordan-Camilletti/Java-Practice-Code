/*Given a string, return a string where for every char in the original, there are two chars.*/

public String doubleChar(String str) {
  String wrd="";
  String[] str1=str.split("");
  for(int x=0;x<str.length()+1;x++){
    wrd=wrd+str1[x];
    wrd=wrd+str1[x];
  }
  return wrd;
}
