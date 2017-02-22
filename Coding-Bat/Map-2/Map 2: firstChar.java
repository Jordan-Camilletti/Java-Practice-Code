/*Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, 
with the value of all the strings starting with that character appended together in the order they appear in the array.*/

public Map<String, String> firstChar(String[] strings) {
  Map<String ,String> map=new HashMap<String, String>();
  for(int x=0;x<strings.length;x++){
    if(map.containsKey((strings[x]).split("")[1])){//strings[x].split("")[1]==first letter of each string in the array
      map.put(strings[x].split("")[1], map.get(strings[x].split("")[1])+strings[x]);
    }else{
      map.put(strings[x].split("")[1], strings[x]);
    }
  }
  return map;
}
