/*Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.*/

public int countCode(String str) {
  String[] wrd=str.split("");
  int total=0;
  for(int x=0;x<str.length()-2;x++){
    if(wrd[x].equals("c")&&wrd[x+1].equals("o")&&wrd[x+3].equals("e")){
      total=total+1;
    }
  }
  return total;
}
