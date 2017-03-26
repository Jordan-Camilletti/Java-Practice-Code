/*Return a version of the given string, 
where for every star (*) in the string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".*/

public String starOut(String str) {
  if(str==""){
    return "";
  }
  String[] arr=str.split("");
  String wrd="";
  for(int x=0;x<arr.length;x++){
    if(x==0){
      if(!(arr[x].equals("*"))&&!(arr[x+1].equals("*"))){
        wrd=wrd+arr[x];
      }
    }else if(x==arr.length-1){
      if(!(arr[x].equals("*"))&&!(arr[x-1].equals("*"))){
        wrd=wrd+arr[x];
      }
    }else{
      if(!(arr[x].equals("*"))&&!(arr[x-1].equals("*"))&&!arr[x+1].equals("*")){
        wrd=wrd+arr[x];
      }
    }
  }
  return wrd;
}
