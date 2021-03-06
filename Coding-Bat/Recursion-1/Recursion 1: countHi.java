/*Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.*/

public int countHi(String str){
  if(str.length()<=2 && !str.equals("hi")) return 0;
  if(str.equals("hi")) return 1;
  if((str.substring(0,2)).equals("hi")) return 1+countHi(str.substring(1,str.length()));
  return countHi(str.substring(1,str.length()));
}
