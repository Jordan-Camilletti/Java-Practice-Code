/*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, 
and at the very end of the string in reverse order (possibly overlapping).*/

public String mirrorEnds(String wrd){
  String str="";
  for(int l=0;l<wrd.length();l++){
    if(!(wrd.substring(l,l+1)).equals(wrd.substring(wrd.length()-1-l,wrd.length()-l))) return str;
    str+=wrd.substring(l,l+1);
  }
  return str;
}
