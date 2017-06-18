/*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.*/

public boolean gHappy(String str) {
  String arr[]=str.split("");
  if(str.length()==1) return false;
  if(str.length()==0||str.equals("gg")) return true;
  for(int x=0;x<arr.length;x++){
    if(arr[x].equals("g")){
      if(x==0&&!arr[x+1].equals("g")) return false;
      else if(x==arr.length-1&&!arr[x-1].equals("g")) return false;
      else if(!arr[x-1].equals("g")&&!arr[x+1].equals("g")) return false;
    }
  }
  return true;
}
