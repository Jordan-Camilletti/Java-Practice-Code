/*Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. 
Return 0 if there are no digits in the string.*/

public int sumDigits(String str){
  int tot=0;
  String arr[]=str.split("");
  char current;
  for(int x=0;x<str.length();x++){
    current=str.charAt(x);
    if(Character.isDigit(current)){
      tot=tot+Character.getNumericValue(current);
    }
  }return tot;
}
