/*Given an array of non-empty strings, 
create and return a Map<String, String> as follows:
for each string add its first character as a key with its last character as the value.*/

public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for(int x=0;x<strings.length;x++){
    map.put(strings[x].substring(0,1), strings[x].substring(strings[x].length()-1,strings[x].length()));
  }
  return map;
}
