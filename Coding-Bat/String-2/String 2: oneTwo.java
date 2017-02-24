/*Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
Ignore any group of fewer than 3 chars at the end.*/

public String oneTwo(String str) {
  String arr[]=str.split("");
  String wrd="";
  for(int x=0;x<str.length();x+=3){
    if(str.length()-3>=x){
      wrd=wrd+arr[x+1]+arr[x+2]+arr[x];
    }
  }
  return wrd;
}
