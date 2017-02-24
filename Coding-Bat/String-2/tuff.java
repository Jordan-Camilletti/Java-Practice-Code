public String oneTwo(String str) {
  String arr[]=str.split("");
  String wrd="";
  for(int x=0;x<str.length();x+=3){
    wrd=arr[x+1]+arr[x+2]+arr[x];
  }
  return wrd;
}
