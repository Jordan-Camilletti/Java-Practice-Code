/*Given a string,return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).*/

public boolean equalIsNot(String str) {
  String[] arr=str.split("");
  int not=0;
  int is=0;
  for(int x=0;x<arr.length-1;x++){
    if(arr[x].equals("n")&&arr[x+1].equals("o")&&arr[x+2].equals("t")){
      not=not+1;
    }else if(arr[x].equals("i")&&arr[x+1].equals("s")){
      is=is+1;
    }
  }
  if(is==not){
    return true;
  }
  return false;
}
