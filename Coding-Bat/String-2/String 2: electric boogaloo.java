public boolean xyzMiddle(String str) {
  String[] arr=str.split("xyz");
  if((arr.length==0 || arr.length==1)&&str.equals("xyz")==false) return false;
  if(str.equals("xyz")) return true;
  return true;
  
}
