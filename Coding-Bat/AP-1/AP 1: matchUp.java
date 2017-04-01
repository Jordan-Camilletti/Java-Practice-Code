/*Given 2 arrays that are the same length containing strings, 
compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. 
Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.*/

public int matchUp(String[] a, String[] b) {
  int total=0;
  for(int x=0;x<a.length;x++){
    if(!a[x].equals("") && !b[x].equals("") && a[x].substring(0,1).equals(b[x].substring(0,1))) total++;
  }
  return total;
}
