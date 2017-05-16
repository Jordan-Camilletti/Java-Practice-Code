/*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".*/

public String zipZap(String str) {
  for(int x=0;x<str.length()-2;x++){
    if((str.substring(x,x+1)).equals("z")&&(str.substring(x+2,x+3)).equals("p")){
      str=str.substring(0,x+1)+str.substring(x+2,str.length());
    }
  }
  return str;
}
