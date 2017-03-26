/*Return true if the given string contains an appearance of "xyz",
where the xyz is not directly preceeded by a period (.).
So "xxyz" counts but "x.xyz" does not.*/

public boolean xyzThere(String str) {
  String arr[]=str.split("");
  for(int x=1;x<str.length()-1;x++){
    if(arr[x].equals("x")&&arr[x+1].equals("y")&&arr[x+2].equals("z")&&!arr[x-1].equals(".")){
      return true;
    }
  }
  return false;
}
