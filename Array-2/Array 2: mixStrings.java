/*Given two strings, a and b, 
create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.*/
public String mixString(String a, String b) {
  String wrd="";
  String aArr[]=a.split("");
  String bArr[]=b.split("");
  if(a.length()>b.length()){
    for(int x=0;x<bArr.length-1;x++){
      wrd=wrd+a.substring(x,x+1)+b.substring(x,x+1);
    }
    wrd=wrd+a.substring(bArr.length-1,aArr.length-1);
  }else{
    for(int x=0;x<aArr.length-1;x++){
      wrd=wrd+a.substring(x,x+1)+b.substring(x,x+1);
    }
    wrd=wrd+b.substring(aArr.length-1,bArr.length-1);
  }
  return wrd;
}
