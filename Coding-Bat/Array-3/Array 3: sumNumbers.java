/*Given a string, return the sum of the numbers appearing in the string, 
ignoring all other characters. A number is a series of 1 or more digit chars in a row.*/

public int sumNumbers(String str) {
  int tot=0;
  String newStr="";
  for(int x=0;x<str.length();x++){
    char y=(str.substring(x,x+1)).charAt(0);
    if(!Character.isDigit(y)) newStr=newStr+" ";
    else newStr=newStr+str.substring(x,x+1);
  }
  for(String s: newStr.split(" ")){
    if(!s.equals(" ")&&!s.equals("")) tot+=Integer.parseInt(s);
  }
  return tot;
}
