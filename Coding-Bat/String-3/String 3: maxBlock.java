/*Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same.*/

public int maxBlock(String str) {
  String arr[]=str.split("");
  String current="XD";
  int tot=0;
  int top=0;
  for(int x=0;x<=str.length();x++){
    if(arr[x].equals(current)){
      tot=tot+1;
    }else{
      if(tot>=top){
        top=tot+1;
      }
      current=arr[x];
      tot=0;
    }
  }
  if(str.equals("")){
    return 0;
  }return top;
}
