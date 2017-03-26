/*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. 
So "xxy" is balanced, but "xyx" is not. 
One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.*/

public boolean xyBalance(String str) {
  boolean bal=true;
  String arr[]=str.split("");
  for(int x=0;x<=str.length();x++){
    if(arr[x].equals("x")) bal=false;
    if(!bal && arr[x].equals("y")) bal=true;
  }
  return bal;
}
