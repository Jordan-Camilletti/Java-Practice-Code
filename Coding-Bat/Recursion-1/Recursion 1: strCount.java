/**/

public int strCount(String str, String sub) {
  if(str.length()<sub.length()) return 0;
  else if(str.length()==sub.length()&&str.equals(sub)) return 1;
  if(str.substring(0,sub.length()).equals(sub)) return 1+strCount(str.substring(sub.length(),str.length()),sub);
  return strCount(str.substring(1,str.length()),sub);
}
