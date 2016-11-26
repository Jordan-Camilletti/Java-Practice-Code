/*We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string. The triples may overlap.*/

public int countTriple(String str) {
  int tot=0;
  String[] arr=str.split("");
  for(int x=0;x<str.length()-1;x++){
    if(arr[x].equals(arr[x+1])&&arr[x+1].equals(arr[x+2])){
      tot+=1;
    }
  }
  return tot;
}
