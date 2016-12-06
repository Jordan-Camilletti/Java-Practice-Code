/*Return the number of times that the string "hi" appears anywhere in the given string.*/

public int countHi(String str) {
  String[] wrd=str.split("");
  String hi="hi";
  int total=0;
  for(int x=0;x<str.length();x++){
    if((wrd[x].equals("h"))&&(wrd[x+1].equals("i"))){
      total = total+1;
    }
  }
  return total;
}
