/*Given an array of strings, return a Map<String, Boolean> 
where each different string is a key and its value is true if that string appears 2 or more times in the array.*/

public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map=new HashMap<String, Boolean>();
  for(int x=0;x<strings.length;x++){
    if(map.containsKey(strings[x])){
      map.put(strings[x],true);
    }else{
      map.put(strings[x],false);
    }
  }
  return(map);
}
